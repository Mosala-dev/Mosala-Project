
package admission;

import java.util.Scanner;

public class Admission {

    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int iAPSScore;
        String sResult = "";
        
        System.out.print("Enter your APS score ");
        iAPSScore = kb.nextInt();
        
        if (iAPSScore >= 26){
            sResult = "Admision Granted";}
        else {sResult = "Admision Refused";}
        System.out.println(sResult);
    }
    
    
}
