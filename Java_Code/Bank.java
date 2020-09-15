package Java_Code; //Made by Spandan Ghosh

//Available at https://github.com/spandu500/Playground/tree/master/Java_Code/Bank.java

import java.util.Scanner;

public class Bank {

    public static double balance, interestRate;
    public static String name, address, appNumber, phone;
    public static final String SEPERATOR = "*******************************************************************************";
    public static final Scanner sc = new Scanner(System.in);

    static void deposit() {
        double depositAmount = 0.0;
        System.out.println(Bank.SEPERATOR);
        System.out.println("Account Balance is " + Bank.balance);
        int flag = 0;
        do {
            System.out.print("Enter Amount to Deposit :");
            depositAmount = sc.nextDouble();
            if (depositAmount < 0) {
                System.out.println("Withdawal amount can't be negative!!");
                continue;
            }
            flag++;
        } while (flag == 0);
        Bank.balance += depositAmount;
        System.out.println("Amount Deposited...");
        System.out.println("Balance Amount after Deposit : " + Bank.balance);
        System.out.println(Bank.SEPERATOR);
    }

    static void withdraw() {
        double withdrawAmount = 0.0;
        System.out.println(Bank.SEPERATOR);
        System.out.println("Account Balance is " + Bank.balance);
        int flag = 0;
        do {
            System.out.print("Enter Amount to Withdraw :");
            withdrawAmount = sc.nextDouble();
            if (withdrawAmount < 0) {
                System.out.println("Withdawal amount can't be negative!!");
                continue;
            }
            if (withdrawAmount > Bank.balance) {
                System.out.println("Withdawal amount can't be greater than " + Bank.balance);
                continue;
            }
            flag++;
        } while (flag == 0);
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
        int flag = 0;
        do {
            System.out.print("Enter the Time Period in Years : ");
            int timePeriod = sc.nextInt();
            double compInt = (Bank.balance * (Math.pow((1 + Bank.interestRate / 100), timePeriod))) - Bank.balance;
            System.out.println("The Compound Interest is : " + compInt);
            System.out.println(
                    "To confirm changes and add the interest ammount to balance Enter C, To Re-Enter no of months press any other key: ");
            char ciopt = sc.next().charAt(0);
            if (ciopt == 'c' || ciopt == 'C') {
                Bank.balance += compInt;
                System.out.println("Added Interest Final Amount is " + Bank.balance);
                flag++;
            }
        } while (flag == 0);
    }

    static void createAccount() {
        System.out.println(Bank.SEPERATOR);
        System.out.print("Enter your full name : ");
        sc.nextLine(); // line seperator buffer
        Bank.name = sc.nextLine();
        System.out.println("Enter your Address Below...");
        Bank.address = sc.nextLine();
        boolean result;
        do {
            System.out.print("Enter your Contact Number : ");
            Bank.phone = sc.next();
            String regex = "\\d{10}"; // regex to test 10 digits
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

    static void displayBalance() {
        System.out.println(Bank.SEPERATOR);
        System.out.println("Hello " + Bank.name);
        System.out.println("Your Application No is " + Bank.appNumber);
        System.out.println("Your Bank Balance is " + Bank.balance);
        System.out.println("Your Registered Phone No is " + Bank.phone);
        System.out.println("You Currently live at " + Bank.address);
        System.out.println("Thank You For using Java Bank");
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
            System.out.println("4: Compute Interest");
            System.out.println("5: Display Account Info");
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
                    Bank.computeInterest();
                    break;
                case 5:
                    if (Bank.name == null) {
                        System.out.println("Account Not Initialized!!!");
                        continue;
                    }
                    Bank.displayBalance();
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