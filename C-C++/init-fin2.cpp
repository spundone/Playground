#include <iostream>
#include <string>
using namespace std;
class Car
{
private:
    string brand;
    string model;
    string color;
    string fuel;
    double cost;
    float mileage;

public:
    Car()
    {
        cout << "Default Initialization" << endl;
        brand = "Honda";
        model = "Civic";
        color = "red";
        fuel = "Petrol";
        cost = 550000;
        mileage = 15;
    }

    Car(string b, string m, string c, string f, double co, float mil)
    {
        cout << "Parameterized Initialization" << endl;
        brand = b;
        model = m;
        color = c;
        fuel = f;
        cost = co;
        mileage = mil;
    }

    Car(Car &cpy)
    {
        cout << "Copy Initialization" << endl;
        brand = cpy.brand;
        model = cpy.model;
        color = cpy.color;
        fuel = cpy.fuel;
        cost = cpy.cost;
        mileage = cpy.mileage;
    }

    void putData(string b, string m, string c, string f, double co, float mil)
    {
        brand = b;
        model = m;
        color = c;
        fuel = f;
        cost = co;
        mileage = mil;
    }

    void displayData()
    {
        cout << "*******Car Info******" << endl;
        cout << "Brand: " << brand << endl;
        cout << "Model: " << model << endl;
        cout << "Color: " << color << endl;
        cout << "Fuel: " << fuel << endl;
        cout << "Cost: " << cost << endl;
        cout << "Mileage: " << mileage << endl;
    }

    ~Car()
    {
        cout << "Shutting down (Finalized)" << endl;
    }
};

int main()
{
    Car car1, car2("Maruti", "Alto", "Silver", "Diesel", 350000, 28.5), car3, car4 = car2;
    car3.putData("Skoda", "Laura", "Silver", "Petrol", 1050000, 20);
    car1.displayData();
    car2.displayData();
    car3.displayData();
    car4.displayData();
    return 0;
}