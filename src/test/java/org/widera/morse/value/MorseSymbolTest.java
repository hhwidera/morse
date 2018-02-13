package org.widera.morse.value;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseSymbolTest {

    @Test
    public void testCodeChars() {
        assertEquals('.', MorseSymbol.DOT.code());
        assertEquals('-', MorseSymbol.DASH.code());
        assertEquals(' ', MorseSymbol.GAP.code());
    }

    @Test
    public void testToString() {
        assertEquals(".", MorseSymbol.DOT.toString());
        assertEquals("-", MorseSymbol.DASH.toString());
        assertEquals(" ", MorseSymbol.GAP.toString());
    }

}