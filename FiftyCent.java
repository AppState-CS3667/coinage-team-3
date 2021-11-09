public class FiftyCent extends Coin {
    public FiftyCent(double value, String country){
        super(value, country, new UnknownComp());
    }
}