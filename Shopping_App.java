import java.util.*;
/** ACTIVITY
 *  Modify this code by using an 'if' statement
 *  so the tax is reduced by 50% when the inital cost
 *  of the product is greater than 100
 */
 
public class Shopping_App 
{
    public static void main(String args[]) 
    {
            double initialPrice, tax, total;
	        Scanner sc = new Scanner(System.in);

	    System.out.println("*** Product Price Check ***");
	    System.out.print("Enter initial price: "); 
	        
            initialPrice = sc.nextDouble(); 

        System.out.print("Enter tax rate: "); 
	        
            tax = sc.nextDouble(); 		
            total = initialPrice * (1 + tax/100); 
        
        if ( initialPrice > 100)   
        {
                total = initialPrice * (1 + tax/200);
                System.out.println("\n" + "50% Tax promo-code Applied SUCCESSFULLY!!");
        }

	    System.out.println("\n" + "Cost after tax = " + total);

            sc.close();
    }
}