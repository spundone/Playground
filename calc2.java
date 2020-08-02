import java.util.Scanner;

public class calc2 {
    static double add(double a, double b) {
        System.out.println("Adding Two Numbers...");
        double res = a + b;
        return res;
    }

    static double sub(double a, double b) {
        System.out.println("Subtracting Two Numbers...");
        double res = a - b;
        return res;
    }

    static double mul(double a, double b) {
        System.out.println("Multiplying Two Numbers...");
        double res = a * b;
        return res;
    }

    static double div(double a, double b) {
        System.out.println("Dividing Two Numbers...");
        double res = a / b;
        return res;
    }

    static double rem(double a, double b) {
        System.out.println("Calculating Remainder...");
        double res = a % b;
        return res;
    }

    public static void main(String[] args) {
        double a, b, res;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.print("Enter an operator (+, -, *, /,%): ");
        char op = s.next().charAt(0);
        s.close();
        switch (op) {
            case '+':
                res=add(a, b);
                break;
            case '-':
                res=sub(a, b);
                break;
            case '/':
                res=div(a, b);
                break;
            case '*':
                res=mul(a, b);
                break;
            case '%':
                res=rem(a, b);
                break;
            default:
            System.out.println("Error enter correct operator");
            return;
        }
        System.out.println(res);
        
    }
}