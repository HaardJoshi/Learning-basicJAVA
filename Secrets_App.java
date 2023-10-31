/**@author: Hard Joshi
 * @version: 25.10.2023
 */
import java.util.*;

// This program is designed to make the Secrets App

public class Secrets_App 
{
    public static void main(String args[])
    {
            int lvl;
            String a, b, c;

                //I have established three strings to make the program code look cleaner and more organised 

            Scanner kbd = new Scanner(System.in);

        System.out.println("*** 'WELCOME', Says Bond . . . JAMES BOND ***");
        System.out.print("\n" + "Enter your security level: ");

            lvl = kbd.nextInt();

            a = "The Security guard is a Robot";
            b = "There is a secret room in the basement";
            c = "The cook is an Alien";

                    //The switch command will help to reveal only the necessary information and hold out the rest as per user Levels.

                switch(lvl)
                {
                    case 1: System.out.println("\n" + "\n" + a);
                            break;
                    case 2: System.out.println("\n"  + "\n" + "[A] " + a);
                            System.out.println("[B] " + b);
                            break;
                    case 3: System.out.println("\n" + "\n" + "[A] " + a);
                            System.out.println("[B] " + b);
                            System.out.println("[C] " + c);
                            break;
                    default: System.out.println("\n" + "\n" + "NO SUCH LEVEL");
                }
                
                    //The default command will ensure that only the specified fields provide the given outputs

        System.out.println("\n" + "\n" + "--- ALL THE SECRETS HAVE BEEN REVALED ---");

            kbd.close();

                //Closing the Scanner class
    }
}
