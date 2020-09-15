package Java;
import java.util.*;

public class Racer {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of racers participating: ");
        int count = s.nextInt();
        int racers[] = new int[count];
        for (int i = 0; i < count; i++)
        {
            System.out.print("Enter Speed of participant " +(i+1)+" : ");
            racers[i]=s.nextInt();
            if (racers[i]>10)
                System.out.println("Qualified");
            else
                System.out.println("Unqualified");
        }
        System.out.println("The Speed of racers are " + Arrays.toString(racers));
        s.close();
    }
}
