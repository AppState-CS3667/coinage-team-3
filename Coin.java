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
     * Constructor for Coin.
     * @param value is the value of the coin
     * @param country is the country of origin
     * @param comp composition of coin
    */
    public Coin(double value, String country, Composition comp) {
        value = this.value;
        country = this.country;
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

}
