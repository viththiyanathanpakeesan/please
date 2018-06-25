public class Queue
{
	private int front;
	private int rear;
	int myQueue[];
	
	public Queue()
	{
		front = -1;
		rear = 0;
		myQueue = new int[20];
	}
	public boolean isEmpty()
	{
		if(front == -1 && rear ==0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(rear == myQueue.length -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enqueue(int elt)
	{
		rear++;
		myQueue[rear] = elt;
	}
	public int dequeue()
	{
		int elt = myQueue[front];
		front = front + 1;
		return elt;
	}
	public int peek()
	{
		return myQueue[front];
	}
}