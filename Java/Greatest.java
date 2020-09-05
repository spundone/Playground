package Java;                               //Made by Spandan Ghosh
                                            //Available at https://github.com/spandu500/Playground/tree/master/Java/Greatest.java
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String gr8= " is the Greatest Number";
        System.out.println("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a>b)&&(a>c))
            System.out.println(a+gr8);
        else if (b>c)
            System.out.println(b+gr8);
        else
            System.out.println(c+gr8);
        sc.close();
    }
}