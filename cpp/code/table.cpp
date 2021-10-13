#include <iostream>
#include <string>
#include"matrix.cpp"

using namespace std;

int main() {

    list<list<string>> values = {
        {"1", "2", "3"},
        {"9", "b", "c"},
        {"3.0", "0.1", "0.002"}
    };

    list<int> cols = {0, 1};

    Matrix *matrix = new Matrix(values, false);

    matrix->print(cols);
    cout << matrix->sum(0);
    return 0;
}
