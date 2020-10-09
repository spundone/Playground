#include <iostream>
 
int add(int x, int y)
{
    return x + y;
}
 
int subtract(int x, int y)
{
    return x - y;
}
 
int multiply(int x, int y)
{
    return x * y;
}
 
int divide(int x, int y)
{
    return x / y;
}

int mod(int x, int y)
{
    return x % y;
}

int main()
{
    int x;
    std::cout << "Enter a number: ";
    std::cin >> x;
 
    int y;
    std::cout << "Enter another number: ";
    std::cin >> y;
 
    int op;
    do
    {
        std::cout << "Enter an operation (1=add, 2=subtract, 3=multiply, 4=divide, 5=remainder): ";
        std::cin >> op;
    } while (op < 1 || op > 5);
 
    // Create a function pointer named ans (yes, the syntax is ugly)
    int (*ans)(int, int) = nullptr;
 
    // Set ans to point to the function the user chose
    switch (op)
    {
        case 1: ans = add; break;
        case 2: ans = subtract; break;
        case 3: ans = multiply; break;
        case 4: ans = divide; break;
        case 5: ans = mod; break;
    }
 
    // Call the function that ans is pointing to with x and y as parameters
    // This uses late binding
    std::cout << "The answer is: " << ans(x, y) << std::endl;
 
    return 0;
}