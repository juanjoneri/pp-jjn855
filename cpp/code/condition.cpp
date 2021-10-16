#include <iostream>
#include <string>
#include <regex>
#include "cell.cpp"

using namespace std;

enum Operation {EQ, NEQ, GT, LT};
enum IndexType {UNSPECIFIED, COL_NAME, COL_NUM};

class Condition {
    Operation op;
    IndexType index_type;
    string col_name;
    int col_num;
    Cell *constant;

public:

    Operation getOp() {
        return op;
    }

    IndexType getIndexType() {
        return index_type;
    }

    string getColName() {
        return col_name;
    }

    int getColNum() {
        return col_num;
    }

    Cell* getConstant() {
        return constant;
    }

    Condition() {
        index_type = UNSPECIFIED;
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
            string operand = *iter;
            if (operand.rfind("@", 0) == 0) {
                operand.erase(0,1);
                col_name = operand;
                index_type = COL_NAME;
            } else if (operand.rfind("$", 0) == 0) {
                operand.erase(0,1);
                col_num = stoi(operand);
                index_type = COL_NUM;
            } else {
                constant = new Cell(operand);
            }
            iter++;
            part++;
        }
        if ((constant == NULL) || (index_type == UNSPECIFIED)) {
            cout << "COND ERROR" << endl;
            exit(1);
        }
    }

    void print() {
        cout << "Condition:" <<endl;
        cout << "  - op:" << op << endl;
        cout << "  - col_name:" << col_name << endl;
        cout << "  - col_num:" << col_num << endl;
        cout << "  - constant:" << constant->getValue() << endl;
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