/**
 * CadQuarter.java
 * Canadian quarter.
 * @author Sophie Columbia
 * @version Version 1, Fall 2021
 */
public class CadQuarter extends Coin {
    /**
     * Constructor for CadQuarter.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public CadQuarter(double value, String country) {
        super(value, country, new UnknownComp());
    }
}
