package ds.queue;

public class Queue {

	
	private int maxSize; // initializes the set number of slots
	private long[] queArray; //slots to maintain the data
	private int front;  //this will be the index position for the element in the front
	private int rear; // this is also going to be the index position for the back of the line
	private int nItems;  //counter to maintain the number of times in our queue
	
	public Queue(int size){
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;//index position of the first slot of the array
		rear = -1; //there is not item in the array yet to be considered as the last item.
		nItems = 0;//we dont have elements in the array yet
		
		
		
	}
	public void insert(long j){
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	public void view(){
		System.out.print("[");
		for(int i = 0; i < queArray.length; i++){
			System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
	}
	
	
}
