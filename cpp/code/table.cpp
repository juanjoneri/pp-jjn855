#include <iostream>
#include <string>
#include"matrix.cpp"

using namespace std;

int main() {

    list<list<string>> values = {
        {"1", "2", "3"},
        {"a", "b", "c"},
        {"1.0", "0.1", "0.002"}
    };

    Matrix *matrix = new Matrix(values, true);

    matrix->print();
    return 0;
}
