import java.util.Scanner;
public class GautrainFareCalculatorApp{
	
	private String passengerName;
	private String destinationStation;
	private double fare;
	
	public GautrainFareCalculatorApp(){
		
		passengerName = "Lerato";
		destinationStation = "Midrand";
		fare = 0.0;
		
	}
	
	public GautrainFareCalculatorApp(String p_passengerName, String p_destinationStation){
		passengerName = p_passengerName;
		destinationStation = p_destinationStation;
		fare = 0.0;
		
	}
	public void setPassengerName(String p_passengerName){
		passengerName =p_passengerName;
	}
	public void setDestinationStation(String p_destinationStation){
		destinationStation =p_destinationStation;
	}
	public void setTicketFare(String p_fare){
		fare = determineTicketFare();
	}
	
	public double determineTicketFare(){
		
		tripFare = 0;
		
		switch(destinationStation){
			
			case "Santon":
				tripFare = 60.00;
				break;
			case "Midrand":
				tripFare = 40.00;
				break;
			case "Centurion":
				tripFare = 20.00;
				break;
			default : 
				tripFare = 0;
				break;
		}
		return tripFare;
		
	}
	public void displayTicketDetails(){
		System.out.print("Ticket details based on the overloaded constructor:");
		System.out.print("Passenger Name: "+GautrainFareCalculatorApp(passengerName));
		System.out.print("Destination Station: "+GautrainFareCalculatorApp(passengerName));
		System.out.print("Ticket Fare: "+tripFare);
		
	}

}