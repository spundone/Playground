import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter the empno");
        int empno = sc.nextInt();
        System.out.println("Enter the name of the employee");
        String empname = sc.next();
        System.out.println ("Enter the basic salary");
        int sal = sc.nextInt();
        double da = 0.70*sal , hra=0.30*sal , pf=0.10*sal;
        int cca=240 , pt=100;
        double gsal = sal + da + hra + cca + pt;
        double nsal = gsal - pf;
        System.out.println(" Name of the employee :"+empname);
        System.out.println(" Employee number :"+empno);
        System.out.println("Basic salary : "+sal);
        System.out.println("Gross salary :"+ gsal);
        System.out.println("Net salary :"+nsal);
        sc.close();
    }
}