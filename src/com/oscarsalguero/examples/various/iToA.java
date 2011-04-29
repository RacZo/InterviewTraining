package com.oscarsalguero.examples.various;

/**
 * @author Oscar Salguero
 *
 */
public class iToA {
	
	/* convert an integer into a string representation.
	   Algorithm: keeps dividing number by 10 and take the remainder.
	              stop when quotient becomes 0.
		      remembers if number was negative initially to print '-' sign.

	   WARNING: this program is intended to give you a rough idea of the algorithm.
	            Do not try to translate the program to assembly line by line.
	*/

	public static String convert(int x) { 
	        boolean negative = false;
		String s = "";
		if (x == 0) return "0";
		negative = (x<0);
		if (negative) x = -1 * x;
		while (x != 0)
		    {
			s = (char)(48 + (x % 10)) + s;  // add char to front of s
			x = x / 10;     // integer division gives quotient
		    }
		if (negative) s = "-" + s;
		return s;
	    } // convert


	public static void main(String[] args) {
	       int x = 3045;
	       System.out.println(convert(x));
	       x = -103;
	       System.out.println(convert(x));
	    }

}
