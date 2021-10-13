#include "io.cpp"
#include "matrix.cpp"

using namespace std;

int main() {

    FileReader *file_reader = new FileReader("../tests/0.txt", "../tests/0.out");

    Matrix *matrix = new Matrix(file_reader->read(), false);

    Cell *target_cell = new Cell("a");
    file_reader->write(matrix->filterRows(matrix->getGtRows(1, target_cell)));

    return 0;
}
