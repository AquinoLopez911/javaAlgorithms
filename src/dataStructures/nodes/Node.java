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
	 * pointer to the next Node
	 */
	protected Node next;
	
	
	/* Constructors */
	
	/**
	 * Default Node constructor
	 *
	 * @param   
	 * @return  null
	 */
	public Node() {
		this.next = null;
	}


	/* Getters */


	public Node getNext() {
		return next;
	}

	/* Setters */
	


	public void setNext(Node next) {
		this.next = next;
	}
	
	
	/* ToString */
	@Override
	public String toString() {
		return "node with no value";
	}
	
	
	
	
}//end class