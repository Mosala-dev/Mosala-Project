import java.util.Scanner;
public class DynamicInitialization{
	
	public static void main(String[] args){
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the size of numbers you want to add on the array: ");
		int size = kb.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i = 0; i<numbers.length;i++){
			
			System.out.print("Please enter the value at position"+i);
			numbers[i]=kb.nextInt();
			
		}
	}
}