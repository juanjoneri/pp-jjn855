#include <string>

using namespace std;

class Cell {
public:
    // Default constructor
    Cell() {}

    explicit Cell(string value) : value(value)
    {}
    
    string getValue() { return value; }

private:
    string value { "" };
};