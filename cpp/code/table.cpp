#include "io.cpp"
#include "matrix.cpp"

using namespace std;

int main() {

    FileReader *file_reader = new FileReader("../tests/0.txt", "../tests/0.out");

    Matrix *matrix = new Matrix(file_reader->read(), true);

    Cell *target_cell = new Cell("-1");
    file_reader->write(matrix->filterRows(matrix->getLtRows(1, target_cell)));
    cout << endl << matrix->getCol("10.0") << endl;

    return 0;
}
