package com.oscarsalguero.examples.cards;

public class Card {
	
	public enum Color {
	    BLACK(1), RED(2);
	    private int value;
        private Color(int value) {
        	this.value = value;
        }
    }
	
	public enum Type {
	    DIAMONDS(1), HEARTS(2), CLUBS(3), SPADES(4);
	    private int value;
        private Type(int value) {
        	this.value = value;
        }
	}
	
	private int color;
	private String value;
	private int type;
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}	
	
}
