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
        int numberOfYears= Integer.parseInt(numberOfYearString);

        // Enter loan amount
        String loanString=JOptionPane.showInputDialog("enter loan amount");
        // string into double
        double loanAmount = Double.parseDouble(loanString);

        // calculate payment
        double monthlyPayment= loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,
         numberOfYears*12));

         double totalPayment= monthlyPayment*numberOfYears*12;

         // two digit after the decimal point
         monthlyPayment=(int)(monthlyPayment*100)/100.0;
         totalPayment=(int)(totalPayment*100)/100.0;
         // display result
         String output= "The monthly payment is " + monthlyPayment +"\n The total Payment is" + totalPayment;
         JOptionPane.showMessageDialog(null,  output);

    }
}
