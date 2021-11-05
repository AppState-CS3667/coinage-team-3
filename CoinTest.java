import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CoinTest {
    double expectedValue = 0;
    String expectedCountry = "TestingCoin";

    @BeforeEach
    public void init() {
        Coin c = new DummyCoin();
    }

    @Test
    public void testValue(){
        assertTrue((expectedValue == c.getValue()), 
                   "Expected " + expectedValue + " but got "
                   + c.getValue());
    }

    @Test
    public void testCountry(){
        assertTrue((expectedCountry.equals(c.getCountry)), 
                   "Expected " + expectedCountry + " but got "
                   + c.getCountry());
    }

    public class DummyCoin extends Coin{
        public DummyCoin(){
            super(0, "TestingCoin");
        }
    }
}
