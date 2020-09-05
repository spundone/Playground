package Java;       //Made by Spandan Ghosh
                    //Available at https://github.com/spandu500/Playground/tree/master/Java/Salary.java
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee : ");
        String empname = sc.nextLine();
        System.out.print("Enter the employee no : ");
        String empno = sc.nextLine();
        System.out.print("Enter the basic salary : ");
        double bsal = sc.nextDouble();
        double da = 0.70 * bsal, hra = 0.30 * bsal, pf = 0.10 * bsal;
        int cca = 240, pt = 100;
        double gsal = bsal + da + hra + cca + pf + pt;
        double nsal = gsal - (cca + pf + pt);
        System.out.println("❶ Employee Name   : " + empname);
        System.out.println("❷ Employee Number : " + empno);
        System.out.println("❸ Basic Salary    : " + bsal);
        System.out.println("❹ Gross Salary    : " + gsal);
        System.out.println("❺ Net Salary      : " + nsal);
        sc.close();
    }
}