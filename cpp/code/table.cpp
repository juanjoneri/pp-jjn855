#include "io.cpp"
#include "matrix.cpp"

using namespace std;

int main() {

    string *s = new string(">-2.00000,$1");
    Condition *cond = new Condition(s);

    FileReader *file_reader = new FileReader("../tests/0.txt", "../tests/0.out");

    Matrix *matrix = new Matrix(file_reader->read(), true);

    file_reader->write(matrix->filterRows(cond));

    return 0;
}
