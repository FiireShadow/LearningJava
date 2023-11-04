//Created by: Edward Mankiewicz
//Created on: November 1st, 2023
//Purpose: To show basic understanding / progress of LinkedList

package introToFuncProgramming;

import unit3.Node;

public class LinkedListSummary {
	static Node head;

	public static void main(String[] args) {
		HelperMethods linkedList = new HelperMethods();
		
		Node firstNode = new Node(3);
		Node secondNode = new Node(5);
		Node thirdNode = new Node(7);
		Node fourthNode = new Node(9);
		Node fifthNode = new Node(4);
		
		linkedList.head = firstNode;
		firstNode.next = secondNode;
		secondNode.next=thirdNode;
		thirdNode.next=fourthNode;
		fourthNode.next=fifthNode;
		
		linkedList.deleteKthNode(2);
		linkedList.displayContents();
	}

}
