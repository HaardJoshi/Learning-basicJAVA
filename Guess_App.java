/**@author: Hard Joshi
 * @version: 25.10.2023
 */
import java.util.*;

// This program is designed to make the Guess App

public class Guess_App
{
    public static void main(String args[])
    {
            int num1, num2, sum, sum1;

            Scanner kbd = new Scanner(System.in);

        System.out.println("*** Compare_App ***");
        System.out.print("\n" + "Enter the First Number: ");

            num1 = kbd.nextInt();

                    //This allows the user to input the values for num1 variable

        System.out.print("Enter the Second Number: ");

            num2 = kbd.nextInt();

                    //This allows the user to input the values for num1 variable
                
        System.out.print("\n" + "Guess the Sum: ");

            sum = kbd.nextInt();
            sum1 = num1 + num2;

        if ( sum == sum1 )
        {
            System.out.println("\n" + "CONGRATULATIONS!! You guessed the correct answer!");
        }
        else 
        {
            System.out.println("\n" + "Oops you guessed wrong! The correct answer is - " + sum1);
        }

            kbd.close();
    }
}
