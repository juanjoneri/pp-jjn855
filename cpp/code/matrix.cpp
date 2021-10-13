#include <iostream>
#include <list>
#include "cell.cpp"

using namespace std;

class Matrix {
    list<list<Cell>> cells;

public:

    Matrix() {
        // nop
    }

    Matrix(int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            list<Cell> new_row = {};
            for (int col = 0; col < cols; col++) {
                Cell *new_cell = new Cell("1.0");
                new_row.push_back(*new_cell);
            }
            cells.push_back(new_row);
        }
    }

    void print() {
        for (list<Cell> row : cells) {
            const char *padding = "";
            for (Cell cell : row) {
                cout << padding << cell.getType() << "=" << cell.getValue();
                padding = " ";
            }
            cout << endl;
        }
    }

};