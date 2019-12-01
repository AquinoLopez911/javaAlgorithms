/*
 * this class represents a parent LinkedList Class
 * 
 *LinkedList class can contain duplicate elements.
 *LinkedList class maintains insertion order.
 */
package dataStructures.linkedLists;
import dataStructures.nodes.Node;

public class LinkedList {
	
	/* FIELDS */
	
	/**
	 * pointer to the first Node
	 */
	private Node head;
	
	/**
	 * pointer to the last Node
	 */
	private Node tail;
	
	/**
	 * boolean to see if the LinkedList is empty
	 */
	private boolean empty;
	
	
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
	
	/**
	 * overloaded LinkedList constructor
	 *
	 * @param  int value
	 * @return null
	 */
	public LinkedList(int value) {
		this.head = new Node(value);
		this.tail = this.head;
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
	
	
	/**
	 * adds a node to the end of the LinkedList 
	 *
	 * @param  Node node
	 * @return null
	 */
	public void append(int newNodeValue) {
		Node newNode = new Node(newNodeValue);
		
		
		if(this.isEmpty()) {				//if linkedList is empty, head and tail = newNode
			this.head = newNode;
			this.tail = newNode;
			this.empty = this.isEmpty();
		}
		else {								//else tail.next = newNode
			tail.setNext(newNode);
			this.setTail(tail.getNext());
		}
	}//end append
	
	
	
	
	
	
	
	

	
	/* ALGORITHMS */
	
	//Day 1
	/**
	 *  remove duplicate nodes from unsorted LinkedList 
	 *  ex. 1-> 2-> 4-> 2-> == 1-> 2-> 4->
	 *
	 * @param  null
	 * @return null
	 */
	public void removeDuplicates() {
		
		
		if(!this.isEmpty()) { 
			Node current = this.head; 											//keeps track of the node being compared to the Nodes in LinkedList
			
			while(current != null) {
				Node runner = current;											//goes thru the linked list to check for duplicates of the current node
				
				while(runner != null && runner.getNext() != null) {
					
					if(current.getValue() == runner.getNext().getValue()) {
						
						runner.setNext(runner.getNext().getNext()); 			//runner changes next so next time around his next is not a duplicate number 
					}
					else 
						runner = runner.getNext();
					
				}
				
				current = current.getNext();
		    }
			this.findTail();										
		}
		
	}//end removeDuplicates
	
	
	
	
	
	
	/* TOSTRING */
	
	@Override
	public String toString() {
		
		StringBuffer buff = new StringBuffer("nodes in list are:");
		
		Node runner = this.head;
		while(runner != null) {
			 buff.append(String.valueOf(runner.getValue()));
			 if(runner.getNext() != null){
               buff.append("-> ");
	         }
	         runner = runner.getNext();
	    }
		
		System.out.println(buff.toString());
        System.out.println("LinkedList head: " + this.head);
        System.out.println("LinkedList tail: " + this.tail);
		return buff.toString();
	}//end toString
	
	

}//end LinkedList class
