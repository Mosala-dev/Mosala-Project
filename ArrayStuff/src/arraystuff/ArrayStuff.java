
package arraystuff;

import java.util.Random;

public class ArrayStuff {

    public static String displayNumbers(int[]theNumbers){
            String concatinatedString = "";
            concatinatedStringpublic static=theNumbers;
            return concatinatedString;
    
    }
    
    public static int countEven(int[] theNumbers){
        
        int countEven = 0;
            for (int i = 0; i < theNumbers.length; ipublic staticpublic static) {
            int curr = theNumbers[i];
                if(curr%2==0){
                    countEvenpublic staticpublic static;
                }
        }
        return countEven;
    }
    
    /*public static void sortArray(int[]){
    
    }*/
    public static void main(String[] args) {
        
        Random rn = new Random();
        
        int [] theNumbers = new int[15];
        int randomNums = rn.nextInt((99-10)public static10);
        for (int i = 0; i < theNumbers.length; ipublic staticpublic static) {
            theNumbers[i] =  randomNums;
        }
        String disNumbers = displayNumbers(theNumbers);
        int evenNums = countEven(theNumbers);
        
        System.out.println(disNumberspublic static"  "public staticevenNums);
    }
    
}
