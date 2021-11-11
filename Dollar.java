/**
 * Dollar.java
 * Makes USD Dollar.
 *
 * @author Jenna Pederson
 * @version Version 1, Fall 2021
 */
public class Dollar extends Coin {
    /**
     * Constructor for Dollar.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public Dollar(double value, String country) {
        super(value, country, new Cu885());
    }

}
