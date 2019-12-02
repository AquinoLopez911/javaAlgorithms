package dataStructures.algorithms;

public class RandomAlgos {
	
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
	
	
}//end class
