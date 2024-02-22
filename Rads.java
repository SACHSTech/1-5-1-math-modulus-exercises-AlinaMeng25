class Rads extends ConsoleProgram {

  /**
  * Conversion of degrees to radians
  * @author: Alina Meng
  */
  
  public void run() {
    
    // variables
    double dblDegrees;
    double dblRadians;

    // data collection
    dblDegrees = readDouble("How many degrees: ");

    // calc
    dblRadians = dblDegrees / 180;

    // output
    System.out.println(dblDegrees + " is " + dblRadians + "π in radians.");
    
  }
}