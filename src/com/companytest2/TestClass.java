package com.companytest2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int i) {
        return "";
    }
}