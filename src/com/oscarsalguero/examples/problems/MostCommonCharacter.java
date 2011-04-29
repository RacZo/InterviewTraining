package com.oscarsalguero.examples.problems;

import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
	
	
	public MostCommonCharacter(){//This is what I coded
		String str = "This is a Google problem in an interview";
		String temp = new String();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		Character currentMostCommonChar = null;
		int currentMaxCharCount = 0;
		char currChar;
		for(int i = 0; i <str.length(); i++){
			currChar = str.charAt(i);
			if(map.containsKey(currChar)){
				map.put(currChar, map.get(currChar) + 1);	
			}else{
				map.put(currChar, 1);
				temp += currChar;
			}
			int currCharCount = map.get(currChar).intValue();
			if (currCharCount > currentMaxCharCount) {
				currentMostCommonChar = currChar;	
			}
		}
		System.out.println(currentMostCommonChar + " is the most common character.");
	}
	
	
	public MostCommonCharacter(String str){
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    String temp = new String();
	    Character currentMostCommonChar = null;
	    int currentMaxCount = 0;
	    for (int i = 0; i < str.length(); i++) {
	      if ( map.containsKey(str.charAt(i))) {
	        map.put (str.charAt(i), map.get(str.charAt(i)) + 1 );
	      } else {
	        map.put (str.charAt(i), 1);
	        temp += str.charAt (i);
	      }
	    }
	    for(Map.Entry item:map.entrySet()){
	        //System.out.println(item.getKey() + ": " + item.getValue());
	        if(Integer.parseInt(item.getValue().toString()) > currentMaxCount){
	        currentMaxCount = Integer.parseInt(item.getValue().toString());
	        currentMostCommonChar = (Character) item.getKey();
	        }
	  	}
	    System.out.println("'" + currentMostCommonChar + "' is the most common character.");
	}
	
	public static void main(String[] args){
		new MostCommonCharacter("This is a Google problem in an interview");
		
	}
}
