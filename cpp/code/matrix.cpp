#include <iostream>
#include <list>
#include "cell.cpp"

using namespace std;

class Matrix {
    list<list<Cell*>> cells;
    bool hasHeader;
    int rows;
    int cols;

public:

    Matrix() {
        // nop
    }

    ~Matrix() {
        for (list<Cell*> row : cells) {
            for (Cell *cell : row) {
                delete cell;
            }
            row.clear();
        }
        cells.clear();
    }

    Matrix(list<list<string>> lines, bool hasHeader) : hasHeader(hasHeader) {
        rows = lines.size();
        if (rows == 0) {
            cols == 0;
            return;
        }
        cols = lines.front().size();
        if (hasHeader) {
            rows -= 1;
        }
        for (list<string> row : lines) {
            if (row.size() != cols) {
                cout << "NUM COLS ERROR" << endl;
                exit(1);
            }
            list<Cell*> new_row = {};
            for (string value : row) {
                Cell *new_cell = new Cell(value);
                new_row.push_back(new_cell);
            }
            cells.push_back(new_row);
        }
    }

    list<list<string>> filterCols(list<int> cols) {
        cols.sort();
        list<list<string>> lines;
        for (int row = 0; row < rows + hasHeader; row++) {
            list<string> new_row = {};
            for (int col : cols) {
                new_row.push_back(get(row, col)->getValue());
            }
            lines.push_back(new_row);
        }
        return lines;
    }

    list<list<string>> filterRows(list<int> rows) {
        if (hasHeader) {
            rows.push_front(-1); // Index of the header
        }
        rows.sort();
        list<list<string>> lines;
        for (int row : rows) {
            row = row + hasHeader;
            list<string> new_row = {};
            for (int col = 0 ; col < cols ; col++) {
                new_row.push_back(get(row, col)->getValue());
            }
            lines.push_back(new_row);
        }
        return lines;
    }

    float sum(int col) {
        float sum = 0;
        for (int row = hasHeader; row < rows + hasHeader; row++) {
            Cell *cell = get(row, col);
            if (!cell->isNumeric()) {
                cout << "TYPE ERROR" << endl;
                exit(1);
            }
            sum += cell->getNumeric();
        }
        return sum;
    }

    // For debugging to quickly check the contents of the matrix
    void print() {
        for (list<Cell*> row : cells) {
            printRow(row);
        }
    }

private:
    void printRow(list<Cell*> row) {
        const char *padding = "";
        for (Cell *cell : row) {
            cout << padding << cell->getType() << "=" << cell->getValue();
            padding = " ";
        }
        cout << endl;
    }

    // Gets the exact cell, with row 0 returning headers
    Cell* get(int row, int col) {
        if (col >= cols) {
            cout << "COL INDEX ERROR" << endl;
            exit(1);
        }
        if (row >= rows + hasHeader) {
            cout << "ROW INDEX ERROR" << endl;
            exit(1);
        }
        int r = 0;
        for (list<Cell*> current_row : cells) {
            if (r == row) {
                int c = 0;
                for (Cell *cell : current_row) {
                    if (c == col) {
                        return cell;
                    }
                    c++;
                }
            }
            r++;
        }
        exit(0);
    }

};