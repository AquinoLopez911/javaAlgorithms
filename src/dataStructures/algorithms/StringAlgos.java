package dataStructures.algorithms;

import dataStructures.linkedLists.*;
import dataStructures.nodes.StringNode;


public class StringAlgos {
	
	//Day 2
	/**
	 *  isPalindrom: &nbsp
	 *  check to see if the input word is a palindrom
	 *
	 * @param  word:  word to check 
	 * @return palindrom: true or false 
	 */
	public static boolean isPalindrom(String word) {
		
		boolean palindrom = false;
		int i = 0;
		int j = word.length() - 1;
		
		while(i < j) {
			if(word.charAt(i) == word.charAt(j)) {
				palindrom = true;
				i++;
				j--;
			}
			else {
				System.out.println("not a palindrom");
				return false;
			}
			
		}
		System.out.println(palindrom);
		return palindrom;	
	}//end isPalindrom
	
	
	//Day 4
	/**
	*  balencedParentheses: &nbsp
	*  check to see if the input String has closing (,{,[ for every ),},]
	*
	* @param  s:  String to check 
	* @return balanced: true or false 
	*/
	public static boolean balencedParentheses(String s) {
			
		LinkedList stack = new StringLinkedList();
		
		boolean balanced = false;
		
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			
			if(x == '(' || x == '{' || x == '[') {
				((StringLinkedList) stack).append(x);
				stack.toString();
			}
			else {			
				switch(x) {
				case ')':
					if(((StringNode) stack.getTail()).getValue() == '(') {
						((StringLinkedList) stack).pop();
						stack.toString();
					}
					break;
				case '}':
					if(((StringNode) stack.getTail()).getValue() == '{') {
						((StringLinkedList) stack).pop();
						stack.toString();
					}
					break;
				case ']':
					if(((StringNode) stack.getTail()).getValue() == '[') {
						((StringLinkedList) stack).pop();
						stack.toString();
					}
					break;
				}
			}
		}
		balanced = stack.isEmpty();
		return balanced;
	}//end isPalindrom
	
	
}//end class
