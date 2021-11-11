import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class NullCoinTest {

    @Test
    public void testCountry(){
        assertEquals(Coin.NULL.getCountry(), null);
    }

    @Test
    public void testValue(){
        assertEquals(Coin.NULL.getValue(), 0);
    }

}