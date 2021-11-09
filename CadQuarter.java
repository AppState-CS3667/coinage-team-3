public class CadQuarter extends Coin {
    public CadQuarter(double value, String country){
        super(value, country, new UnknownComp());
    }
}