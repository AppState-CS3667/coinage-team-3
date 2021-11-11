/**
 * Coin.java
 * Coin abstraction.
 * @author Jenna Pedersen
 * @version Version 1, Fall 2021
 */
public abstract class Coin {
    protected double value;
    protected String country;
    protected String motto;
    protected String metallicComposition;
    protected int mintYear;
    protected Composition comp;


/**
 * Constructor for the Coin class.
 * @param value is the value of the coin
 * @param country is the country of origin
 * @param comp is the metallic composition of the Coin.
 */

    public Coin(double value, String country, Composition comp) {
        this.value = value;
        this.country = country;
        this.comp = comp;
    }

    /**
     * Getter for value field.
     *  
     * @return field value
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter for country field.
     *  
     * @return field country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Smelts coin.
     */
    public void smelt() {
        comp.smelt();
    }

    /**
     * NullCoin class to implement null pattern.
     */
    private static class NullCoin extends Coin {
        /**
         * Constructor for the NullCoin.
         */
        NullCoin() {
            super(0, null, null);
        }
    }
    public static Coin NULL = new NullCoin();

}
