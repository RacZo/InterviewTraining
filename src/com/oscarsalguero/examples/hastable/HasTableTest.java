/**
 * 
 */
package com.oscarsalguero.examples.hastable;

/**
 * @author Oscar Salguero
 *
 */
public class HasTableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap hashTable = new HashMap();
		
		hashTable.put(0,1);
		hashTable.put(1,2);
		hashTable.put(2,3);
		hashTable.put(3,4);
		hashTable.put(4,5);
		
		int i = 3;
		System.out.println("Item at position " + i + ": " + hashTable.get(i));

	}

}
