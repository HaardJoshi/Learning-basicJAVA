/** @author: Hard Joshi
 * @version: 18.10.2023
 * #Group - 8
 */
import java.util.Scanner;
public class Conversion_App 
{
    public static void main(String args[])
    {
        double pound, kilo;
        Scanner kbd = new Scanner (System.in);

        System.out.println("THE CONVERSION APP");
        System.out.print("\n" + "\n" + "Enter the value in lbs: ");
            
            pound = kbd.nextDouble();
            kilo = pound/2.2;

        System.out.println("\n" + pound + "lb(s) is Equal to " + kilo + "Kg(s)");
        System.out.println("\n" + "\n" + "--THE PROGRAM HAS ENDED --");

        kbd.close();
    }
}
