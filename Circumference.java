class Circumference extends ConsoleProgram {

  /**
  * Curcumfrence from radius
  * @author: Alina  :)
  */
  
  public void run() {
    
    // variables
    double dblRadius;
    double dblCircumference;

    // get radius
    dblRadius = readDouble("What is the radius of thine circle?? ");

    // calculation
    dblCircumference = Math.round(2 * Math.PI * dblRadius);

    // output results
    System.out.println("The circumference of thine marvelous circle avec le radius " + dblRadius + " is about " + dblCircumference);
    
  }
}