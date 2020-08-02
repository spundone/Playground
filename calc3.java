import java.util.Scanner;               //MADLAD Edition FUNCTION Overloaded
public class calc3 {
    static double calc(double a)
    {
        System.out.println("Enter Second Number");
        Scanner s = new Scanner(System.in);
        double b = s.nextDouble();
        System.out.println(a +"+"+b+"=");
        s.close();
        return a+b;
    }
    static void calc()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = s.nextDouble();
        System.out.println("Enter Second Number");
        double b = s.nextDouble();
        System.out.println(a +"-"+b+"="+(a-b));
        s.close();
    }
    static void calc(double a, double b, char c)
    {
        System.out.println(a +"*"+b+"="+(a*b));
    }
    static double calc(double a, double b)
    {
        return a/b;
    }
    static void calc(char c)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = s.nextDouble();
        System.out.println("Enter Second Number");
        double b = s.nextDouble();
        System.out.println(a +"%"+b+"="+(a%b));
        s.close();
    } 
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Calc3 🤣");
        System.out.println("Choose Your Option");
        System.out.println("1. To Add Numbers");
        System.out.println("2. To Subtract Numbers");
        System.out.println("3. To Multiply Numbers");
        System.out.println("4. To Divide Numbers");
        System.out.println("5. To Find Remainder");
        System.out.println("Enter your Choice: ");
        int option = s.nextInt();
        switch (option)
        {
            case 1:
            System.out.println("Enter First Number");
            double a = s.nextDouble();
            double res=calc(a);
            System.out.print(res);
            break;
            case 2:
            calc();
            break;
            case 3:
            System.out.println("Enter First Number");
            double am = s.nextDouble();
            System.out.println("Enter Second Number");
            double bm = s.nextDouble();
            calc(am, bm, 'a');
            break;
            case 4:
            System.out.println("Enter First Number");
            double ad = s.nextDouble();
            System.out.println("Enter Second Number");
            double bd = s.nextDouble();
            double resd=calc(ad, bd);
            System.out.println(ad +"/"+ bd +"="+resd);
            break;
            case 5:
            calc('a');
            break;
            default:
            System.out.println("Error enter correct operator");
            s.close();
            return;
        }
        s.close();
    }
}