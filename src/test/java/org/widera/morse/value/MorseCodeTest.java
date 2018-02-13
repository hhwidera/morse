package org.widera.morse.value;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeTest {

    @Test
    public void testCodeLetterSpace() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP}, MorseCode.LETTER_SPACE.getSymbols());
    }

    @Test
    public void testCodeWorldSpace() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP}, MorseCode.WORLD_SPACE.getSymbols());
    }

    @Test
    public void testCodeA() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.A.getSymbols());
    }

    @Test
    public void testCodeB() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.B.getSymbols());
    }

    @Test
    public void testCodeC() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.C.getSymbols());
    }

    @Test
    public void testCodeD() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.D.getSymbols());
    }

    @Test
    public void testCodeE() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT}, MorseCode.E.getSymbols());
    }

    @Test
    public void testCodeF() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.F.getSymbols());
    }

    @Test
    public void testCodeG() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.G.getSymbols());
    }

    @Test
    public void testCodeH() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.H.getSymbols());
    }

    @Test
    public void testCodeI() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.I.getSymbols());
    }

    @Test
    public void testCodeJ() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.J.getSymbols());
    }

    @Test
    public void testCodeK() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.K.getSymbols());
    }

    @Test
    public void testCodeL() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.L.getSymbols());
    }

    @Test
    public void testCodeM() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.M.getSymbols());
    }

    @Test
    public void testCodeN() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.N.getSymbols());
    }

    @Test
    public void testCodeO() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.O.getSymbols());
    }

    @Test
    public void testCodeP() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.P.getSymbols());
    }

    @Test
    public void testCodeQ() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.Q.getSymbols());
    }

    @Test
    public void testCodeR() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.R.getSymbols());
    }

    @Test
    public void testCodeS() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.S.getSymbols());
    }

    @Test
    public void testCodeT() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH}, MorseCode.T.getSymbols());
    }

    @Test
    public void testCodeU() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.U.getSymbols());
    }

    @Test
    public void testCodeV() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.V.getSymbols());
    }

    @Test
    public void testCodeW() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.W.getSymbols());
    }

    @Test
    public void testCodeX() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.X.getSymbols());
    }

    @Test
    public void testCodeY() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH}, MorseCode.Y.getSymbols());
    }

    @Test
    public void testCodeZ() {
        assertArrayEquals(new MorseSymbol[]{MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT}, MorseCode.Z.getSymbols());
    }


    @Test
    public void testToStringLetterSpace() {
        assertEquals("   ", MorseCode.LETTER_SPACE.toString());
    }

    @Test
    public void testToStringWorldSpace() {
        assertEquals("       ", MorseCode.WORLD_SPACE.toString());
    }

    @Test
    public void testToStringA() {
        assertEquals(". -", MorseCode.A.toString());
    }

    @Test
    public void testToStringB() {
        assertEquals("- . . .", MorseCode.B.toString());
    }

    @Test
    public void testToStringC() {
        assertEquals("- . - .", MorseCode.C.toString());
    }

    @Test
    public void testToStringD() {
        assertEquals("- . .", MorseCode.D.toString());
    }

    @Test
    public void testToStringE() {
        assertEquals(".", MorseCode.E.toString());
    }

    @Test
    public void testToStringF() {
        assertEquals(". . - .", MorseCode.F.toString());
    }

    @Test
    public void testToStringG() {
        assertEquals("- - .", MorseCode.G.toString());
    }

    @Test
    public void testToStringH() {
        assertEquals(". . . .", MorseCode.H.toString());
    }

    @Test
    public void testToStringI() {
        assertEquals(". .", MorseCode.I.toString());
    }

    @Test
    public void testToStringJ() {
        assertEquals(". - - -", MorseCode.J.toString());
    }

    @Test
    public void testToStringK() {
        assertEquals("- . -", MorseCode.K.toString());
    }

    @Test
    public void testToStringL() {
        assertEquals(". - . .", MorseCode.L.toString());
    }

    @Test
    public void testToStringM() {
        assertEquals("- -", MorseCode.M.toString());
    }

    @Test
    public void testToStringN() {
        assertEquals("- .", MorseCode.N.toString());
    }

    @Test
    public void testToStringO() {
        assertEquals("- - -", MorseCode.O.toString());
    }

    @Test
    public void testToStringP() {
        assertEquals(". - - .", MorseCode.P.toString());
    }

    @Test
    public void testToStringQ() {
        assertEquals("- - . -", MorseCode.Q.toString());
    }

    @Test
    public void testToStringR() {
        assertEquals(". - .", MorseCode.R.toString());
    }

    @Test
    public void testToStringS() {
        assertEquals(". . .", MorseCode.S.toString());
    }

    @Test
    public void testToStringT() {
        assertEquals("-", MorseCode.T.toString());
    }

    @Test
    public void testToStringU() {
        assertEquals(". . -", MorseCode.U.toString());
    }

    @Test
    public void testToStringV() {
        assertEquals(". . . -", MorseCode.V.toString());
    }

    @Test
    public void testToStringW() {
        assertEquals(". - -", MorseCode.W.toString());
    }

    @Test
    public void testToStringX() {
        assertEquals("- . . -", MorseCode.X.toString());
    }

    @Test
    public void testToStringY() {
        assertEquals("- . - -", MorseCode.Y.toString());
    }

    @Test
    public void testToStringZ() {
        assertEquals("- - . .", MorseCode.Z.toString());
    }
}