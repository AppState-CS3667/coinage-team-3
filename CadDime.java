public class CadDime extends Coin {
    public CadDime(double value, String country){
        super(value, country, new UnknownComp());
    }
}