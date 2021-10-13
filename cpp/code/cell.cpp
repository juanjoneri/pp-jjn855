#include <iostream>
#include <string>
#include <regex> 

using namespace std;

enum Type { TYPE_STRING, TYPE_INTEGER, TYPE_FLOAT };

class Cell {
    string value;
    Type type;

public:
    // Default constructor
    Cell() {
        // nop
    }

    explicit Cell(string value) : value(value) {
        regex int_regex("^[-+]?[0-9]+$");
        regex float_regex("^[-+]?[0-9]*\\.[0-9]*$");

        if (regex_match(value, int_regex)) {
            type = TYPE_INTEGER;
        } else if(regex_match(value, float_regex)) {
            type = TYPE_FLOAT;
        } else {      
            type = TYPE_STRING;
        }
    }

    explicit Cell(string value, Type type) : value(value), type(type) {}
    
    string getValue() { 
        return value; 
    }

    Type getType() { 
        return type; 
    }
};