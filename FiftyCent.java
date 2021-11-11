/**
 * FiftyCent.java
 * Makes USD FiftyCent.
 *
 * @author Jenna Pederson
 * @version Version 1, Fall 2021
 */
public class FiftyCent extends Coin {
    /**
     * Constructor for FiftyCent.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public FiftyCent(double value, String country) {
        super(value, country, new UnknownComp());
    }
}
