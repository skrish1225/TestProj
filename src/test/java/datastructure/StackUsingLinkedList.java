package datastructure;

import java.util.LinkedList;

import javax.swing.Popup;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList sull = new StackUsingLinkedList();
		
		sull.push(10);
		sull.push(11);
		/*System.out.println(sull.pop());
		System.out.println(sull.pop());*/
		
		
		
	}

	
	Node head;
	
	class Node{
		int value;
		Node next; 
	}
	public StackUsingLinkedList() {
		head = null;
	}
	
	public void push(int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
		
	}
	
	
	public int pop() {
		if(head==null) {
			System.out.println("Stack is empty");
		}
		int value = head.value;
		head = head.next;
		return value;
		
	}
	
	
	
}
