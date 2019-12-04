/**
 * this class represents a Node Class with values of char
 * 
 *Every Node object contains a value
 *LinkedList class maintains insertion order.
 */

package dataStructures.nodes;

public class StringNode extends Node {
	
	/* Fields */
	
	/**
	 * integer value of the Node
	 */
	private char value;
	
	
	/* Constructors */
	
	/**
	 * Default Node constructor
	 *
	 * @param  value   the value that will be stored in the Node
	 * @return         null
	 */
	public StringNode(char value) {
		super();
		this.value = value;
	}


	/* Getters */
	public char getValue() {
		return value;
	}

	/* Setters */
	public void setValue(char value) {
		this.value = value;
	}
	
	
	/* ToString */
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
	
	
	
}//end class