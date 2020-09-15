package Java_Code;       //Made by Spandan Ghosh
                        //Available at https://github.com/spandu500/Playground/tree/master/Java_Code/InvertStar.java
import java.util.Scanner;

public class InvertStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length of the pattern (n): ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) { // controls no of j prints indirectly (-)inverted order
            for (int j = 0; j < i; j++) { // prints current i no of stars
                System.out.print("* ");
            }
            System.out.println(); // prints newline
            sc.close();
        }
        int a = 3;
        int b = 1;
        int c = 2 + a * 5 - b;
        System.out.println(c);
    }
}