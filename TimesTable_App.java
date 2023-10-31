/** @author: Hard Joshi
* @version: 30.10.2023
*/
import java.util.*;

public class TimesTable_App
{
    public static void main(String args[])
    {
        Scanner kbd = new Scanner(System.in);
        int table, multi;
        char yn;
        boolean notValid = true;
        
        System.out.println("TIMES-TABLE APP");
        do
        {
            System.out.print("\n" + "Enter the number for Table: ");
            table = kbd.nextInt();
                while(table > 100 || table < 2)
                {
                    System.out.println("INVALID INPUT!");
                    System.out.print("\n" + "Enter a valid number for Table: ");
                    table = kbd.nextInt();
                }
            System.out.print("Enter the number upto which you want Table: ");
            multi = kbd.nextInt();
                while(multi > 100 || multi < 2)
                {
                    System.out.println("INVALID INPUT!");
                    System.out.print("\n" + "Enter a valid number upto which you want Table: ");
                    multi = kbd.nextInt();
                }
        
                for(int x = 1; x<=multi ; x++)
                        
                        System.out.println(table + " x " + x + " = " + table*x);
                        System.out.print("Do you wish to enter another value? [y/n]: ");
                        yn = kbd.next().charAt(0);
 
                do
                {
                        if (yn == 'y' || yn == 'Y' || yn == 'n' || yn == 'N')
                        {
                            notValid = false;
                        }
                        else
                        {
                            System.out.println("INVALID INPUT!");
                            System.out.print("Do you wish to enter another value? [y/n]: ");
                            yn = kbd.next().charAt(0);
                        }
                }while(notValid);
    
            }while(yn=='y' || yn=='Y');

        System.out.println("\n" + "--THE PROGRAM HAS ENDED--");
        
            kbd.close();
    }
}
