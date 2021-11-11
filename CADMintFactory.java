
import java.util.Scanner;

/*
 * CADMintFactory.java
 * CADMintFactory class
 * @Author Sophie Columbia
 * @Version 1, Fall 2021
 */

public class CADMintFactory extends MintFactory
{
    private volatile static CADMintFactory uniqueInstance;

    /*
     * Main method. 
     * Prepars coins for USD currency.
     * Asks user for value of coin.
     */
    public static void main(String [] args)
    {
        //String coinType = "";
        double denom = 1.00;
        //Coin c = null;
        Scanner scan = new Scanner(System.in);
        CADMintFactory factory = new CADMintFactory();

        System.out.println("Enter Denominaction of coin in form 'x.xx' Otherwise, "
        + "Enter 0 to exit.");
        while (denom != 0)
        {
            System.out.println("Enter Denomiation of coin: ");
            denom = scan.nextDouble();
            if (denom != 0)
            {
                Coin c = factory.makeCoin(denom);
                factory.buffing();
                factory.smoothing();
                factory.inspect();
                //Do what with coin?
            }
        }
        System.out.println("Exiting Factory...");
    }
    
    /*
     * Constuctor method.
     * 
     */
    private CADMintFactory()
    {
        
    }

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
     
    /*
     * makeCoin method
     * Figures out what coin it should be based on value.
     * Returns a coin.
     */
    public Coin makeCoin(double Denom)
    {
        Coin coin;
        if (Denom == 2.00)
        {
            coin = new Toonie(2.00, "CAD");
        }
        else if (Denom == 1.00)
        {
            coin = new Loonie(1.00, "CAD");
        }
        else if (Denom == 0.50)
        {
            coin = new FiftyCent(.50, "CAD");
        }
        else if (Denom == .25)
        {
            coin = new CadQuarter(.25, "CAD");
        }
        else if (Denom == .10)
        {
            coin = new CadDime(.10, "CAD");
        }
        else if (Denom == .05)
        {
            coin = new CadNickel(.05, "CAD");
        }
        {
            coin = null; 
            //coin = new NullCoin();
        }
        return coin;
    }
}