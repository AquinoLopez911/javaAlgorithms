package dataStructures;
import dataStructures.linkedLists.*;
//import dataStructures.nodes.*;

public class Run {

	public static void main(String[] args) {
		
	LinkedList ll = new LinkedList();
	
	
	ll.append(3);//3
	ll.append(4);//4
	ll.append(3);
	ll.append(7);//7
	ll.append(6);//6
	ll.append(6);
	ll.append(9);//9
	ll.append(4);
	ll.append(6);
	ll.append(12);//12
	ll.append(7);
	ll.append(3);
	ll.append(4);
	ll.append(3);
	ll.append(7);
	ll.append(5);//5
	ll.append(6);
	ll.append(10);//10
	ll.append(4);
	ll.append(5);
	ll.append(12);
	ll.append(7);
	
	
	ll.toString();
	
	ll.removeDuplicates();
	System.out.println("****************************************************");
	ll.toString();
	
	
	
		
		
	}//end main

}//end class
