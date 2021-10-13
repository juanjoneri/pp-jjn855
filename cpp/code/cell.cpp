#include <iostream>
#include <string>
#include <regex> 
#include <cmath> 

using namespace std;

enum Type { TYPE_STRING, TYPE_INTEGER, TYPE_FLOAT };

class Cell {
    string value;
    Type type;

public:

    Cell() {
        // nop
    }

    ~Cell() {
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

    explicit Cell(float f) {
        if (floor(f) == f) {
            type = TYPE_INTEGER;
        } else {
            type = TYPE_FLOAT;
        } 
        value = to_string(f);
    }


    explicit Cell(string value, Type type) : value(value), type(type) {}
    
    string getValue() { 
        return value; 
    }

    Type getType() { 
        return type; 
    }

    bool isNumeric() {
        return (type == TYPE_INTEGER) || (type == TYPE_FLOAT);
    }

    float getNumeric() {
        return stof(value);
    }

    bool eq(Cell* other) {
        if (isNumeric() && other->isNumeric()) {
            return getNumeric() == other->getNumeric();
        }
        if (!isNumeric() && !other->isNumeric()) {
            return getValue().compare(other->getValue()) == 0;
        }
        return false;
    }

    bool neq(Cell* other) {
        return !eq(other);
    }

    bool gt(Cell* other) {
        if (isNumeric() && other->isNumeric()) {
            return getNumeric() > other->getNumeric();
        }
        if (!isNumeric() && !other->isNumeric()) {
            return getValue().compare(other->getValue()) > 0;
        }
        return false;
    }

    bool lt(Cell* other) {
        if ((isNumeric() && other->isNumeric()) || (!isNumeric() && !other->isNumeric())) {
            return !gt(other) && !eq(other);
        }
        return false;
    }
};