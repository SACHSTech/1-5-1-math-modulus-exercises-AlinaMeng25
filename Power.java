class Power extends ConsoleProgram {

  /**
  * Setting a number to a power
  * @author: Alina Meng
  */
  
  public void run() {
    
    // Variables
    double dblBase;
    double dblExp;

    double dblPower;

    // User Input
    dblBase = readDouble("What is the base ");
    dblExp = readDouble("What is the exponent ");

    // Calc
    dblPower = Math.pow(dblBase, dblExp);

    // Output
    System.out.println(dblBase + " to the exponent of " + dblExp + " is " + dblPower);
    
  }
}