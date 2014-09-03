package com.oscarsalguero.examples.various;

/**
 * @author Oscar Salguero
 *
 */
public class Story {
	   public static void main(String[] args) {
	       Object o = null;
	       story(o);
	   }

	   private static void story(Object ... o) {//Note the strange notation here "..." ;)
	       if (o != null)
	           System.out.println("O noes!");
	   }
	}

