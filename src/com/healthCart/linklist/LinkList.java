package com.healthCart.linklist;

public class LinkList {

	private Node head;
	private int length;

	public int add(Node node, int position) {
		if (node == null || position < 0)
			return -1;

		Node currentNode = head;
		int pos = 0;
		if (currentNode == null) {
			head = node;
			length++;
			return pos;
		}

		while (currentNode.nextNode != null) {
			pos++;
			currentNode = currentNode.nextNode;
		}

		currentNode.nextNode = node;
		length++;
		return pos;

	}
	
	public int add(Node node){
		
		Node currentNode =  this.head;
		if (currentNode == null){
			this.head = node;
			length++;
			return 0;
		}
		
		while(currentNode.nextNode !=null) {
			
			currentNode = currentNode.nextNode;
		}
		
		currentNode.nextNode = node;
		length++;
		return length-1;
	}

	public boolean remove(int position) {

		if (position< 0 || position > this.length()-1) return false;
		
		Node currentNode = head;
		Node previousNode = null;
		int i = 0;
		if ( position == 0 ) {
			this.head = this.head.nextNode;
			this.length--;
			return true;
		}
		
		while( i < position ) {
			
			
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
			i++;
			
			
			
		}
		this.length--;
		previousNode.nextNode = currentNode.nextNode;
		return true;
		
	}

	public void print()
	{
		Node currentNode = this.head;
		while(currentNode != null ){
			System.out.println(currentNode.data);
			currentNode = currentNode.nextNode;
		}
		
	}
	
	public boolean contains(Node node)
	{
		if ( this.head == null) return false;
		
		Node  currentNode = this.head;
		
		while(currentNode != null) {
			
			 if (currentNode == node && currentNode.data ==  node.data) return true;
			 
			 currentNode = currentNode.nextNode;
			
		}
		
		return false;
		
	}
	public int length() {
		return this.length;
	}
	
	
	
	public boolean isCyclic()
	{
		
		Node slowPointer = this.head;
		Node fastPointer = this.head.nextNode;
		
		if ( slowPointer == null || fastPointer == null) return false;
		
		
		while(true ){
			
			slowPointer = slowPointer.nextNode;
			fastPointer = fastPointer.nextNode;
			
			if (fastPointer.nextNode != null ) fastPointer = fastPointer.nextNode;
			else {
				return false;
			}
			 
			
			 
			 if (slowPointer == fastPointer) {
				 return true;
			 }
			
			
		}
	}
	
	public void  reverse()
	{
		
		Node currentNode = this.head;
		Node previousNode = null;
		Node tempNode = null;
		if (currentNode == null || this.head.nextNode ==null) return ;
		
		while (currentNode !=null){
			
			
			tempNode = currentNode.nextNode;
			
			
			currentNode.nextNode = previousNode;
			
			previousNode = currentNode;
			
			currentNode = tempNode;
			
			
		}
		
		this.head = previousNode;
		
		
	}
}
