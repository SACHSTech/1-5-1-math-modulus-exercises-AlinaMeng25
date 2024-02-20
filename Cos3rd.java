class Cos3rd extends ConsoleProgram {

  /**
  * Finding the third side of a triangle using two sides and their contained angle
  * @author: Alina
  */
  
  public void run() {
    
    // Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;

    double dblSideC;

    // user input
    dblSideA = readDouble("What is the first side length in cm? ");
    dblSideB = readDouble("What is the second side length in cm? ");
    dblAngleC = readDouble("What is the contained angle in degrees? ");

    // calcutations
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2*dblSideA*dblSideB * Math.cos(dblAngleC));

    // output
    System.out.println("The length of your third angle is around " + Math.round(dblSideC) + "cm.");
    
  }
}