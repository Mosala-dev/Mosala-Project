import java.util.Scanner;

import java.util.Random;

public class Arrays
{
	public static void main(String[] args) 
	{      
        Scanner kb = new Scanner(System.in);	

        //index 0 -10

        //length 11-1		

		String[] studNumbers = {"22558877", "33441155", "88771144",

					"11774455", "22558899", "99447766",

					"22113366", "66554411", "11993344",

					"44112233", "44779955", "33771199"};

        double[] outstandingFees = {125.36, 4447.99, 1005.25,

					11336.55, 500.87, 3874.25,

					805.25, 987.66, 1796.54,

					15998.25, 4789.10, 258.36};
		int option =getUseroption();
         String studentNumber;		
		 
		while(option !=0)
		{
			switch(option)
		{

			case 1:

			String details = details(studNumbers,outstandingFees);

			System.out.print(details);

			break;

			case 2:

			String highestFee = highestFee(studNumbers,outstandingFees);

			System.out.println();

            System.out.println("Highest : "+highestFee);

			break;

			case 3:

			System.out.println("Enter student number for which to update account : ");

			studentNumber = kb.next();

			System.out.print("Enter amount to pay : ");

			double amountPay = kb.nextDouble();

			double updatedAmount = updateAccount(studNumbers,outstandingFees,studentNumber,amountPay);

			if(updatedAmount>=0)

			{

				System.out.println("Updated fee for student " +studentNumber+" :R"+updatedAmount);

			}

			else

			{

				System.out.println("Student is not found");

			}

            break;
 
            case 4:			 

			double totalFees = totalFees(outstandingFees);

            System.out.println(totalFees);	

            break;

			case 5:

			System.out.println("Enter student number to validate : ");

			studentNumber = kb.next();

			boolean validate = validate(studNumbers,studentNumber);

			if(validate == true)

			{

				System.out.println("Student Number is validated succe.....");

			}

			else

			{

				System.out.println("Student Number is validated ucce.....");

			}

			break;
 
            default:

            System.out.println("Wrong option : choose option again");			

		}	 

       option = getUseroption();

		}

	}

	public static String details(String[] studNumbers,double[] outFees)

	{

		String concat = "";

		for(int i=0;i<studNumbers.length;i++)

		{

			//concat = "";

			//concat = 2204932+20000;

			concat += studNumbers[i] + "  "+outFees[i]+"\n";

			//concat = ""+2204932+20000;

			//concat = ""+2204932+20000;

		}

		return concat;

	}

	public static String highestFee(String[] studNumbers,double[] outFees){
		double maxFee = outFees[0];
		int maxIndex =0;
		
		for(int i=0;i<outFees.length;i++){

			if(outFees[i] > maxFee){
				maxFee = outFees[i];
				maxIndex = i;
			}
		}
		return studNumbers[maxIndex] + "(R"+maxFee+")";
	}

	public static double updateAccount(String[] studNumbers,double[] outFees,String userStudentNum,double userAmountPay){
		for(int i=0;i<outFees.length;i++){
			if(studNumbers[i].equals(userStudentNum)){
				   //2000   > 1000
				if(userAmountPay > outFees[i]){
					System.out.println("Amount to pay exceeds current balance.");
					return outFees[i];
				}
				else{
					outFees[i] -= userAmountPay;
					return outFees[i];
				}
			}
		}
		return -1;
	}
	public static double totalFees(double[] outFees){

		double total =0;

		for(int i=0;i<outFees.length;i++){
			total+=outFees[i];
		}
		return total;
	}
	public static int getUseroption(){

		Scanner kb = new Scanner(System.in);

		int option;
        System.out.print("Choose option to do: \n"+
		                  "1 - Display student\n2 - Get highestFee\n3 - Update Account\n4 - Display Total Fees"+
						  "\n5 - Validate student number"+
						  "\n0 - Exit\n\n User choice : ");	
		option =kb.nextInt();
        return option;
	}
	public static boolean validate(String[] studNumbers,String studentNumber){


		//Starts with 2 and length is 8//true

		for(int i=0;i<studNumbers.length;i++){

			if(studNumbers[i].equals(studentNumber)){
				//220493245
				char c = studNumbers[i].charAt(0);
				//c = 2; 
				if(c=='2' && studentNumber.length() == 8){
					return true;
				}
			}
		}
		return false;
	}
}
 
 
 
 
int upperCase=0,lowerCase=0,digit=0;
 
		int strLength=password.length();

		for(int i=0;i<strLength;i++){

			char c=password.charAt(i);

			if(Character.isUpperCase(c)){

				upperCase++;

			}

		if(Character.isLowerCase(c)){

				lowerCase++;	

			}

			if(Character.isDigit(c)){

				digit++;	

			}

		}

		if(upperCase>=2){

			if(lowerCase>=2){

				if(digit>=2){

					System.out.println("Password valid");

				}

				else{

					System.out.println("Password must atleast contain 2 digits");

				}

			}

			else{

				System.out.println("Password must atleast contain 2 lower case");
			}
		}
		else{

			System.out.println("Password must atleast contain 2 upper case");

		}

		System.out.println("Password length:"+strLength);
 
chatroom is on fire 
 
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = in.nextLine();
        int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }

        }
        if(upperCaseCount >= 2 && lowerCaseCount >= 2 && digitCount >= 2) {
            System.out.println("Valid password");
        }
        else{
            System.out.println("invalid password ");
        }
                
      
    }
}
 