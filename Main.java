//import JOptionPane for fancy input
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    //declare variables
    //double because all can have decimals such as hourlyWage or the amount they want to save
    //set int to 0 for while loop
    double hourlyWage;
    double shiftsPerWeek;
    double hoursPerShift;
    double save;
    double totalPaychecks;
    int repeat = 0;

    //explain the use of the program
    JOptionPane.showMessageDialog(null, "Paycheck Saving Calculator");
    //while loop runs as long as repeat is equal to 0
    while (repeat == 0)
    {
      //ask user for hourly wage
      hourlyWage = Double.parseDouble(JOptionPane.showInputDialog("Enter Hourly Wage"));

      //ask user for shifts per week
      shiftsPerWeek = Double.parseDouble(JOptionPane.showInputDialog("Enter Shifts Per Week"));

      //ask user for hours per shift
      hoursPerShift = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours Per Shift"));

      //ask user how much they'd like to save
      save = Double.parseDouble(JOptionPane.showInputDialog("Enter how much you want to save"));

      //calculate the amount of paychecks
      totalPaychecks = save/(hourlyWage * hoursPerShift * shiftsPerWeek);

      //output what how many paychecks they'll need rounded up to nearest 1 and the original amoutnt they wanted to save
      JOptionPane.showMessageDialog(null, "You'll need to receive " + Math.ceil(totalPaychecks/1.0) + " paychecks to save $" + save);

      //asks user if they want to repeat, if they click yes it will loop and stop if no
      repeat = JOptionPane.showConfirmDialog(null, "Repeat?", "Repetition", JOptionPane.YES_NO_OPTION);
      //0 = yes, 1 = no
    }
  }
}