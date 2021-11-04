import java.util.Random;

public abstract class MintFactory
{
    //need only Value & Country Code
    //Dollar, HalfDollar, Quater, Dime, Nickel, Penny
    Random rand = new Random();
    
    //TODO Set seed for random using System time
    
    public abstract makeCoin();
    public inspect()
    {
        int x = rand.nextInt(11)
            if (x == 11)
            {
                System.out.println("Inspection Failed...");
            }
            else
            {
                System.out.println("Inspection Passed...");
            }
        //fails 1/12
    }
    public smoothing()
    {
        int x = rand.nextInt(999)
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
    public buffing()
    {
        int x = rand.nextInt(999)
            if (x == 999)
            {
                System.out.println("Buffing Failed...");
            }
            else
            {
                System.out.println("buffing Passed...");
            }

        //fails 1/1000
    }
}
