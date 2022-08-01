package com.se.day17;

/**
 * @author asd
 */

public enum Rank {
    FIR("1"),
    SEC("2"),
    THI("3"),
    FOU("4"),
    FIV("5"),
    SIX("6"),
    SEV("7"),
    EIG("8"),
    NIG("9"),
    TEN("10"),
    J("J"),
    Q("Q"),
    K("K");
    private String value;
    private Rank(String value) {
        this.value = value;
    }
    private Rank(){

    }

    public String getValue() {
        return value;
    }
}
