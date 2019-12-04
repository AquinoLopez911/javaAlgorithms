/**
 * this class represents a Node Class with values of int
 * 
 *Every Node object contains a value
 *LinkedList class maintains insertion order.
 */

package dataStructures.nodes;

public class IntNode extends Node {
	
	/* Fields */
	
	/**
	 * integer value of the Node
	 */
	private int value;
	
	
	/* Constructors */
	
	/**
	 * Default Node constructor
	 *
	 * @param  value   the value that will be stored in the Node
	 * @return         null
	 */
	public IntNode(int value) {
		super();
		this.value = value;
	}


	/* Getters */
	public int getValue() {
		return value;
	}

	/* Setters */
	public void setValue(int value) {
		this.value = value;
	}
	
	
	/* ToString */
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
	
	
	
}//end class
