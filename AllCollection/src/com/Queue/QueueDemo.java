package com.Queue;

class MyQueue
{
	int front, rear;
	int size;
	int[] arr;

	public MyQueue()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public MyQueue(int size)
	{

		front = 0;
		rear = 0;
		this.size = size;
		arr = new int[this.size];

	}

	public void insert(int data) 
	{
		if (rear < size) 
		{
			arr[rear] = data;
			rear++;
			System.out.println("Elemenet inserted");
		} 
		else 
		{
			System.out.println("Queue is full");
		}
	}

	public void delete() 
	{
		int tmp;
		if (rear > front)
		{
			System.out.println("Element deleted :" + arr[front]);
			for (tmp = front; tmp < rear - 1; tmp++) 
			{
				arr[tmp] = arr[tmp + 1];
			}
			arr[--rear] = 0;
		} 
		else 
		{
			System.out.println("Queue is empty");
		}

	}

	void display() 
	{
		if (rear > front) 
		{
			for (int i = front; i < rear; i++) 
			{
				System.out.println(arr[i]);
			}
		} 
		else 
		{
			System.out.println("Queue is empty");
		}
	}

}

public class QueueDemo {
	public static void main(String[] args) {

		MyQueue q = new MyQueue(5);

		q.delete();

		q.insert(50);
		q.insert(40);
		q.insert(30);
		q.insert(20);
		q.insert(10);

		q.display();

		q.insert(60);// queue is full

		q.delete();

	}
}
