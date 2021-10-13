#include <iostream>
#include <string>
#include"cell.cpp"

using namespace std;

int main() {
    Cell *cell = new Cell("jamon");

    cout << cell->getValue() << endl;
    return 0;
}
