/** Author: Hard Joshi
* Version: 16.10.2023
*/
import java.util.Scanner;
public class Rectangle_App
{
  public static void main(String args[])
  {
    double length, height, area;
    Scanner sc = new Scanner (System.in);
    System.out.println("***RECTANGLE_APP***" + "\n");
    System.out.print("Enter Rectangle Length: ");
    length= sc.nextDouble();
    System.out.print("Enter Rectangle Height: ");
    height= sc.nextDouble();
    area=length*height;
    System.out.println("Area of the Rectangle = " + area + "\n");
    sc.close();
    System.out.print("--THE PROGRAM HAS ENDED--");
  }
}


