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
        String Country = "USA";
        String coinType = "";
        double denom = 1.00;
        Coin c = null;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Denominaction of coin in form 'x.xx' Otherwise, "
        + "Enter 0 to exit.")

        while (denom != 0)
        {
            System.out.println("Enter Denomiation of coin: ");
            denom = scan.nextDouble();
            if (denom != 0)
            {
                Coin newCoin = makeCoin(denom);
                //Do what with coin?
            }
        }
        System.out.println("Exiting Factory...");
    }
 
    /*
     * makeCoin method
     * Figures out what coin it should be based on value.
     * Returns a coin.
     */
    public void makeCoin(double Denom)
    {
        switch (Denom)
        {
            case 1.00: coinType = "Dollar";
                break;
            case 0.50: coinType = "HalfDollar";
                break;
            case 0.25: coinType = "Quater";
                break; 
            case 0.10: coinType = "Dime";
                break;
            case 0.05: coinType = "Nickel";
                break;
            case 0.01: coinType = "Penny";
                break;
            default: coinType =  "null";
        }
        Class t = class.forName(coinType);
        Object o = t.newInstance();
        c = (coin) o;
        //Think I may be missing something? Calling construction on proper coin class?
        return c;       
    }



}
