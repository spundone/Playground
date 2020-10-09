#include <iostream>
using namespace std;

class car
{
public:
    virtual void speed()
    {
        cout << "ordinary car: Maximum speed limit  is 200kmph\n";
    }
};
class sports_car : public car
{
    void speed()
    {
        cout << "Sports car: Maximum speed is 300kmph\n";
    }
};

int main()
{
    car *ptr, car_obj;        // creating object and pointer to car
    sports_car sport_car_obj; //creating object of sport_car
    ptr = &sport_car_obj;     // assigining address of sport_car to pointer object of car
    ptr->speed();             // it will call function of sports_car

    return 0;
}