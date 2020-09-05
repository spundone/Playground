package Java;                            //Made by Spandan Ghosh
                                        //Available at https://github.com/spandu500/Playground/tree/master/Java/Calc3.java
import java.util.Scanner;              //MADLAD Edition FUNCTION Overloaded
public class Calc3 {
    double calc(double a)
    {
        System.out.println("Enter Second Number");
        Scanner s = new Scanner(System.in);
        double b = s.nextDouble();
        System.out.println(a +"+"+b+"=");
        s.close();
        return a+b;
    }
    void calc()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = s.nextDouble();
        System.out.println("Enter Second Number");
        double b = s.nextDouble();
        System.out.println(a +"-"+b+"="+(a-b));
        s.close();
    }
    void calc(double a, double b, char c)
    {
        System.out.println(a +"*"+b+"="+(a*b));
    }
    double calc(double a, double b)
    {
        return a/b;
    }
    void calc(char c)
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
        //int flag = 0;
        //char loption;
        Calc3 cx = new Calc3();
        Scanner s = new Scanner(System.in);
        //do{
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
            double res=cx.calc(a);
            System.out.print(res);
            break;
            case 2:
            cx.calc();
            break;
            case 3:
            System.out.println("Enter First Number");
            double am = s.nextDouble();
            System.out.println("Enter Second Number");
            double bm = s.nextDouble();
            cx.calc(am, bm, 'a');
            break;
            case 4:
            System.out.println("Enter First Number");
            double ad = s.nextDouble();
            System.out.println("Enter Second Number");
            double bd = s.nextDouble();
            double resd=cx.calc(ad, bd);
            System.out.println(ad +"/"+ bd +"="+resd);
            break;
            case 5:
            cx.calc('a');
            break;
            default:
            System.out.println("Error enter correct operator");
            s.close();
            return;
        }
       /* System.out.println("do you want to operate again on the result?(Y/N)");
            loption = s.next().charAt(0);
            if (loption == 'Y' || loption == 'y')
                {
                    result = first;
                    System.out.println("Enter Number:");
                    second = s.nextDouble();
                }
            else 
            {
                flag ++;
                s.close();
            }
        }while(flag == 0);*/
        s.close();
    }
}