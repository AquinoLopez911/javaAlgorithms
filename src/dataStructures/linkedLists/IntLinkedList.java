/*
 * this class represents a parent LinkedList Class
 * 
 *LinkedList class can contain duplicate elements.
 *LinkedList class maintains insertion order.
 */
package dataStructures.linkedLists;
import dataStructures.nodes.IntNode;
import dataStructures.nodes.Node;

public class IntLinkedList extends LinkedList {
	
	/* FIELDS */
	
	
	
	/* CONSTRUCTORS */
	
	/**
	 * Default LinkedList constructor
	 *
	 * @param  null
	 * @return null
	 */
	public IntLinkedList() {
		super();
	}
	
	/**
	 * overloaded LinkedList constructor
	 *
	 * @param  int value
	 * @return null
	 */
	public IntLinkedList(int value) {
		super();
		this.head = new IntNode(value);
		this.tail = this.head;
		this.empty = isEmpty();
	}
	

	/* GETTERS */
	
	public IntNode getHead() {
		return (IntNode)head;
	}

	public IntNode getTail() {
		return (IntNode)tail;
	}


	public boolean isEmpty() {
		empty = this.head == null;
		return empty;
	}




	/* SETTERS */
	public void setHead(IntNode head) {
		this.head = head;
	}
	
	public void setTail(IntNode tail) {
		this.tail = tail;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	/* INTLINKEDLIST METHODS */
	
	
	/**
	 * adds a node with int value to the end of the LinkedList 
	 *
	 * @param  IntNode node
	 * @return null
	 */
	public void append(int newNodeValue) {
		IntNode newNode = new IntNode(newNodeValue);
		
		
		if(this.isEmpty()) {				//if linkedList is empty, head and tail = newNode
			this.head = newNode;
			this.tail = newNode;
			this.empty = this.isEmpty();
		}
		else {								//else tail.next = newNode
			tail.setNext(newNode);
			this.setTail((IntNode)tail.getNext());
		}
	}//end append
	
	
	
	
	/* ALGORITHMS */
	
	//Day 1
	/**
	 * remove duplicates: &nbsp
	 * remove duplicate nodes from unsorted LinkedList 
	 *  ex. 1-> 2-> 4-> 2-> == 1-> 2-> 4->
	 *
	 * @param  null
	 * @return null
	 */
	public void removeDuplicates() {
		
		
		if(!this.isEmpty()) { 
			IntNode current = (IntNode)this.head; 											//keeps track of the node being compared to the Nodes in LinkedList
			while(current != null) {
				IntNode runner = current;											//goes thru the linked list to check for duplicates of the current node
				while(runner != null && runner.getNext() != null) {
					if(current.getValue() == ((IntNode) runner.getNext()).getValue()) {
						runner.setNext(runner.getNext().getNext()); 			//runner changes next so next time around his next is not a duplicate number 
					}
					else {
						runner = (IntNode) runner.getNext();
					}
				}
				current = (IntNode) current.getNext();
		    }
			this.findTail();										
		}
	}//end removeDuplicates
	
	
	//Day 5
	/**
	*  swap: &nbsp
	*  swaps two adjacent nodes 
	*
	* @param  node1		first node
	* @param  node2		second node
	* @return null 
	*/
	public void swap(IntNode node1, IntNode node2 ) {
		
	}
	
	/**
	*  bubbleSort: &nbsp
	*  basic bubble sort with linkedList
	*
	* @param  null
	* @return null 
	*/
	public void bubbleSort() {
		
		
		for(int i = 0; i < this.countNodes()- 1; i++) {
			IntNode runner = (IntNode) this.head;
			while((IntNode) runner != (IntNode) this.tail) {
				
				if(runner.getValue() > ((IntNode) runner.getNext()).getValue()) {
					int temp = runner.getValue();
					
					runner.setValue(((IntNode) runner.getNext()).getValue());
					
					((IntNode) runner.getNext()).setValue(temp);
					
				}
				runner = (IntNode) runner.getNext();
			}
		}
	}
	
	
	/**
	*  shiftList: &nbsp
	*  shifts nodes to the right by a given number
	*
	* @param  shifts: the number of shifts wanted 
	* @return  null
	*/
	public IntLinkedList shiftList(int num) {
		
		int n = num % this.countNodes();
		
		if(n == 0) {
			return this;
		}
		else {
			IntNode runner = this.getHead();
			while(n > 0) {
				runner = (IntNode) runner.getNext();
				n -= 1;
				IntNode runner2 = this.getHead();
				while(runner.getNext() != null) {
					runner = (IntNode) runner.getNext();
					runner2 = (IntNode) runner2.getNext();
				}
				runner.setNext(this.getHead());
				this.setHead(runner2.getNext());
				runner2.setNext(null);
			}
		}
		this.findTail();
		return this;
		
	}
	
	
	
	
	
	

	
	
	
	/* TOSTRING */
	
	@Override
	public String toString() {
		
		StringBuffer buff = new StringBuffer(super.toString());
		
		IntNode runner = (IntNode)this.head;
		while(runner != null) {
			 buff.append(String.valueOf(runner.getValue()));
			 if(runner.getNext() != null){
               buff.append("-> ");
	         }
	         runner = (IntNode) runner.getNext();
	    }
		
		System.out.println(buff.toString());
        System.out.println("LinkedList head: " + this.head);
        System.out.println("LinkedList tail: " + this.tail);
		return buff.toString();
	}//end toString
	
	

}//end LinkedList class