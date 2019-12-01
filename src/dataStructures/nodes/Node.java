/**
 * this class represents a parent Node Class
 * 
 *Every Node object contains a value
 *LinkedList class maintains insertion order.
 */

package dataStructures.nodes;

public class Node {
	
	/* Fields */
	
	/**
	 * integer value of the Node
	 */
	private int value;
	
	/**
	 * pointer to the next Node
	 */
	private Node next;
	
	
	/* Constructors */
	
	/**
	 * Default Node constructor
	 *
	 * @param  value   the value that will be stored in the Node
	 * @return         null
	 */
	public Node(int value) {
		this.value = value;
		this.next = null;
	}


	/* Getters */
	public int getValue() {
		return value;
	}


	public Node getNext() {
		return next;
	}

	/* Setters */
	public void setValue(int value) {
		this.value = value;
	}


	public void setNext(Node next) {
		this.next = next;
	}
	
	
	/* ToString */
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
	
	
	
}//end class
