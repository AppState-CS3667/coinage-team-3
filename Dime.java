/**
 * Dime.java
 * Makes USD Dime.
 *
 * @author Jenna Pederson
 * @version Version 1, Fall 2021
 */
public class Dime extends Coin {
    /**
     * Constructor for Dime.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public Dime(double value, String country) {
        super(value, country, new Cu9167());
    }

}

