import java.util.Scanner;

/*
 * USDMintFactory.java
 * USDMintFactory class
 * @Author Aria Mils
 * @Version 1, Fall 2021
 */

public class USDMintFactory extends MintFactory
{
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
        USDMintFactory factory = new USDMintFactory();

        System.out.println("Enter Denominaction of coin in form 'x.xx' Otherwise, "
        + "Enter 0 to exit.");
        while (denom != 0)
        {
            System.out.println("Enter Denomiation of coin: ");
            denom = scan.nextDouble();
            if (denom != 0)
            {
                Coin c = factory.makeCoin(denom);
                c.buffing();
                c.smoothing();
                c.inspect();
                //Do what with coin?
            }
        }
        System.out.println("Exiting Factory...");
    }
    
    /*
     * Constuctor method.
     *
     */
    public USDMintFactory()
    {
        
    }
     
    /*
     * makeCoin method
     * Figures out what coin it should be based on value.
     * Returns a coin.
     */
    public Coin makeCoin(double Denom)
    {

        if (Denom == 1.00)
        {
            Coin coin = new Dollar(1.00, "USA");
        }
        else if (Denom == 0.50)
        {
            Coin coin = new HalfDollar(.50, "USA");
        }
        else if (Denom == .25)
        {
            Coin coin = new Quarter(.25, "USA");
        }
        else if (Denom == .10)
        {
            Coin coin = new Dime(.10, "USA");
        }
        else if (Denom == .05)
        {
            Coin coin = new Nickel(.05, "USA");
        }
        else if (Denom == .01)
        {
            Coin coin = new Penny(.01, "USA");
        }
        else
        {
            Coin coin = null; 
            //Coin coin = new NullCoin();
        }
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
