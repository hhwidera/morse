package org.widera.morse.value;

import java.util.Arrays;

public enum MorseCode {
    LETTER_SPACE(MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP),
    WORLD_SPACE(MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP, MorseSymbol.GAP),
    A(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH),
    B(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT),
    C(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT),
    D(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT),
    E(MorseSymbol.DOT),
    F(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT),
    G(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT),
    H(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT),
    I(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT),
    J(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH),
    K(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH),
    L(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT),
    M(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH),
    N(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT),
    O(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH),
    P(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT),
    Q(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH),
    R(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT),
    S(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT),
    T(MorseSymbol.DASH),
    U(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH),
    V(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH),
    W(MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH),
    X(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH),
    Y(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH),
    Z(MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DASH, MorseSymbol.GAP, MorseSymbol.DOT, MorseSymbol.GAP, MorseSymbol.DOT);

    private final MorseSymbol[] symbols;

    MorseCode(final MorseSymbol... symbols) {
        this.symbols = symbols;
    }

    public MorseSymbol[] getSymbols() {
        return this.symbols;
    }

    @Override
    public String toString() {
        String result = "";
        for (MorseSymbol symbol : symbols) {
            result += symbol.toString();
        }
        return result;
    }

}
