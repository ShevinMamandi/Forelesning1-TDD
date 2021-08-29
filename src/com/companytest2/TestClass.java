package com.companytest2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    RomanNrConverter converter;
    @Test
    public void shouldConvert1ToI() {
        converter = new RomanNrConverter();
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public  void shouldConvert2ToII(){
        converter = new RomanNrConverter();
        assertEquals("II",converter.toRoman(2));

    }
}
