/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assesmentap;

public class AssesmentAp {

    public static void main(String[] args) {
        
        AssesmentCls ass1 = new AssesmentCls("CT1");
        ass1.setWeight(15);
        ass1.setType('o');
        System.out.println("Code: "+ass1.getCode()+"\n"
                + "Difficulty: "+ass1.levelOfDifficulty());
        
        AssesmentCls ass2 = new AssesmentCls("CT2");
        ass2.setType('g');
        ass2.setWeight(35);
        System.out.println("Code: "+ass2.getCode()+"\n"
                + "Difficulty: "+ass2.levelOfDifficulty());
        
        AssesmentCls ass3 = new AssesmentCls("ST1", 'c', 45);
        System.out.println("Code: "+ass3.getCode()+"\n"
                + "Difficulty: "+ass3.levelOfDifficulty());
        
        AssesmentCls finalAss =new AssesmentCls("ASS1", 'g', 5);
        System.out.println("Code: "+finalAss.getCode()+"\n"
                + "Difficulty: "+finalAss.levelOfDifficulty());
    }
    
}
