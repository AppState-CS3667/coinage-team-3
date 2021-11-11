
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class SmeltingTest {

PrintStream originalOut;
    ByteArrayOutputStream baos;
    PrintStream newOut;

    @BeforeEach
    public void init(){
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

    }*/

    @Test
    public void smeltingDollar() {
        Dollar dollar = new Dollar(.25, "USA");
        dollar.smelt();
        System.out.flush();
        String actualOutput = baos.toString();
        String expectedOutput0 = "Smelting with a composition of:\n"
                           + "88.5% Cu\n6% Zi\n3.5% Mn\n2% Ni\n";
        Boolean ans = actualOutput.equals(expectedOutput0);
        assertTrue(ans);
    }

    @Test
    public void smeltingHalfDollar() {
        HalfDollar dollar = new HalfDollar(.25, "USA");
        dollar.smelt();
        System.out.flush();
        String actualOutput = baos.toString();
        String expectedOutput0 = "Smelting with a composition of:\n"
                                 + "91.67% Cu\n8.33% Ni\n";
        Boolean ans = actualOutput.equals(expectedOutput0);
        assertTrue(ans);
    }

    @Test
    public void Dime() {
        Dime dollar = new Dime(.1, "USA");
        dollar.smelt();
        System.out.flush();
        String actualOutput = baos.toString();
        String expectedOutput0 = "Smelting with a composition of:\n"
                                 + "91.67% Cu\n8.33% Ni\n";
        Boolean ans = actualOutput.equals(expectedOutput0);
        assertTrue(ans);
    }
}
