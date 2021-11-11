package temp;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Dollar;
import HalfDollar;

public class SmeltingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void smeltingCoin() {
        fail("Created SmeltingTest");
    }

    @Test
    public void smeltingDollar() {
        Dollar dollar = new Dollar(.25, "USA");
        dollar.smelt();
        assertEquals(outContent.toString(), "Smelting with a composition of:\n"
                           + "88.5% Cu\n6% Zi\n3.5% Mn\n2% Ni");
    }

    @Test
    public void smeltingHalfDollar() {
        HalfDollar dollar = new HalfDollar(.25, "USA");
        dollar.smelt();
        assertEquals(outContent.toString(), "Smelting with a composition of:\n"
                           + "88.5% Cu\n6% Zi\n3.5% Mn\n2% Ni");
    }
}
