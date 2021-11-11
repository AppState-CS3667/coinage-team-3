/**
 * CadNickel.java
 * Canadian nickel.
 * @author Sophie Columbia
 * @version Version 1, Fall 2021
 */
public class CadNickel extends Coin {
    /**
     * Constructor for CadNickel.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public CadNickel(double value, String country) {
        super(value, country, new UnknownComp());
    }
}
