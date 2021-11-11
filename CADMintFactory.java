
import java.util.Scanner;

/**
 * CADMintFactory.java
 * CADMintFactory class.
 * @author Sophie Columbia
 * @version 1, Fall 2021
 */
public class CADMintFactory extends MintFactory {
    private volatile static CADMintFactory uniqueInstance;

    /**
     * Constuctor method.
     * 
     */
    private CADMintFactory() {
        
    }

    /**
     * Main method. 
     * Prepars coins for USD currency.
     * Asks user for value of coin.
     *
     * @param args command line input
     */
    public static void main(String [] args) {
        //String coinType = "";
        double denom = 1.00;
        //Coin c = null;
        Scanner scan = new Scanner(System.in);
        CADMintFactory factory = new CADMintFactory();

        System.out.println("Enter Denominaction of coin in form"
            + " 'x.xx' Otherwise, Enter 0 to exit.");
        while (denom != 0) {
            System.out.println("Enter Denomiation of coin: ");
            denom = scan.nextDouble();
            if (denom != 0) {
                Coin c = factory.makeCoin(denom);
                factory.buffing();
                factory.smoothing();
                factory.inspect();
                //Do what with coin?
            }
        }
        System.out.println("Exiting Factory...");
    }

    /**
     * getInstance.java
     * Gets instance of mint factory (singleton).
     * 
     * @return instance of factory
     */
    public static CADMintFactory getInstance() {
        if (uniqueInstance == null) {
            synchronized (CADMintFactory.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CADMintFactory();
                }
            }
        }
        return uniqueInstance;
    }
     
    /**
     * makeCoin.java
     * Figures out what coin it should be based on value.
     * 
     * @param denom coin value
     * @return coin made
     */
    public Coin makeCoin(double denom) {
        Coin coin;
        if (denom == 2.00) {
            coin = new Toonie(2.00, "CAD");
        }
        else if (denom == 1.00) {
            coin = new Loonie(1.00, "CAD");
        }
        else if (denom == 0.50) {
            coin = new FiftyCent(.50, "CAD");
        }
        else if (denom == .25) {
            coin = new CadQuarter(.25, "CAD");
        }
        else if (denom == .10) {
            coin = new CadDime(.10, "CAD");
        }
        else if (denom == .05) {
            coin = new CadNickel(.05, "CAD");
        }
        else {
            coin = null; 
            //coin = new NullCoin();
        }
        return coin;
    }
}
