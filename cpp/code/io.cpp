#include <iostream>
#include <fstream>
#include <string>
#include <list>
#include <regex> 

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

    list<list<string>> read(){
        fstream file;
        list<list<string>> lines;
        file.open(inFile, ios::in);
        if (file.is_open()){
            string line;
            while(getline(file, line)){
                lines.push_back(splitString(line));
            }
            file.close();
        }
        return lines;
    }

    void write(list<list<string>> lines) {
        fstream file;
        file.open(outFile, ios::out);
        if (file.is_open()){
            for (list<string> line : lines) {
                const char *padding = "";
                for (string word : line) {
                    file << padding << word;
                    padding = " ";
                }
                file << endl;
            }
        }
        file.close();
    }

    void write(string line) {
        fstream file;
        file.open(outFile, ios::out);
        if (file.is_open()){
            file << line << endl;
        }
        file.close();
    }

private:
    list<string> splitString(string s) {
        regex space_regex("\\s+");
        sregex_token_iterator iter(s.begin(), s.end(), space_regex, -1);
        sregex_token_iterator end;

        list<string> words;
        while (iter != end)  {
            words.push_back(*iter);
            iter++;
        }
        return words;
    }
};