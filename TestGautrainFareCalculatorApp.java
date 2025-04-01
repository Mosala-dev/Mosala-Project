public class TestGautrainFareCalculatorApp{
	
	public static void main(String[]args){
		
		Scanner kb = new Scanner(System.in);
		
		
		
		GautrainFareCalculatorApp ticket1 = new GautrainFareCalculatorApp();
		GautrainFareCalculatorApp  ticket2 = new GautrainFareCalculatorApp(p_passengerName,p_destinationStation);
		
		ticket1.GautrainFareCalculatorApp();
		
		
		System.out.print("Please your  name: ")
		p_passengerName = kb.nextLine();
		System.out.print("Please your  destination: ")
		p_destinationStation = kb.next();
		
		ticket2.GautrainFareCalculatorApp(p_passengerName,p_destinationStation);
		
	}
}