#include <iostream>
using namespace std;
class Line
{
public:
    void setLength(double len);
    double getLength(void);
    Line();  // constructor declaration
    ~Line(); // destructor declaration

private:
    double length;
};

// functions definitions including constructor
Line::Line(void)
{
    cout << "Object is being initialized" << endl;
}
Line::~Line(void)
{
    cout << "Object is being finalized" << endl;
}
void Line::setLength(double len)
{
    length = len;
}
double Line::getLength(void)
{
    return length;
}

// Main function for the program
int main()
{
    Line line;
    double length;
    cout << "Enter Length: ";
    cin >> length;
    line.setLength(length);
    cout << "Length of line : " << line.getLength() << endl;
    return 0;
}