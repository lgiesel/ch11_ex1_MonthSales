import java.text.NumberFormat;
//import utils.presentation.*;

public class MonthSelectorApp {

    public static void main(String[] args) {
        Console.displayLine("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String monthNames[] = {"January", "February", "March", "April", "May", "June", "July", 
        		               "August", "September", "October", "November", "December"};
        double[] monthSales = {12000.00, 950.50, 47099.2, 21930.78, 5123.20, 7239.82, 
        		               12392.23, 8239.32, 283920.29, 29392.23, 2329.32, 32823.21};
        
        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number:\t");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthNames.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month and display the month name and sales            
            Console.displayLine("Sales for " + monthNames[monthNumber-1] + ":\t\t" + 
                                 currency.format(monthSales[monthNumber-1]));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n):\t", "y","n");
            Console.displayLine();
        }
        
        double sum = 0.0;
        for (int i=0;i<12;i++) {
        	sum+=monthSales[i];
        }
        Console.displayLine("Total Sales:\t\t\t" + currency.format(sum));
        
        //Enhanced for loop
        double sumEnh = 0.0;
        for (double s : monthSales) {
        	sumEnh+=s;
        }
        Console.displayLine("Total Sales (enhanced loop):\t" + currency.format(sumEnh));
        
        // display the total sales for the year
        Console.displayLine("Bye!");

    }
}
