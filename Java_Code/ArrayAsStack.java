package Java_Code;           //Made by Spandan Ghosh
                            //Available at https://github.com/spandu500/Playground/tree/master/Java_Code/ArrayAsStack.java
import java.util.Scanner;

class ArrayAsStack {
    public static void main(String[] args) {
        int option = 0, top = -1;
        final String SEPERATOR = "------------------------------------------------";
        Scanner sc = new Scanner(System.in);
        System.out.println("*********ARRAY IMPLEMENTATION OF STACK*********");
        System.out.print("Enter The Size of the Array : ");
        int maxsize = sc.nextInt();
        int[] astack = new int[maxsize];
        System.out.println(SEPERATOR);
        while (option != 4) {
            System.out.println("Choose one from the below options...");
            System.out.println("1.Push Element\n2.Pop Element\n3.Show the Stack\n4.Exit");
            System.out.println(SEPERATOR);
            System.out.print("Enter your choice : ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    if (top == maxsize - 1)
                        System.out.println("Overflow !! of Elements Please Increase Size of Stack");
                    else {
                        System.out.print("Enter Value To Be Pushed : ");
                        int val = sc.nextInt();
                        top++;
                        astack[top] = val;
                        System.out.println("Item pushed on Top");
                        System.out.println(SEPERATOR);
                    }
                    break;
                case 2:
                    if (top == -1)
                        System.out.println("Underflow !! No Elements Left to Pop");
                    else {
                        top--;
                        System.out.println("Item popped from Top");
                        System.out.println(SEPERATOR);
                    }
                    break;
                case 3:
                    System.out.println("Printing stack elements .....");
                    System.out.println("The Size of the Stack is: " + maxsize);
                    if (top == -1)
                        System.out.println("Empty Stack");
                    for (int i = top; i >= 0; i--) {
                        System.out.println(i + ". Element is " + astack[i]);
                    }
                    System.out.println(SEPERATOR);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter valid choice ");
            }
        }
        sc.close();
    }
}