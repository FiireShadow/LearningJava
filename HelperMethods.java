package introToFuncProgramming;

import unit3.Node;

public class HelperMethods {
	Node head;
	
	public void displayContents() {
		Node current = head; //Starts at first number
		while (current!=null) { // # -> # -> # -> null
			System.out.print(current.data + " ");
			current =current.next; //Goes to next number
		}
		System.out.println();
	}
	
	
	public void deleteSecondHalf() {
		if (head==null || head.next==null) {
			head = null;
		}
		
		Node one = head;
		Node two = head;
		Node prev = null;
		
		while (two!=null&&two.next!=null) {
			two = two.next.next; //iterates at twice the speed of one to delete half
			prev =one;
			one = one.next;
		}
		
		prev.next=null;	
	}
	
	public void deleteKthNode(int k) {
		if (head ==null || k==0) {
			return;
		}
		
		Node first = head;
		Node second = head;
		
		for (int i=0; i<k;i++) {
			second = second.next;
			if (second.next==null) {
				if (i==k-1) 
					head=head.next; //Deletes first node if k = amount of numbers 
				return;
			}
		}
		while (second.next!=null) {//Iterates until second is null so that 
			first=first.next;
			second=second.next;	
		}
		first.next=first.next.next; //Skips over number that is deleted
	}

}
