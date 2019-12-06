/*
 * this class represents a parent LinkedList Class
 * 
 *LinkedList class can contain duplicate elements.
 *LinkedList class maintains insertion order.
 */
package dataStructures.linkedLists;
import dataStructures.nodes.*;


public class StringLinkedList extends LinkedList {
	
	/* FIELDS */
	
	
	
	/* CONSTRUCTORS */
	
	/**
	 * Default LinkedList constructor
	 *
	 * @param  null
	 * @return null
	 */
	public StringLinkedList() {
		super();
	}
	
	/**
	 * overloaded LinkedList constructor
	 *
	 * @param  char value
	 * @return null
	 */
	public StringLinkedList(char value) {
		super();
		this.head = new StringNode(value);
		this.tail = this.head;
		this.empty = isEmpty();
	}
	

	/* GETTERS */
	
	public StringNode getHead() {
		return (StringNode)head;
	}

	public StringNode getTail() {
		return (StringNode)tail;
	}


	public boolean isEmpty() {
		empty = this.head == null;
		return empty;
	}




	/* SETTERS */
	public void setHead(StringNode head) {
		this.head = head;
	}
	
	public void setTail(StringNode tail) {
		this.tail = tail;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	/* STRINGLINKEDLIST METHODS */
	
	
	/**
	 * adds a node with String value to the end of the LinkedList 
	 *
	 * @param  StringNode node
	 * @return null
	 */
	public void append(char c) {
		StringNode newNode = new StringNode(c);
		
		
		if(this.isEmpty()) {				//if linkedList is empty, head and tail = newNode
			this.head = newNode;
			this.tail = head;
			this.empty = this.isEmpty();
		}
		else {								//else tail.next = newNode
			tail.setNext(newNode);
			this.setTail((StringNode)tail.getNext());
		}
	}//end append
	
	/**
	 * removes the last node in the LinkedList
	 *
	 * @param  null
	 * @return value  the value of the node that was removed
	 */
	public char pop() {
		StringNode runner = (StringNode) this.head;
		char value;
		
		if(this.getHead() == this.getTail()) {
			System.out.println("only one node in list");
			value = this.getHead().getValue();
			this.setHead(null);
			return value;
		}
		else {
		
			while(runner.getNext() != this.getTail()) {
				runner = (StringNode) runner.getNext();
			}
			this.setTail(runner);
			value = ((StringNode) this.getTail().getNext()).getValue();
			this.tail.setNext(null);
			
			return value;
		}
		
	}
	
	
	
	
	/* ALGORITHMS */
	

	
	
	
	
	

	
	
	
	/* TOSTRING */
	
	@Override
	public String toString() {
		
		StringBuffer buff = new StringBuffer(super.toString());
		
		if(this.isEmpty()) {
			return " "; 
		}
		
		StringNode runner = (StringNode)this.head;
		while(runner != null) {
			 buff.append(String.valueOf(runner.getValue()));
			 if(runner.getNext() != null){
               buff.append("-> ");
	         }
	         runner = (StringNode) runner.getNext();
	    }
		
		System.out.println(buff.toString());
        System.out.println("LinkedList head: " + this.head);
        System.out.println("LinkedList tail: " + this.tail);
		return buff.toString();
	}//end toString
	
	

}//end LinkedList class