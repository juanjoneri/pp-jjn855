#include <iostream>
#include <fstream>
#include <string>
#include <list>

using namespace std;

class FileReader {
    string inFile;
    string outFile;

public:

    FileReader() {
        // nop
    }

    FileReader(string inFile, string outFile) : inFile(inFile), outFile(outFile) {}

    ~FileReader() {
        // nop
    }

    list<string> read(){
        fstream file;
        list<string> lines;
        file.open(inFile, ios::in);
        if (file.is_open()){
                string line;
                while(getline(file, line)){
                lines.push_back(line);
            }
            file.close();
        }
        return lines;
    }
};