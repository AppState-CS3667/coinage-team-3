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
    protected Composition comp;


/**
 * Constructor
 * @param value is the value of the coin
 * @param country is the country of origin
 * @param motto is the motto on th coin
 * @param metallicComposition is what metals the coin is made out of
 * @param mintYear is the year that the coin was minted
 */

    public Coin(double value, String country, Composition comp){
        this.value = value;
        this.country = country;
        this.comp = comp;
    }

    public double getValue(){
        return value;
    }

    public String getCountry(){
        return country;
    }

    public void smelt(){
        comp.smelt();
    }

    private static class NullCoin extends Coin{
        //I am not sure if the constructor should be null or not
        NullCoin(){
            super(0, null, null);
        }
        @Override
        public double getValue(){
            return null;
        }

        public String getCountry(){
            return null;
        }
    }
    public static Coin NULL = new NullCoin();

}
