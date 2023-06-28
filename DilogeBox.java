import javax.swing.JOptionPane;

public class DilogeBox {
    public static void main(String args []) {
        String anualInterstRateString= JOptionPane.showInputDialog("Enter yearly interest rate");
        // Convert string into double 
        double anualInterstRate= Double.parseDouble(anualInterstRateString);

        // obtain monthly interest
        double monthlyInterestRate=anualInterstRate/1200;

        // Enter number of year
        String numberOfYearString= JOptionPane.showInputDialog("Enter number of years");

        //convert string into integer
        

    }
}
