/**
 * Nickel.java
 * Makes USD Nickel.
 *
 * @author Jenna Pederson
 * @version Version 1, Fall 2021
 */
public class Nickel extends Coin {
    /**
     * Constructor for Nickel.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public Nickel(double value, String country) {
        super(value, country, new Cu75());
    }

}

