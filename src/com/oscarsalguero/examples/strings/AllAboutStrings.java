package com.oscarsalguero.examples.strings;

public class AllAboutStrings {
	
	public AllAboutStrings(){
		
		//About the Basics
		
		//Creating an instasnce of String
		//String str = new String();
		
		//Assigning a value
		// = "realactionsoft";
		
		String str = "realactionsoft"; //Creates a new String Object and one reference variable. The str variable REFERS to "realactionsoft" in the heap (a dynamic area on the memory)
		
		/* Once a String Object is created, it can never be changed, it's frozen 
		 * (it is inmutable), but it's reference variable is not.
		 */
		
		//This is are alternate ways to create and assign at once
		//String str = new String("realactionsoft");//Creates 2 Objects and one reference variable
		
		System.out.println(str);
		
		//Let's make a REFERENCE to str
		String strRef = str; //The strRef variable also REFERS to the same "realactionsoft" in the heap
		System.out.println(strRef);
		
		//We can concatenate (append) more stuff with the concat method
		str = str.concat(" rocks!");
		System.out.println(str);
		
		/* As "realactionsoft" is an inmutable thing, we have now 3 String Objects one for  
		 * "realactionsoft", other for " rocks!" and the last one is the result result of the concat, "realactionsoft rocks!"
		 * and in the heap we have two strings 
		 */
		
		//We can create UNREFERENCED strings in memory, but it is a non-sense, since there is no way to retrieve them
		str.concat(" Let's hack!");//The string "realactionsoft rocks! Let's hack!" is created in the memory but there is no referene to it.
		System.out.println(str);
		
		//If we really want to do it, then we will REFER a variable we can use later to the concat operation
		str = str.concat(" Let's hack!");
		System.out.println(str);
		
		//Important methods in String
		System.out.println("Character at position o " +str.charAt(0));
		
		//The concat method we used before, + and += performs similar
		
		System.out.println("It's equal to 'Oscar' ignoring case: " + str.equalsIgnoreCase("Oscar"));
		
		System.out.println("Length: " + str.length());
		
		System.out.println("Replace r with R: " + str.replace('r', 'R'));
		
		System.out.println(str.substring(0,14) + " is a substring of " + str);
		
		System.out.println("Lowercase: " + str.toLowerCase());
		
		System.out.println("Uppercase: " + str.toUpperCase());
		
		System.out.println("Getting rid of trailing blank spaces: " + new String("   El Salvador   ").trim());
		
		
		//About String Buffer and StringBuilder
		
		/* You use them when you have to do a lot of modifications to strings of characters.
		 * 
		 * If you work only with String Objects on intensive operations with strings you'll
		 * fill the heap with a bunch of abandoned String objects.
		 * 
		 * StringBuffer and StringBuilder Objects can be modified without leaving waste on the heap
		 */
		
		//Now let's use a StringBuffer
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");//It's a synchronized method
		System.out.println("sb = " + sb);
		
		//StringBuilder is a faster non-synchronized StringBuffer
		StringBuilder sbr = new StringBuilder("abc");
		sbr.append("def").reverse().insert(3, "---");//We can chain other methods
		System.out.println(sbr);
		
		//We can allocate StringBuffer size if we know the length of the String
		StringBuffer sbFixedCapacity = new StringBuffer(3);
		sbFixedCapacity.append("xyz");
		System.out.println(sbFixedCapacity);
		
	}
	
	
	public static void main(String args[]){
		new AllAboutStrings();
	}
	
}
