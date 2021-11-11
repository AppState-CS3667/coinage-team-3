import java.util.Random;
/*
 * MintFactroy.java
 * MintFactory abstraction
 * @author Aria Mills
 * @Version 1, fall 2021
 */
public abstract class MintFactory
{
    Random rand = new Random(System.currentTimeMillis());   
 
 /*
  * makeCoin abstract.
  * Makes, and then returns a coin.
  */   
    public abstract Coin makeCoin(double denom);
    /*
     * Inspect function. 
     * Returns a fail 1/12 times.
     */
    public void inspect()
    {
        int x = rand.nextInt(12);    
        if (x == 11)
        {
            System.out.println("Inspection Failed...");
        }
        else
        {
            System.out.println("Inspection Passed...");
        }
        //fails 1/12
        //Make into boolean that returns True/False, and use that to see if 
        //the entire thing pass/fails
    }
    /*
     * Smoothing function.
     * returns fail 1/1000 times
     */
    public void smoothing()
    {
        int x = rand.nextInt(1000);
            if (x == 999)
            {
                System.out.println("Smoothing Failed...");
            }
            else
            {
                System.out.println("Smoothing Passed...");
            }

        //fails 1/1000
    }
    /*
     * buffing function.
     * Returns a fail 1/1000 times.
     */
    public void buffing()
    {
        int x = rand.nextInt(1000);
            if (x == 999)
            {
                System.out.println("Buffing Failed...");
            }
            else
            {
                System.out.println("Buffing Passed...");
            }

        //fails 1/1000
    }
}
