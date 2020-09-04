package Java;       //Made by Spandan Ghosh
                    //Available at github.com/spandu500/playground/Java/Salary.java
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee : ");
        String empname = sc.nextLine();
        System.out.print("Enter the employee no : ");
        String empno = sc.nextLine();
        System.out.print("Enter the basic salary : ");
        Double sal = sc.nextDouble();
        double da = 0.70 * sal, hra = 0.30 * sal, pf = 0.10 * sal;
        int cca = 240, pt = 100;
        double gsal = sal + da + hra + cca + pt;
        double nsal = gsal - pf;
        System.out.println(" Name of the employee : " + empname);
        System.out.println(" Employee number : " + empno);
        System.out.println(" Basic salary    : " + sal);
        System.out.println(" Gross salary    : " + gsal);
        System.out.println(" Net salary      : " + nsal);
        sc.close();
    }
}