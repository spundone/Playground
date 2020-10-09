#include <iostream>  
using namespace std;  
class Addition //base class
{  
    int a = 3;  
    int b = 55;  
    public:  
    int add()  
    {  
        int c = a+b;  
        return c;  
    }     
};  
class Display : private Addition  //derived class
{  
    public:  
    void display()  
    {  
        int result = add();  
        cout <<"Addition of a and b is : "<<result;  
    }  
};  
int main()  //main function
{  
   Display d;  
   d.display();  
    return 0;  
}