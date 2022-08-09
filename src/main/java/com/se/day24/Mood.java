package com.se.day24;

public enum Mood {
    SCARE("惊吓"), HAPPY("舒服");

    private String feel;

    private Mood(String feel) {
        this.feel = feel;
    }

    private Mood() {}

    public String getFeel() {
        return feel;
    }
}
