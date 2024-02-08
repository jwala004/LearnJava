package java8.naveenautomationlabs.collectionntutrl;

public class StackImplemt {

//	Time complexity is, Big of 1, O(1)
//	because there is no loop
	int size;
	int arr[];
	int top;

	public StackImplemt(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element) {

		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Pushed element : " + element);
		} else {
			System.out.println("Stack is full now");
		}
	}

	public int pop() {

		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element : " + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public int peek() {

		if (!isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return ((size - 1) == top);
	}

	public static void main(String[] args) {
		StackImplemt stackImplemt = new StackImplemt(10);
		stackImplemt.pop();

//		System.out.println(stackImplemt.isEmpty());
//		System.out.println(stackImplemt.isFull());

		System.out.println("============================");

		stackImplemt.push(100);
		stackImplemt.push(200);
		stackImplemt.push(300);
		stackImplemt.push(400);
		stackImplemt.push(500);

		System.out.println("============================");

		System.out.println("Peek element: " + stackImplemt.peek());

		System.out.println("============================");

		stackImplemt.pop();
		stackImplemt.pop();
		stackImplemt.pop();

	}

}
