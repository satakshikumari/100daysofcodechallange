/* Queue using array

Code */
import java.util.*;

class Queue{
	static private int front, rear, capacity;
	static private int queue[];

	Queue(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	// function to insert an element at the rear of the queue
	void Enqueue(Scanner sc) {
		// check queue is full or not
		if (capacity == rear) {
			System.out.printf("\nQueue is full can not insert.\n");
			return;
		}

		// insert element at the rear
		else {
			System.out.println("Enter data to insert-");
			int data = sc.nextInt();
			queue[rear] = data;
			rear++;
		}
		return;
	}

	// function to delete an element from the front of the queue
	void Dequeue() {
		// if queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}
		// shift all the elements from index 2 till rear to the right by one
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}

			// store 0 at rear indicating there's no element
			if (rear < capacity)
				queue[rear] = 0;

			// decrement rear
			rear--;
		}
		return;
	}

	// print queue elements
	void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}

		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}




	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of queue-");
		int n = sc.nextInt();
		Queue q = new Queue(n);
		int ch;
		do {
			System.out.println("\n Enter Choice:\n1. Print Queue\n2. Enqueue \n3. Dequeue\n4. Exit");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					q.queueDisplay();
					break;
				case 2:
					q.Enqueue(sc);
					break;

				case 3:
					q.Dequeue();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println(" Wrong choice choose again ");
			}
		} while (ch != 4);
		sc.close();
	}
}


/* Output

Enter Size of queue-
3

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
1

Queue is Empty

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
2
Enter data to insert-
22

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
2
Enter data to insert-
33

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
2
Enter data to insert-
44

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
1
 22 <--  33 <--  44 <-- 
 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
3

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
3

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
3

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
3

Queue is empty

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
1

Queue is Empty

 Enter Choice:
1. Print Queue
2. Enqueue
3. Dequeue
4. Exit
