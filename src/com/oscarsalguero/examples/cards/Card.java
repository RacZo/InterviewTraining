package com.oscarsalguero.examples.cards;

public class Card {
	
	public enum Color {
	    BLACK, RED
	}
	
	public enum Type {
	    DIAMONDS, HEARTS, CLUBS, SPADES
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
