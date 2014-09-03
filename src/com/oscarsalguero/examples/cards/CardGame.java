package com.oscarsalguero.examples.cards;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CardGame {
	
	public static void play(){
		List<Card> cardList = new LinkedList<Card>(); 
		// Fill your list with Cards...
		cardList = shuffle(cardList);
	}
	
	public static List<Card> shuffle(List<Card> originalList){
		List<Card> shuffledList = new LinkedList<Card>();
		Random random = new Random();
		for(int i = 0; i <= originalList.size() ; i++){
			int randomIndex = random.nextInt(originalList.size());
			Card card = originalList.get(randomIndex);
			shuffledList.add(card);
			originalList.remove(randomIndex);
		}
		return shuffledList;
	} 
	
}
