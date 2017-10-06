// **************************************************
//   DiceRoll.java
//
//   Rolls two random dice
// **************************************************
import java.util.Random;
public class DiceRoll
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int roll1;
        int roll2;
        int sum;
        
        roll1 = generator.nextInt(6) + 1;
        roll2 = generator.nextInt(6) + 1;
        sum = roll1 + roll2;
        System.out.println("First roll: " + roll1 + "\nSecond roll: " + roll2 + "\nSum: " + sum);
    }
}
