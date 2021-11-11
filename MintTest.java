import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class MintTest {
    MintFactory usd;
    PrintStream originalOut;
    ByteArrayOutputStream baos;
    PrintStream newOut;

    @BeforeEach
    public void init(){
        usd = USDMintFactory.getInstance();
        originalOut = System.out;
        baos = new ByteArrayOutputStream();
        newOut = new PrintStream(baos);
        System.setOut(newOut);
    }

    @AfterEach
    public void cleanup(){
        System.setOut(originalOut);
    }

    /*
    * Passes if none of the makeCoin denoms fail
    */
    @Test
    public void testMakeCoin(){
        Coin c = usd.makeCoin(1.00);
        c = usd.makeCoin(0.50);
        c = usd.makeCoin(0.25);
        c = usd.makeCoin(0.10);
        c = usd.makeCoin(0.01);
        assertTrue(true);
    }

    @Test
    public void testInspect(){
        usd.inspect();

        System.out.flush();
        String actualOutput = baos.toString();
        String expectedOutput0 = "Inspection Passed...\n";
        String expectedOutput1 = "Inspection Failed...\n";
        Boolean ans = actualOutput.equals(expectedOutput0) ||
                      actualOutput.equals(expectedOutput1);
        //originalOut.println(actualOutput);
        assertTrue(ans);

    }

    @Test
    public void testSmoothing(){
        usd.smoothing();

        System.out.flush();
        String actualOutput = baos.toString();
        String expectedOutput0 = "Smoothing Passed...\n";
        String expectedOutput1 = "Smoothing Failed...\n";
        Boolean ans = actualOutput.equals(expectedOutput0) ||
                      actualOutput.equals(expectedOutput1);
        assertTrue(ans);
    }

    @Test 
    public void testBuffing(){
        usd.buffing();

        System.out.flush();
        String actualOutput = baos.toString();
        String expectedOutput0 = "Buffing Passed...\n";
        String expectedOutput1 = "Buffing Failed...\n";
        Boolean ans = actualOutput.equals(expectedOutput0) ||
                      actualOutput.equals(expectedOutput1);
        originalOut.println(actualOutput);

        assertTrue(ans);
    }
}
