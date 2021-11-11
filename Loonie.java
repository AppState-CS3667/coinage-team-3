/**
 * Loonie.java
 * Canadian dollar.
 * @author Sophie Columbia
 * @version Version 1, Fall 2021
 */
public class Loonie extends Coin {
    /**
     * Constructor for Loonie.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public Loonie(double value, String country) {
        super(value, country, new UnknownComp());
    }

}
