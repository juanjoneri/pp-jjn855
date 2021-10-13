#include <iostream>
#include <list>
#include "cell.cpp"

using namespace std;

class Matrix {
    list<Cell> header;
    list<list<Cell>> cells;

public:

    Matrix() {
        // nop
    }

    Matrix(list<list<string>> lines, bool hasHeader) {
        int cols = lines.front().size();
        if (hasHeader) {
            for (string h : lines.front()) {
                Cell *h_cell = new Cell(h, TYPE_STRING);
                header.push_back(*h_cell);
            }
            lines.pop_front();
        }
        for (list<string> row : lines) {
            if (row.size() != cols) {
                cout << "NUM COLS ERROR" << endl;
                exit(1);
            }
            list<Cell> new_row = {};
            for (string value : row) {
                Cell *new_cell = new Cell(value);
                new_row.push_back(*new_cell);
            }
            cells.push_back(new_row);
        }
    }

    void print() {
        if (!header.empty()) {
            printRow(header);
        }
        for (list<Cell> row : cells) {
            printRow(row);
        }
    }
private:
    void printRow(list<Cell> row) {
        const char *padding = "";
        for (Cell cell : row) {
            cout << padding << cell.getType() << "=" << cell.getValue();
            padding = " ";
        }
        cout << endl;
    }

};