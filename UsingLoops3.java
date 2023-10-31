/** ACTIVITY
 *  Modify this code by using a 'do while' loop
 *  to allow the user to run this program
 *  as many time as they wish
 */

 import java.util.*;

 public class UsingLoops3 
 {
     public static void main(String args[]) 
    {
        double length;
        char yn;
        Scanner sc = new Scanner (System.in);
        
            // PUT THE CODE BELOW IN A DO WHILE LOOP
        do
        {
            System.out.print("\n" + "Enter length of square: ");
            length = sc.nextDouble();
            System.out.println("Perimeter = " + (4*length));
            System.out.print("Do you wish to enter another value? [y/n]: ");
            yn = sc.next().charAt(0);
            
            boolean notValid = true;
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
                    yn = sc.next().charAt(0);
                }
            }while(notValid);
        }while(yn=='y' || yn=='Y');

        // WRITE CODE TO ASK IF USER WISHES TO RE-RUN
        System.out.println("\n" + "--THE PROGRAM HAS ENDED--");
        sc.close();
    }
 }
