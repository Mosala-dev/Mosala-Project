/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarraylist2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class BasicArrayList2 {
    public static void main(String[] args) {
        
        ArrayList<String> namesOfColors = new ArrayList<>();
        
        namesOfColors.add(0,"Blue") ;
        namesOfColors.add(1,"Purple") ;
        namesOfColors.add(2,"Orange") ;
        namesOfColors.add(3,"RED") ;
        
        /*for (int i = 0; i < namesOfColors.size(); i++) {
            System.out.println(namesOfColors.get(i));
        }*/
        
        namesOfColors.add(0, "Brown");
        System.err.println("");
        for (int i = namesOfColors.size()-1; i > 0; i--) {
            System.out.println(namesOfColors.get(i));
        }
        
        for (int i = 0; i < namesOfColors.size(); i++) {
            if(namesOfColors.get(i).equalsIgnoreCase("RED")){
                
                String color = namesOfColors.get(i);
                System.out.println("The color "+color+" is found");
            }else{
                System.out.println("The color is not found");;
            }
        }
        
        
    }
    
}
