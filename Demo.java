import java.util.Scanner;

/**
 * Demo.java
 * Demos the Coin project.
 *
 * @author Will O'Brien
 * @version 11/10/21
 */
public class Demo {
    /**
    * Main method for demo.
    * 
    * @param args command line args
    */
    public static void main(String[] args) {
        System.out.println("This is the coin demo class.");
        System.out.println("What country's coins would you like "
                           + "to create? Type \"USD\" or \"CAD\".");
        Scanner s = new Scanner(System.in);
        String country = s.nextLine();
        if (country.equals("USD")) {
            USDMintFactory.main(new String[1]);
        }
        else if (country.equals("CAD")) {
            CADMintFactory.main(new String[1]);
        }
        else {
            System.out.println("Sorry, that input doesn't match.");
        }
        
    }
}
