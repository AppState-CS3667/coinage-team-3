public class Nickel extends Coin {
    public Nickel(double value, String country){
        super(value, country, new Cu75());
    }

}

