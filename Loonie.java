public class Loonie extends Coin {
    public Loonie(double value, String country){
        super(value, country, new UnknownComp());
    }

}