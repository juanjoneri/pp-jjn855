#include <iostream>
#include <string>
#include <regex>
#include "cell.cpp"

using namespace std;

enum Operation {EQ, NEQ, GT, LT};

class Condition {
    Operation op;
    string col;
    Cell *constant;

public:

    Condition() {
        // nop
    }

    ~Condition() {
        delete constant;
    }

    explicit Condition(string* value) {
        op = getOp(value);

        regex comma_regex(",");
        sregex_token_iterator iter(value->begin(), value->end(), comma_regex, -1);
        sregex_token_iterator end;
        int part = 0;
        while (iter != end)  {
            if (part >= 2) {
                cout << "COND ERROR" << endl;
                exit(1);
            }
            string operand = *iter;
            if ((operand.rfind("@", 0) == 0) || (operand.rfind("$", 0) == 0)) {
                operand.erase(0,1);
                col = operand;
            } else {
                constant = new Cell(operand);
            }
            iter++;
            part++;
        }
        if ((constant == NULL) || (col.compare("") == 0)) {
            cout << "COND ERROR" << endl;
            exit(1);
        }
    }

    void print() {
        cout << "Condition:" <<endl;
        cout << "\t- op:" << op << endl;
        cout << "\t- col:" << col << endl;
        cout << "\t- constant:" << constant->getValue() << endl;
    }

private:

    Operation getOp(string* value) {
        if (value->rfind("==", 0) == 0) {
            value->erase(0, 2);
            return EQ;
        }
        if (value->rfind("<>", 0) == 0) {
            value->erase(0, 2);
            return NEQ;
        }
        if (value->rfind(">", 0) == 0) {
            value->erase(0, 1);
            return GT;
        }
        if (value->rfind("<", 0) == 0) {
            value->erase(0, 1);
            return LT;
        }
        cout << "COND ERROR" << endl;
        exit(1);
    }
    
};