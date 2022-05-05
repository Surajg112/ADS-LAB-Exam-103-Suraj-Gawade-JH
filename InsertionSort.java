import java.util.*;
class InsertionSort {
	
	void insertionSort(int a1[]) {
		int n = a1.length;
		for(int i = 1;i<n;i++) {
				int k = a1[i];
				int j = i-1;
		
		while(j>=0 && a1[j]>k) {
			a1[j+1]= a1[j];
		j= j-1;
		}
		a1[j+1] = k;
		}
			
	}
	void display(int a1[]) {
		int n =a1.length;
		for(int i = 0;i<n;i++) {
			System.out.print(a1[i]+" ");
		}
	}
	public static void main(String [] args) {
		InsertionSort i1 =new InsertionSort();
		int a1[] = {2,4,6,8,3};
		i1.insertionSort(a1);
		i1.display(a1);
	}
}