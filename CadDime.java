/**
 * CadDime.java
 * Canadian Dime.
 * @author Sophie Columbia
 * @version Version 1, Fall 2021
 */
public class CadDime extends Coin {
    /**
     * Constructor for CadDime.
     * @param value is the value of the coin
     * @param country is the country of origin
    */
    public CadDime(double value, String country) {
        super(value, country, new UnknownComp());
    }
}
