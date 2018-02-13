package org.widera.morse.value;

public enum MorseSymbol {
    DOT('.'),
    DASH('-'),
    GAP(' ');

    private final char codeChar;

    MorseSymbol(final char codeChar) {
        this.codeChar = codeChar;
    }

    public char code() {
        return this.codeChar;
    }

    @Override
    public String toString() {
        return String.valueOf(this.codeChar);
    }

}
