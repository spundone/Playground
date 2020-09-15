package Java_Code;                            //Made by Spandan Ghosh
import java.util.*;                          //Available at https://github.com/spandu500/Playground/tree/master/Java_Code/Racer.java

public class Racer {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of racers participating: ");
        int count = s.nextInt();
        int racers[] = new int[count];
        int sum = 0;
        for (int i = 0; i < count; i++)
        {
            System.out.print("Enter Speed of participant " +(i+1)+" : ");
            racers[i]=s.nextInt();
            sum+=racers[i];
        }
        int average = sum/count;
        System.out.println("Average Speed of racers is " + average);
        for (int i=0; i < count; i++){
            if (racers[i] > average)
                System.out.println("Racer "+i+" Qualifies with a speed of " + racers[i]);
        }
        s.close();
    }
}