#include <vector>
#include <list>
#include <regex>
#include "io.cpp"
#include "matrix.cpp"

using namespace std;

enum Mode {PRINT, SUM, WHEN};

Mode getMode(vector<string> args) {
    for (string arg : args) {
        if (arg.compare("-print") == 0) {
            return PRINT;
        }
        if (arg.compare("-sum") == 0) {
            return SUM;
        }
        if (arg.compare("-when") == 0) {
            return WHEN;
        }
    }
    cout << "OTHER ERROR" << endl;
    exit(1);
}

bool hasHeader(vector<string> args) {
    for (string arg : args) {
        if (arg.compare("-header") == 0) {
            return true;
        }
    }
    return false;
}

list<int> splitNums(string* value) {
    list<int> values;
    regex comma_regex(",");
    sregex_token_iterator iter(value->begin(), value->end(), comma_regex, -1);
    sregex_token_iterator end;
    while (iter != end)  {
        values.push_back(stoi(*iter));
        iter++;
    }
    return values;
}

int main(int argc, const char *argv[]) {

    vector<string> args;
    args.assign(argv + 1, argv + argc);

    bool has_header = hasHeader(args);
    Mode mode = getMode(args);
    if (args.size() < 4) {
        cout << "OTHER ERROR" << endl;
        exit(1);
    }

    string outFile = args.at(args.size() - 1);
    string inFile = args.at(args.size() - 2);
    string *data = new string(args.at(args.size() - 3));

    FileReader *file_reader = new FileReader(inFile, outFile);
    Matrix *matrix = new Matrix(file_reader->read(), has_header);

    switch (mode) {
        case PRINT:
            file_reader->write(matrix->filterCols(splitNums(data)));
            break;
        case SUM:
            file_reader->write(to_string(matrix->sum(stoi(*data))));
            break;
        case WHEN:
            Condition *cond = new Condition(data);
            file_reader->write(matrix->filterRows(cond));

    }

    return 0;
}

