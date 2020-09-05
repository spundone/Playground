package Java;   //Made by Spandan Ghosh
                //Available at https://github.com/spandu500/Playground/tree/master/Java/Bank.java
import java.util.Scanner;

public class Bank {

    public static double balance, interestRate;
    public static String name, address, appNumber, phone;
    public static final String SEPERATOR = "*******************************************************************************";
    public static final Scanner sc = new Scanner(System.in);


    static void deposit() {
        System.out.println(Bank.SEPERATOR);
        System.out.println("Account Balance is " + Bank.balance);
        System.out.print("Enter Amount to Deposit :");
        double depositAmount = sc.nextDouble();
        Bank.balance += depositAmount;
        System.out.println("Amount Deposited...");
        System.out.println("Balance Amount after Deposit : " + Bank.balance);
        System.out.println(Bank.SEPERATOR);
    }

    static void withdraw() {
        System.out.println(Bank.SEPERATOR);
        System.out.println("Account Balance is " + Bank.balance);
        System.out.print("Enter Amount to Withdraw :");
        double withdrawAmount = sc.nextDouble();
        Bank.balance -= withdrawAmount;
        System.out.println("Amount Withdrawed...");
        System.out.println("Balance Amount after Withdrawal : " + Bank.balance);
        System.out.println(Bank.SEPERATOR);
    }

    static void computeInterest() {
        if (Bank.balance < 100000)
            Bank.interestRate = 3.5;
        else
            Bank.interestRate = 4.5;
        System.out.println("Interest Rate is : " + Bank.interestRate + "%");
    }

    static void createAccount() {
        System.out.println(Bank.SEPERATOR);
        System.out.print("Enter your full name : ");
        Bank.name = sc.nextLine();
        System.out.println("Enter your Address Below...");
        Bank.address = sc.nextLine();
        boolean result;
        do {
            System.out.print("Enter your Contact Number : ");
            Bank.phone = sc.next();
            String regex = "\\d{10}";
            result = Bank.phone.matches(regex);
            if (result) {
                System.out.println("Given phone number is valid");
            } else {
                System.out.println("Given phone number is not valid");
            }
        } while (!result);
        System.out.print("Enter your Application number : ");
        Bank.appNumber = sc.next();
        System.out.println("Deposit Initial Account...");
        Bank.deposit();
        System.out.println("Account Created Sucesssfully");
        System.out.println(Bank.SEPERATOR);
    }

    public static void main(final String[] args) {
        int flag = 0;
        do {
            System.out.println(Bank.SEPERATOR);
            System.out.println("Welcome to the Java Bank");
            System.out.println("1: Open Account");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Display Account Info");
            System.out.println(Bank.SEPERATOR);
            System.out.println("Enter Your Choice");
            final int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Bank.createAccount();
                    break;
                case 2:
                    Bank.deposit();
                    break;
                case 3:
                    Bank.withdraw();
                    break;
                case 4:
                    System.out.println(Bank.SEPERATOR);
                    System.out.println("Hello " + Bank.name);
                    System.out.println("Your Application No is " + Bank.appNumber);
                    System.out.println("Your Bank Balance is " + Bank.balance);
                    System.out.println("Your Registered Phone No is " + Bank.phone);
                    System.out.println("You Currently live at " + Bank.address);
                    Bank.computeInterest();
                    System.out.println("Thank You For using Java Bank");
                    System.out.println(Bank.SEPERATOR);
                    break;
                default:
                    System.out.println("Error enter correct option");
            }
            System.out.println("Do You Want to Quit? (Press Y) Else Press any Char and Enter to Continue ");
            char opt = sc.next().charAt(0);
            if (opt == 'Y' || opt == 'y')
                flag++;
        } while (flag == 0);
    }
}