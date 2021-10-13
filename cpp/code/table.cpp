#include <iostream>
#include <string>
#include"matrix.cpp"

using namespace std;

int main() {
    Matrix *matrix = new Matrix(10, 10);

    matrix->print();
    return 0;
}
