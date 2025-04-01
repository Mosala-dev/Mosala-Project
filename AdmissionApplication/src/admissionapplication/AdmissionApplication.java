package admissionapplication;

import java.util.Random;
import java.util.Scanner;



public class AdmissionApplication {

    public static void populateTestScores(int[] testScores, String[] studentNumber){
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < studentNumber.length; i++) {
            System.out.print("Enter aptitude test score: "+studentNumber[i]+": ");
            testScores[i] = kb.nextInt();
            boolean validate = validateScore(testScores[i]);
            if(validate==false){
                System.out.println("Invalid test Score");
            }
            while(!validate){
                System.out.print("Enter aptitude test score "+studentNumber[i]);
            testScores[i] = kb.nextInt();
            validate = validateScore(testScores[i]);
            }
        } 
    }
    
    public static String getUserOption(){
        Scanner kb = new Scanner(System.in);
        String option = "";
        
        System.out.println("Select any option to start"+"\n"
                + "\tPAA - Process Admission Application"+"\n"
                + "\tSCR - Search Student's Application"+"\n"
                + "\tESC - Exit");
        System.out.print("Option: ");
        option = kb.next();
        return option;
    }
    
    public static void determineAdmissionStatus(int[] apsScores, int[] testScores, String[] admissionStatuses, int[] mathScore){

        for (int i = 0; i < apsScores.length; i++) {
            if(mathScore[i]>5 && mathScore[i]<8){
                if((apsScores[i]>22 &&apsScores[i]<43)&&(testScores[i]>=55)){
                     admissionStatuses[i] = "Accepted for mainstream";
                }else{
                     admissionStatuses[i] = "Rejected mainstream: APS Score/Test Score";
                }
            }else if (mathScore[i]>4 && mathScore[i]<8){
                if((apsScores[i]>15 &&apsScores[i]<43)&&(testScores[i]>=50)){
                     admissionStatuses[i] = "Accepted for foundation";
                }else{
                     admissionStatuses[i] = "Rejected foundation APS Score/Test Score";
                }
            }else{
                admissionStatuses[i] = "Rejected: Math level";
            }
        }
    }
    
    public static boolean validateScore(int testScores){
        boolean isValid = false;
        
        if(testScores>=50&&testScores<=100){
            isValid = true;
        }
        
        return isValid;
    }
    
    public static int searchAdmissionStatus(String[] studentNumber, String searchString){
        int index = -1;
        for (int i = 0; i < studentNumber.length; i++) {
            if(studentNumber[i].equals(searchString)){
                index=i;
                break;
            }   
        }
        return index;
    }
    
    public static void displayAdmissionStatus(String[] studentNumber, int[] apsScore, int[] testScores,int[] mathScores,String[] admissionStatuses){
        System.out.println("Stud#\t\tAPS Score\tAptitude Test\tMath Level\tAdmission Status");
        for (int i = 0; i < studentNumber.length; i++) {
            System.out.println(studentNumber[i]+"\t"+apsScore[i]+"\t\t"+testScores[i]+"\t\t"+mathScores[i]+"\t\t"+admissionStatuses[i]);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        String[] studentNumber = {"214124863","215129567","224324567","204124563","215224503","219012496","202412456","202141024","214224026","218244523","215012032","201712356"};
        int[] mathScores = {6,5,7,4,6,8,3,7,6,5,4,8};
        String[] admissionStatuses = new String[mathScores.length];
        int[] apsScores = new int[mathScores.length];
        int[] testScores = new int[apsScores.length];
        
        Random rn = new Random();
        final int MIN = 16;
        final int MAX = 42;
        for (int i = 0; i < apsScores.length; i++) {
            apsScores[i] = rn.nextInt(MAX-MIN+1)+MIN;
        }
        displayAdmissionStatus(studentNumber,apsScores,testScores,mathScores,admissionStatuses);
        String option = getUserOption();
        option.toUpperCase();
        
        while(!option.equals("ESC")){
            
            switch(option){
                
                option = " ";
                case "PAA":
                    populateTestScores(testScores,studentNumber);
                    displayAdmissionStatus(studentNumber,apsScores,testScores,mathScores,admissionStatuses);
                    break;
                case "SCR":
                    System.out.print("Enter a student number to search for admission status");
                    String searchString = kb. next();
                    int index = searchAdmissionStatus(studentNumber,searchString);
                    if(index>0){
                        System.out.println("Student# "+searchString+" Status: "+admissionStatuses[index]);
                    }else{
                        System.out.println(searchString+" is an invalid student number/");
                    }
                    break;
                default: System.out.println("Invalid");
              
                
                option = getUserOption();
            }
        }
    }
    
}
