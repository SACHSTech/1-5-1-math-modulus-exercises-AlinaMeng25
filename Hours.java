class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // Variables
    int dblHours;
    int dblDays;
    int dblRemainHours;

    // User input
    dblHours = readInt("How many hours? ");
    
    // Caluclations
    dblDays = (int)((double)dblHours/24);
    dblRemainHours = dblHours%24;

    // Output
    System.out.println(dblHours + " hours = " + dblDays + " days and " + dblRemainHours + " hours");
    
  }
}