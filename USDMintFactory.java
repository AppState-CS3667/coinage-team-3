
import java.util.Scanner;

/**
 * USDMintFactory.java
 * USDMintFactory class.
 * @author Aria Mils
 * @version 1, Fall 2021
 */

public class USDMintFactory extends MintFactory {
    private volatile static USDMintFactory uniqueInstance;
    
    /**
     * Constuctor method.
     * 
     */
    private USDMintFactory() {
        
    }

    /**
     * Main method. 
     * Prepars coins for USD currency.
     * Asks user for value of coin.
     *
     * @param args command line arguments
     */
    public static void main(String [] args) {
        //String coinType = "";
        double denom = 1.00;
        //Coin c = null;
        Scanner scan = new Scanner(System.in);
        USDMintFactory factory = new USDMintFactory();

        System.out.println("Enter Denominaction of coin in form "
            + "'x.xx' Otherwise, Enter 0 to exit.");
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
    public static USDMintFactory getInstance() {
        if (uniqueInstance == null) {
            synchronized (USDMintFactory.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new USDMintFactory();
                }
            }
        }
        return uniqueInstance;
    }
     
    /**
     * makeCoin method
     * Figures out what coin it should be based on value.
     *
     * @param denom denomination
     * @return a coin.
     */
    public Coin makeCoin(double denom) {
        Coin coin;
        if (denom == 1.00) {
            coin = new Dollar(1.00, "USA");
        }
        else if (denom == 0.50) {
            coin = new HalfDollar(.50, "USA");
        }
        else if (denom == .25) {
            coin = new Quarter(.25, "USA");
        }
        else if (denom == .10) {
            coin = new Dime(.10, "USA");
        }
        else if (denom == .05) {
            coin = new Nickel(.05, "USA");
        }
        else if (denom == .01) {
            coin = new Penny(.01, "USA");
        }
        else {
            coin = null; 
            //coin = new NullCoin();
        }
        return coin;
        /*
        switch (Denom)
        {
            case 1.00: Coin coin = new Dollar(1.00,country);
                break;
            case 0.50: Coin coin = new HalfDollar(.50, country);
                break;
            case 0.25: Coin coin = new Quater(.25, country);
                break; 
            case 0.10: Coin coin = new Dime(.10, country);
                break;
            case 0.05: Coin coin = new Nickle(.05, country);
                break;
            case 0.01: Coin coin = new Penny(.01, country);
                break;
            default: Coin coin = new NullCoin();
        }
        */
    }

}
