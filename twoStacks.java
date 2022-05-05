class twoStacks {
	int []arr;
	int size;
	int index1;
	int index2;
	void push1(int element) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
	//arr[++index1]=element;
	}
	void push2(int element) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
	//arr[--index2]=element;
	}
	
	int pop1() {
		if(isEmpty1()) {
			System.out.println("Stack is empty");
		}
		int element = arr[index2];
		index1--;
		return element;
	}
	int pop2() {
		if(isEmpty2()) {
			System.out.println("Stack is empty");
		}
		int element = arr[index2];
		index2++;
		return element;
	}
	boolean isEmpty1() {
		if(index1==-1) {
			return true;
		}
		return false;
	}
	boolean isEmpty2() {
		if(index2==-1) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if(index1==-1) {
			return true;
		}
		return false;
	}
	twoStacks(int size) {
		this.size = size;
		arr = new int[size];
		index1 = -1;
		index2= size;
		
	}
	public static void main(String []args) {
		twoStacks t1 = new twoStacks(6);
			
			t1.push1(5); 
			t1.push2(10); 
			t1.push2(15); 
			t1.push1(11); 
			t1.push2(7); 
			t1.push2(40);
			
			t1.pop1(11);
			t1.pop2(40);
			
	}
}