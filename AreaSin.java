class AreaSin extends ConsoleProgram {

  /**
  * Finding the area of a triangle based on two sides and their contained angle
  * @author: Alina Meng
  */
  
  public void run() {
    
    // Variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;

    double dblArea;

    // user input
    dblSideA = readDouble("What is the first side length in cm? ");
    dblSideB = readDouble("What is the second side length in cm? ");
    dblAngleC = readDouble("What is the contained angle in degrees? ");

    // calcutations
    dblAngleC = Math.toRadians(dblAngleC);
    dblArea = (dblSideA*dblSideB*Math.sin(dblAngleC))/2;

    // output
    System.out.println("The area of this triangle is " + dblArea + "cm squared");
    
  }
}