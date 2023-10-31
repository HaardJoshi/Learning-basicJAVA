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
        while (true)
        {
            System.out.print("\n" + "Enter length of square: ");
            length = sc.nextDouble();
            System.out.println("Perimeter = " + (4*length));
            
            while(true) {
		 System.out.print("Do you wish to enter another value? [y/n]: ");
		 yn = sc.next().charAt(0).toLowerCase();
		 if (yn =='y') {
                     break;
                 } else if(yn =='n') {
                     return;
                 }else {
                   System.out.println("INVALID INPUT!");
                 }
            }
        }

        System.out.println("\n" + "--THE PROGRAM HAS ENDED--");
        sc.close();
    }
 }
