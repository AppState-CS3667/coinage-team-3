/**
 * Toonie.java
 * Canadian 2 dollar.
 * @author Sophie Columbia
 * @version Version 1, Fall 2021
 */
public class Toonie extends Coin {
    /**
     * Constructor for Toonie.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public Toonie(double value, String country) {
        super(value, country, new UnknownComp());
    }

}
