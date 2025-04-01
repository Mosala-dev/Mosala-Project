public class BookingApp{

    public static boolean validateDestination(String userDestination){
        
        boolean isValid = false;
            if (userDestination.equalsIgnoreCase("EL") && (userDestination.equalsIgnoreCase("CPT")) && (userDestination.equalsIgnoreCase("DBN"))){
                isValid = true;
            }
        return isValid;
    }
    
    public static double determinePrice(String userDestination, char destinationType){
        double price = 0;
        userDestination.toUpperCase();
            switch(userDestination){
            
                case "EL": price = 1200;
                if(destinationType == 'R'){
                    price = price*2;
                }
                break;
                case "CPT": price= 2500;
                if(destinationType == 'R'){
                    price = price*2;
                }
                break;
                case "DBN": price = 1800;
                if(destinationType == 'R'){
                    price = price*2;
                }
                break;
                
            }
        return price;
    }
   

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Please enter destination: ");
        String userDestination = kb.nextLine();
        
        System.out.println("Do you want to book single or return R/r or S/s: ");
        char destinationType = kb.next().charAt(0);
        
        boolean desValidation = validateDestination(userDestination);
        double price =determinePrice(userDestination, destinationType);
        System.out.println(price);
    }
    
}