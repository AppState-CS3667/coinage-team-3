/**
 * Coin.java
 * Coin abstraction
 * @author Jenna Pedersen
 * @Version Version 1, Fall 2021
 */
public abstract class Coin {
    protected double value;
    protected String country;
    protected String motto;
    protected String metallicComposition;
    protected int mintYear;


/**
 * Constructor
 * @param value is the value of the coin
 * @param country is the country of origin
 * @param motto is the motto on th coin
 * @param metallicComposition is what metals the coin is made out of
 * @param mintYear is the year that the coin was minted
 */
    public Coin(double value, String country){
        this.value = value;
        this.country = country;
    }

    public double getValue(){
        return value;
    }

    public String getCountry(){
        return country;
    }

}
