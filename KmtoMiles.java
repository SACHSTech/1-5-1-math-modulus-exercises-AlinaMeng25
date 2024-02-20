class KmtoMiles extends ConsoleProgram {

  /**
  * Converting kilometers to miles
  * @author: Alina Meng
  */
  
  public void run() {
    
    // Variables
    double dblKilo;
    double dblMiles;

    // User input
    dblKilo = readDouble("How many kilometers? ");
    
    // Caluclations
    dblMiles = dblKilo * 0.621371;

    // Output
    System.out.println(dblKilo + "km is " + dblMiles + " miles.");
    
  }
}