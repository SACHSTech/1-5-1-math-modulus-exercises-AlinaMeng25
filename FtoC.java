class FtoC extends ConsoleProgram {

  /**
  * Coverting F to C
  * @author: Alina Meng
  */
  
  public void run() {
    
    // Variables
    double dblFarTemp;
    double dblCelTemp;

    // user input
    dblFarTemp = readDouble("What is the temperature in farenheit? ");

    // calc
    dblCelTemp = (5*(dblFarTemp - 32)) / 9;

    // output
    System.out.println(dblFarTemp + " in celcius is " + dblCelTemp);
    
  }
}