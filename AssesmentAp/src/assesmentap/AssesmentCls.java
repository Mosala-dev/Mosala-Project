/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assesmentap;

/**
 *
 * @author mosal
 */
public class AssesmentCls {
    
    private String code;
    private char type;
    private double weight;

    public AssesmentCls(String code) {
        this.code = code;
    }

    public AssesmentCls(String code, char type, double weight) {
        this.code = code;
        this.type = type;
        this.weight = weight;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public char getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
    
    public String levelOfDifficulty(){
    
        String results = "";
        
        if(weight<10){
            results = "Easy";
        }
        else if(weight<=40){
            switch(type){
                case 'g':
                case 'p':
                    results = "Easy";
                    break;
                case 'o':
                    results = "Moderate";
                    break;
                case 'c':
                    results = "Difficult";
                    break;
            }
        }
        else if(weight>40){
            switch(type){
                case 'g':
                    results = "Easy";
                    break;
                case 'p':
                    results ="Moderate";
                    break;
                case 'o':
                case 'c':
                    results = "Difficult";
                    break;
            }
        }
        
        
        return results;
    }
}
