/*a) Henry rents a bakkie to move stock to a store. The basic cost is R300 per day. He also pays a specific amount per kilometre travelled. If the number of 
kilometres exceeds 400, he gets a discount of 5% on the amount for the kilometres travelled. Enter the number of kilometres travelled, the amount he 
should pay per kilometre, as well as the number of days that he rented the trailer, then calculate and display the amount due by him. */
package bakkierental;

import java.util.Scanner;

public class BakkieRental {

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        double rNumKM, rCostKM, rDueAmnt;
        String sDiscription  = "";
        int iNumDays;
        final double COST_PER_DAY = 300.0;
        final double rDiscount = 0.5;
        
        System.out.print("Enter number of kilometers travelled: ");
        rNumKM = kb.nextDouble();
        System.out.print("The cost per kilometer: ");
        rCostKM = kb.nextDouble();
        System.out.print("Enter number of days that you rented the trailer: ");
        iNumDays = kb.nextInt();
        
        if (rNumKM > 400)
        {
            rDueAmnt = (COST_PER_DAY + rNumKM*rCostKM*rDiscount)*iNumDays;
            sDiscription = "You exceeded 400 Kilometers";
        }else
        {
            rDueAmnt = (COST_PER_DAY + rNumKM*rCostKM)*iNumDays;
           sDiscription = "you did not exceed 400 kilometers"; 
        }
        System.out.println("The amount due is R"+rDueAmnt+"\n"+sDiscription);
    }
    
}
