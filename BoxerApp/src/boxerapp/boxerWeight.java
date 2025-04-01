/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxerapp;
public class boxerWeight {

    private String boxerName;
    private double boxerWeight;

    public boxerWeight() {
    }

    public boxerWeight(String boxerName, double boxerWeight) {
        this.boxerName = boxerName;
        this.boxerWeight = boxerWeight;
    }

    public void setBoxerName(String boxerName) {
        this.boxerName = boxerName;
    }

    public void setBoxerWeight(double boxerWeight) {
        this.boxerWeight = boxerWeight;
    }

    public String getBoxerName() {
        return boxerName;
    }

    public double getBoxerWeight() {
        return boxerWeight;
    }
    
    public String determineWeightCategory(){
        
        String category = "";
        
        if(boxerWeight>=50 && boxerWeight<=65){
            category = "Light";
        }else if(boxerWeight<=90){
            category = "Light";
        }else if(boxerWeight>90){
            category = "Light";
        }
        return category;
    }
    
}
