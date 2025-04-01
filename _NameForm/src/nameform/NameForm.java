
package nameform;

import java.util.Scanner;

public class NameForm {

    public static void main(String[] args) {
        
        Scanner  kb = new Scanner(System.in);
        
        System.out.println("Please enter your full name: ");
        String userInput = kb.nextLine();
        
        
        
        String replacedInput = userInput.replace(userInput.charAt(0),Character.toUpperCase(userInput.charAt(0)));
        String surnamen = userInput.replace(userInput.charAt(userInput.indexOf(" ")+1),Character.toUpperCase(userInput.indexOf(" ")+1));
        System.out.println(replacedInput);
    }
    
}
