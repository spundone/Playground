package java;

import java.util.*; //Single Function But Looped
public class Calc 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        // reads the next double from the keyboard
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        int flag = 0;
        char loption;
        do
        {   
            System.out.print("Enter an operator (+, -, *, /,%): ");
            char op = sc.next().charAt(0);
            double result;

            switch(op)
            {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;
                case '%':
                    result = first % second;
                    break;
                // op doesn't match any case constant (+, -, *, /, %)
                default:
                    System.out.println("Error! op is not correct");
                return;
            }
            System.out.println(first + " " + op+ " "+ second + "=" + result);
            System.out.println("do you want to operate again on the result?(Y/N)");
            loption = sc.next().charAt(0);
            if (loption == 'Y' || loption == 'y')
                {
                    result = first;
                    System.out.println("Enter Number:");
                    second = sc.nextDouble();
                }
            else 
            {
                flag ++;
                sc.close();
            }
        }while(flag == 0);
    }
}