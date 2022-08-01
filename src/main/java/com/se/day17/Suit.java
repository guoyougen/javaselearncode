package com.se.day17;

/**
 * @author asd
 */

public enum Suit {
    BLC("黑"),
    RED("红"),
    PLUM("梅"),
    SQUARE("方");
    private String value;
    private Suit(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    private Suit(){

    }
}
