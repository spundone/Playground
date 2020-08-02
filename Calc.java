import java.util.*;
public class Calc 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = sc.nextDouble();
        double second = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /,%): ");
        char op = sc.next().charAt(0);
        sc.close();
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
            // op doesn't match any case constant (+, -, *, /)
            default:
                System.out.println("Error! op is not correct");
                return;
       }
        System.out.printf("%.1f %c %.1f = %.1f", first, op, second, result);
        
    }
}