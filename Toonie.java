public class Toonie extends Coin {
    public Toonie(double value, String country){
        super(value, country, new UnknownComp());
    }

}