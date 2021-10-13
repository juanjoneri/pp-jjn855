#include "io.cpp"
#include "matrix.cpp"

using namespace std;

int main() {

    FileReader *file_reader = new FileReader("../tests/0.txt", "../tests/0.out");

    Matrix *matrix = new Matrix(file_reader->read(), false);

    list<int> rows = {0, 2};
    file_reader->write(matrix->filterCols(rows));

    return 0;
}
