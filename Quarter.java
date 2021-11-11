/**
 * Quarter.java
 * Makes USD Quarter.
 *
 * @author Jenna Pederson
 * @version Version 1, Fall 2021
 */
public class Quarter extends Coin {
    /**
     * Constructor for Quarter.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public Quarter(double value, String country) {
        super(value, country, new Cu9167());
    }

}

