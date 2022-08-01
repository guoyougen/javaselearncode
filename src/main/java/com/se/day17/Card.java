package com.se.day17;

import java.util.Objects;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: Card
 * @author: gyg
 * @date: 2022/8/2 上午 2:07
 * @version: 1.0
 * @description:
 */

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card() {

    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(suit.getValue()+rank.getValue());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
