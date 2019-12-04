/*
 * this class represents a parent LinkedList Class
 * 
 *LinkedList class can contain duplicate elements.
 *LinkedList class maintains insertion order.
 */
package dataStructures.linkedLists;
import dataStructures.nodes.*;

public class LinkedList {
	
	/* FIELDS */
	
	/**
	 * pointer to the first Node
	 */
	protected Node head;
	
	/**
	 * pointer to the last Node
	 */
	protected Node tail;
	
	/**
	 * boolean to see if the LinkedList is empty
	 */
	protected boolean empty;
	
	
	/* CONSTRUCTORS */
	/**
	 * Default LinkedList constructor
	 *
	 * @param  null
	 * @return null
	 */
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.empty = isEmpty();
	}
	
	

	/* GETTERS */
	
	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}


	public boolean isEmpty() {
		empty = this.head == null;
		return empty;
	}




	/* SETTERS */
	public void setHead(Node head) {
		this.head = head;
	}
	
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	/* LINKEDLIST METHODS */
	
	
	/**
	 * Iterates through the LinkedList STARTING FROM THE TAIL
	 * and sets the LinkedList tail to the last node in LinkedList
	 *
	 * @param  null
	 * @return null
	 */
	public void findTail() {
		Node runner = this.head;
		
		while(runner.getNext() != null) {
			runner = runner.getNext();
		}
		
		this.setTail(runner);
	}
	
	
	/**
	 * Iterates through the LinkedList and returns the number of nodes in the LinkedList
	 *
	 * @param  null
	 * @return numberOfNodes
	 */
	public int countNodes() {
		Node runner = this.head;
		int numberOfNodes = 0;
		
		while(runner != null) {
			numberOfNodes++;
			runner = runner.getNext();
		}
		
		return numberOfNodes;
	}//end countNodes
	
	
	
	
	
	
	
	
	
	

	
	/* ALGORITHMS */
	
	
	
	
	
	
	

	
	
	
	/* TOSTRING */
	
	@Override
	public String toString() {
		
		StringBuffer buff = new StringBuffer("nodes in list are:");
		
		//this should be in child classes
//		Node runner = this.head;
//		while(runner != null) {
//			 buff.append(String.valueOf(runner.getValue()));
//			 if(runner.getNext() != null){
//               buff.append("-> ");
//	         }
//	         runner = (IntNode) runner.getNext();
//	    }
//		
//		System.out.println(buff.toString());
//      System.out.println("LinkedList head: " + this.head);
//      System.out.println("LinkedList tail: " + this.tail);
		return buff.toString();
	}//end toString
	
	

}//end LinkedList class
