#include "io.cpp"
#include "matrix.cpp"

using namespace std;

int main() {

    FileReader *file_reader = new FileReader("../tests/1.txt", "../tests/1.out"); 

    for (string line : file_reader->read()) {
        cout << line << endl;
    }

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
