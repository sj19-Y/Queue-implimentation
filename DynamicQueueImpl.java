package queue;

public class DynamicQueueImpl {

	private final int capacity = 2 ;
	int queueArr[];
	int front = 0;
	int rear = - 1;
	int currentSize = 0 ;
	public DynamicQueueImpl(){
	queueArr = new int[this .capacity];
	}
	public void enqueue( int item) {
	if (isQueueFull()) {
	System.out.println( "Queue is full, increase capacity..." );
	increaseCapacity();
	}
	rear++;
	if (rear >= queueArr.length && currentSize != queueArr.length){
	rear = 0 ;
	}
	queueArr[rear] = item;
	currentSize++;
	System.out.println( "Adding: " + item);
	}
	public void dequeue() {
	if (isQueueEmpty()) {
	System.out.println( "Underflow ! Unable to remove element from Queue" );
	} else {
	front++;
	if(front > queueArr.length- 1){
	System.out.println( "removed: " +queueArr[front- 1 ]);
	front = 0 ;
	} else {
	System.out.println( "removed: " +queueArr[front- 1 ]);
	}
	currentSize--;
	}
	}
	public boolean isQueueFull(){
	boolean status = false ;
	if (currentSize == queueArr.length){
	status = true ;
	}
	return status;
	}
	public boolean isQueueEmpty(){
	boolean status = false ;
	if (currentSize == 0 ){
	status = true ;
	}
	return status;
	}
	private void increaseCapacity(){
	int newCapacity = this .queueArr.length* 2;
	int [] newArr = new int [newCapacity];
	int tmpFront = front;
	int index = - 1;
	while (true ){
	newArr[++index] = this.queueArr[tmpFront];
	tmpFront++;
	if(tmpFront == this .queueArr.length){
	tmpFront = 0 ;
	}
	if(currentSize == index+ 1){
	break ;
	}
	}
	this .queueArr = newArr;
	System.out.println( "New array capacity: " +this .queueArr.length);
	this .front = 0;
	this .rear = index;
	}
	public static void main(String a[]){
	DynamicQueueImpl queue = new DynamicQueueImpl();
	queue.enqueue( 4);
	queue.dequeue();
	queue.enqueue( 20);
	queue.enqueue( 2);
	queue.enqueue( 7);
	queue.dequeue();
	queue.enqueue( 24);
	queue.enqueue( 12);
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	queue.enqueue( 55 );
	queue.dequeue();
	queue.dequeue();
	}
	}

