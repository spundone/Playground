import java.util.Scanner;

class HCF_LCMRecursive{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("First number: ");
        int a = s.nextInt();
        System.out.print("Second number: ");
        int b = s.nextInt();
        int hcf = gcd(a, b);//calling gcd function
        int lcm = a * b / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
    public static int gcd(int p, int q){//greatest common divisor
        if(q == 0)
            return p;
        return gcd(q, p % q);//recursive call
    }
}