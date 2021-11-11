public class CadNickel extends Coin {
    public CadNickel(double value, String country){
        super(value, country, new UnknownComp());
    }
}