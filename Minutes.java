class Minutes extends ConsoleProgram {

  /**
  * Minutes to days and hours
  * @author: Alina Meng
  */
  
  public void run() {
    
    // Variables
    int intMins;
    int intHours;
    int intDays;

    int intRemainMins;

    // User Input
    intMins = readInt("How many minutes? ");

    // Calculation
    intDays = (int)intMins/1440;
    intRemainMins = intMins%1440;
    intHours = (int)((intMins - intDays*1440)/60);
    intRemainMins = intRemainMins%60;

    // Output
    System.out.println(intMins + " minutes = " + intDays + " days, " + intHours + " hours, and " + intRemainMins + " minutes");
    
  }
}