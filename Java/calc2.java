import java.util.Scanner;               //Used Functions with parameters

public class calc2 {
    double add(double a, double b) {
        System.out.println("Adding Two Numbers...");
        double res = a + b;
        return res;
    }

    double sub(double a, double b) {
        System.out.println("Subtracting Two Numbers...");
        double res = a - b;
        return res;
    }

    double mul(double a, double b) {
        System.out.println("Multiplying Two Numbers...");
        double res = a * b;
        return res;
    }

    double div(double a, double b) {
        System.out.println("Dividing Two Numbers...");
        double res = a / b;
        return res;
    }

    double rem(double a, double b) {
        System.out.println("Calculating Remainder...");
        double res = a % b;
        return res;
    }

    public static void main(String[] args) {
        double a, b, res;
        int flag = 0;
        char loption;
        Scanner s = new Scanner(System.in);
        calc2 cx = new calc2();
        System.out.print("Enter 2 numbers: ");
        a = s.nextDouble();
        b = s.nextDouble();
        do
        { 
        System.out.print("Enter an operator (+, -, *, /,%): ");
        char op = s.next().charAt(0);
        //s.close();
        switch (op) {
            case '+':
                res=cx.add(a, b);
                break;
            case '-':
                res=cx.sub(a, b);
                break;
            case '/':
                res=cx.div(a, b);
                break;
            case '*':
                res=cx.mul(a, b);
                break;
            case '%':
                res=cx.rem(a, b);
                break;
            default:
            System.out.println("Error enter correct operator");
            return;
        }
        System.out.println(res);
        System.out.println("do you want to operate again on the result?(Y/N)");
        //Scanner sf = new Scanner(System.in);
        loption = s.next().charAt(0);
        if (loption == 'Y' || loption == 'y')
            {
                res = a;
                System.out.println("Enter Number:");
                b = s.nextDouble();
            }
        else 
        {
            flag ++;
            s.close();
            //sf.close();
        }
    }while(flag == 0);
    }
}