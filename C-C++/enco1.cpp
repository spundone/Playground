#include<iostream> 
using namespace std; 

class enco1
{ 
	private:    //data hidden from user
		int x; 
		
	public: 
		void set(int a) //data accesible to the user
		{ 
			x = a; 
		} 
		
		int get() 
		{ 
			return x; 
		} 
}; 
int main() 
{ 
	enco1 o1;   //Object of class
    o1.set(694);//q1.x=694 will give error as it's not accesible
	cout<<o1.get(); //will print 694
	return 0; 
} 
