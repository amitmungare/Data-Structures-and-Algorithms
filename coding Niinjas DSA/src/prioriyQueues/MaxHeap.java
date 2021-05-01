package prioriyQueues;

public class MaxHeap {
	
	public static boolean checkMaxHeap(int arr[]) {
			
		for(int i=0; 2*i+1 <arr.length;i++) {
			
			int left = 2*i+1;
			int right = 2*i+2;
			
			if(	arr[i] < arr[left] || right <arr.length && arr[i] < arr[right]) {
				return false;
			}			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		int a[] = {42, 20, 18, 6, 14, 11, 9, 4};
		System.out.println(checkMaxHeap(a));
	}

}
