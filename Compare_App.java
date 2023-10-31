/** @author: Hard Joshi
 * @version: 23.10.2023
 */
import java.util.*;

// This program is designed to make the Compare App

public class Compare_App
{
    public static void main(String args[])
    {
            int num1, num2;

            Scanner kbd = new Scanner(System.in);

        System.out.println("*** Compare_App ***");
        System.out.print("\n" + "Enter the First Number: ");

            num1 = kbd.nextInt();

                //This allows the user to input the values for num1 variable

        System.out.print("Enter the Second Number: ");

            num2 = kbd.nextInt();

                    //This allows the user to input the values for num1 variable

                if ( num1 == num2 )
                {
                    System.out.println("\n" + "The Numbers ARE Equal!");
                }
                else
                {
                    System.out.println("\n" + "The Numbers are NOT Equal!");
                   
                        // Here the if-else selector has been nested to further specify which number is greater

                    if (num1 > num2)
                        {
                            System.out.println("\n" + "Number_1" + " (" + num1 + ") " + "is GREATER than Number_2" + " (" + num2 + ") !");
                        }
                    else
                        {
                            System.out.println("\n" + "Number_2" + " (" + num2 + ") " + "is GREATER than Number_1" + " (" + num1 + ") !");
                        }
                }
        System.out.println("\n" + "\n" + "-- THE PROGRAM HAS ENDED ! --");

            kbd.close();

                //Closing the Scanner class
    }
}