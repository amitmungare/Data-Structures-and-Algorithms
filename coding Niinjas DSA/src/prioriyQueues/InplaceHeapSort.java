package prioriyQueues;

public class InplaceHeapSort {
	
	public static void inplaceHS(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {
			int childindex =i;
			int parentindex =(childindex-1)/2;
			
			while(childindex >0) {
				if(arr[childindex]> arr[parentindex]) {
					break;
				}
				int temp = arr[childindex];
				arr[childindex] = temp;
				childindex= parentindex;
				parentindex = (childindex-1)/2;
			}
		}
		for(int i=arr.length-1; i>=0;i--) {
			int min =arr[0];
			arr[0] = arr[i];
			arr[i] = min;
			
			int parentindex=0;
			int leftchildindex = 2*parentindex+1;
			int rightchildindex=leftchildindex+1;
			
			while(parentindex <i) {
				int minindex=parentindex;
				int minvalue=arr[minindex];
				
				if(leftchildindex <i) {
					int leftchild = arr[leftchildindex];
					if(leftchild < minvalue) {
						minindex=leftchildindex;
						minvalue=arr[minindex];
					}
				}
				if(rightchildindex <i) {
					int rightchild = arr[rightchildindex];
					if(rightchild < minvalue) {
						minindex=rightchildindex;
						minvalue=arr[minindex];
					}
				}
				if(parentindex==minindex) {
					break;
				}else {
					arr[minindex]=arr[parentindex];
					arr[parentindex] =minvalue;
				}
				parentindex =minindex;
				leftchildindex=2*parentindex+1;
				rightchildindex=leftchildindex+1;
			}
		}
	}

}
