
package calctotalsecondsapp;

import java.util.Scanner;

public class CalcTotalSecondsApp{
    
    public static int[] totalSeconds(int[] hours,int[] mins){
        
        int inSeconds = 0;
        int index = -1;
        final int sec = 60;
        for (int i = 0; i < hours.length; i++) {
                inSeconds = (hours[i]*(sec*sec)) + (mins[i]*sec);
                index = i;
        }
        return inSeconds;
    }

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int[] hours = new int[5];
        int[] mins = new int[hours.length];
        int[] seconds = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
                System.out.print("Please enter hours: ");
                hours[i] = kb.nextInt();
                System.out.print("Please enter minutes ");
                mins[i] = kb.nextInt();
                System.out.print("Please enter seconds: ");
                seconds[i] = kb.nextInt();
                
        }
        
        int[] totalSec = totalSeconds(hours,mins);
        System.out.println("Hours======Minutes======Seconds======Total seconds");
        for (int i = 0; i < hours.length; i++) {
            System.out.println(hours[i]+"\t"+mins[i]+"\t"+seconds+"\t"+totalSec[i]);
        }
        
    }
    
}
