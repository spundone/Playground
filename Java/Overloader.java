package Java;                               //Made by Spandan Ghosh
import java.util.Scanner;                   //Available at https://github.com/spandu500/Playground/tree/master/Java/Overloader.java

public class Overloader { 
  
    public int area(int s) {
        return (s * s);
    }
    public int area(int l, int b) { 
        return (l * b); 
    } 
  
    public int area(int l, int b, int h) { 
        return ((2*l*b) + (2*b*h) + (2*h*l)); 
    } 
    public static void main(String args[]) 
    { 
        Overloader o = new Overloader(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side of square : ");
        int s = sc.nextInt(); 
        System.out.println("The area of square with side "+s+" is " +o.area(s)+" sq units"); 
        System.out.print("Enter the length of rectangle    : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of rectangle   : ");
        int b = sc.nextInt();
        System.out.println("The area of rectangle with length "+l+" and breadth "+b+" is " +o.area(l, b)+" sq units");
        System.out.print("Enter the length of cuboid    : ");
        int lc = sc.nextInt();
        System.out.print("Enter the breadth of cuboid   : ");
        int bc = sc.nextInt();
        System.out.print("Enter the height of cuboid    : ");
        int hc = sc.nextInt();
        System.out.println("The surface area of cubeoid with length "+lc+", breadth "+bc+" and height "+hc+" is " +o.area(lc, bc, hc)+" sq units"); 
        sc.close();
    } 
} 