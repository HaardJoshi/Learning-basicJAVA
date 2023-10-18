/**@author: Hard Joshi
 * @version: 16.10.2023
 */
import java.util.*;
public class Circle_App 
{
    public static void main(String args[]) 
    {
      double radius, dia, peri, area;
      Scanner kbd = new Scanner (System.in);
      final double pi = 3.14;
      System.out.println("CIRCLE_APP");
      System.out.print("\n" + "\n" + "Enter the radius of the Circle: ");
      radius = kbd.nextDouble();
      dia = 2*radius;
      System.out.println("\n" + "Diameter of the Circle = " + dia);
      peri = 2*pi*radius;
      System.out.println("\n" + "Perimeter of the Circle = " + peri);
      area = pi*radius*radius;
      System.out.println("\n" + "Area of the Circle = " + area + "\n");
      kbd.close();
      System.out.println("--THE PROGRAM HAS ENDED--");
    }
}

