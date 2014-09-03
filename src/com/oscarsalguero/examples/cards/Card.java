package com.oscarsalguero.examples.cards;

public class Card {

	private static final int COLOR_RED = 1;
	private static final int COLOR_BLACK = 2;
	
	private static final int TYPE_DIAMOND = 1;
	private static final int TYPE_HEART = 2;
	private static final int TYPE_CLUB = 3;
	private static final int TYPE_SPADE = 4;
	
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
