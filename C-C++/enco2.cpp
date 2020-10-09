#include <iostream>
using namespace std;

class Rectangle
{
	int length;
	int breadth;
	public:
		void setDimension(int l, int b)
		{
			length = l;
			breadth = b;
		}
		int getArea()
		{
			return length * breadth;
		}
};

int main()
{
	Rectangle rt;
    int templ,tempb;
    cout << "Enter Length of the rectangle: ";
    cin>>templ;
    cout << "Enter Breadth of the rectangle: ";
    cin>>tempb;
	rt.setDimension(templ,tempb);
	cout << rt.getArea() << endl;
	return 0;
}