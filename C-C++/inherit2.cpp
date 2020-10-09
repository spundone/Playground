#include <iostream>  
using namespace std;  
 //base class
 class Account {  
   public:  
   float salary = 60000;   
 };  
 //derived class
   class Programmer: public Account {  
   public:  
   float bonus = 9000;    
   };       
int main(void) {  
     Programmer p1;  
     cout<<"Salary: "<<p1.salary;    
     cout<<"\nBonus: "<<p1.bonus;    
    return 0;  
}  