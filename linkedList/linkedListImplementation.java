package com.linkedList;
public class linkedListImplementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList list = new LinkedList();
			
			for(int i=10;i<15;i++)
			{
				list.addNode(i);
			}
			list.printList();
			Boolean result = list.removeNode(14);
			if(true == result)
				{
				list.printList();
				}
			else
			{
				System.out.println("Element does not exist");
			}
	}
}
class LinkedList
	{
		Node head;
		public LinkedList()
		{
			head = null;
		}
		public void addNode(int data)
		{
			Node newNode = new Node(data);
			if(head == null)
			{
				head = newNode;
			}
			else if(head != null)
			{
				Node tempIterator =head;
				while(tempIterator.next != null)
				{
					tempIterator = tempIterator.next;
				}
				tempIterator.next = newNode;
			}
		}
		public Boolean removeNode(int data)
		{
			if(head == null)
			{
				return false;
			}
			Node tempNode = head;
			if(tempNode.data == data)
			{
				return true;
			}
			else
			{
				while(tempNode.next!=null && tempNode.next.data != data)
				{
					tempNode = tempNode.next;
				}
				if(tempNode.next.data == data)
				{
					tempNode.next=tempNode.next.next;
					return true;
				}
			}
			return false;
		}
		public void printList()
		{
			Node tempIterator;
			tempIterator = head;
			if(head == null)
			{
				System.out.println("List is empty");
			}
			else
			{
				System.out.print("List elements are : ");
				while(tempIterator != null)
				{
					System.out.print(tempIterator.data + " ");
					tempIterator = tempIterator.next;
				}
				System.out.println();
			}
		}
	}
	class Node
	{
		Node next = null;
		int data = 0;
		public Node(int dataToAddInNode)
		{
			data = dataToAddInNode;
		}
	}
