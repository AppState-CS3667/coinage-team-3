/**
 * HalfDollar.java
 * Makes USD HalfDollar.
 *
 * @author Jenna Pederson
 * @version Version 1, Fall 2021
 */
public class HalfDollar extends Coin {
    /**
     * Constructor for HalfDollar.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public HalfDollar(double value, String country) {
        super(value, country, new Cu9167());
    }

}

