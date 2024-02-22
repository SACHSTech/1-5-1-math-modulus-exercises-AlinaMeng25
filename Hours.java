class Hours extends ConsoleProgram {

  /**
  * Converting hours into days and hours
  * @author: Alina Meng
  */
  
  public void run() {
    
    // Variables
    int intHours;
    int intDays;
    int intRemainHours;

    // User input
    intHours = readInt("How many hours? ");
    
    // Caluclations
    intDays = (int)((double)intHours/24);
    intRemainHours = intHours%24;

    // Output
    System.out.println(intHours + " hours = " + intDays + " days and " + intRemainHours + " hours");
    
  }
}