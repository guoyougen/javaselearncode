package com.se.day17;

import java.util.Objects;

/**
 * @projectname: javalearncode
 * @packname: com.se.day17
 * @classname: JokerCard
 * @author: gyg
 * @date: 2022/8/2 上午 2:12
 * @version: 1.0
 * @description:
 */

public class JokerCard extends Card{
    private String text;

    public JokerCard(String text) {
        super();
        this.text = text;
    }
    public JokerCard(){
        super();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(text);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JokerCard jokerCard = (JokerCard) o;
        return Objects.equals(text, jokerCard.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
}
