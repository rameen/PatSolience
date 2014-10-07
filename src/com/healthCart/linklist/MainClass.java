package com.healthCart.linklist;

public class MainClass {
	public static final long time = 30*24*60*60*1000L;
	
	public static void main(String args[])
	{
		
		System.out.println(time);
	}
	
/*	public static void main(String args[])
	{
		
		LinkList linkListone = new LinkList();
		
		
		Node firstNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node foNode = new Node(4);
		Node fiveNode = new Node(5);
		
		
		linkListone.add(firstNode);
		linkListone.add(secondNode);
		//linkListone.add(thirdNode);
		
		
		//linkListone.add(foNode, 3);
		//linkListone.add(fiveNode, 4);
		
		// fiveNode.nextNode = thirdNode;
		//linkListone.remove(1);
		//System.out.println(linkListone.contains(firstNode));
		//System.out.println(linkListone.contains(secondNode));
		
		
		//linkListone.print();
		
		Node tempNode = new Node (10);
		
		//System.out.println(linkListone.contains(tempNode));
		
		//System.out.println(linkListone.isCyclic());
		linkListone.reverse();
		linkListone.print();
		
		
		
		
		
		
	
		System.out.println(linkList.removeNodeAtPosition(-1));
		linkList.print();
		
		System.out.println(linkList.addNodeAtPosition(firstNode, -2));
		System.out.println("Linklist after first node addition ");
		linkList.print();
		/*
		
		
		linkList.addNodeAtPosition(secondNode, 2);
		System.out.println("Linklist after second node addition ");
		
		linkList.print();
		Node thirdNode = new Node(3);
		
		System.out.println("Linklist after third node addition ");
		linkList.addNodeAtPosition(thirdNode, 4);
		linkList.print();
		
		System.out.println("Linklist after second node removed");
		linkList.removeNodeAtPosition(1);
		linkList.print();
	}
	
	
*/
}
