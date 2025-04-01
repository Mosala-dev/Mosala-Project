
package bestcarcompany;
public class BestCarCompany {

    public static double calculateCommision(double[] totalSales){
        
        double commision = 0;
        
        for (int i = 0; i < totalSales.length;i++) {
            if(totalSales[i]>= 50000){
            commision += (9/100)*totalSales[i];
            }
            else if(totalSales[i]>= 20000){
                commision += (5/100)*totalSales[i];
            }
            else if(totalSales[i]< 20000){
                commision += (3/100)*totalSales[i];
            }
        
        }
        return commision;  
    }
    
    public static void main(String[] args) {
        
        String[] names = {"James Boyd", "Mpho Baloyi", "Timothy Ryan", "Daniel Ramogotsi", "William Seimela",
            "Harold Xaba", "Miller Bentley", "Sam Sithole", "Richard Frey", "Peter Sechaba"};
        double[] totalSales = {40000.00, 54321.00, 12345.60, 60444.40, 23457.80, 43222.30, 12444.00, 23555.00,
        45666.00, 18982.30};
        
        double commisResult = calculateCommision(totalSales);
        
        double[] commision = new double[totalSales.length]; 
        for (int i = 0; i < commision.length; i++) {
                commision[i]=commisResult;break;
            }
        System.out.println("======================Before Sorting============================");
        System.out.println("Sales Person\t\tTotal Sales\t\tCommision");
        System.out.println("================================================================");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"\t\tR"+totalSales[i]+"\t\tR"+commision[i]);
        }
    }
}
