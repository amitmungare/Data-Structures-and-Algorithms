package basicQuestion;

public class MergeSort {

	public static void main(String[] args) {	
		int arr[]= {4,3,2,1};	
		int newarr[]= sortArr(arr, arr.length-1);
		for(int e: newarr) {
			System.out.print(e+" ");
		}
	}
	
	public static int[] sortArr(int[] arr, int n) 
    { 
		return mergeSort(arr,0,arr.length-1);
    }

	private static int[] mergeSort(int[] arr, int s, int e) {
		if(s<e) {
			int mid=(s+e)/2;
			mergeSort(arr, s, mid);
			mergeSort(arr, mid+1, e);
			merge(arr, s, e);
		}
		return arr;
	}

	private static int[] merge(int[] arr, int s, int e) {
		
		
		int mid=(s+e)/2;
		int i=s;
		int j=mid+1;
		int k=0;
		int ans[]=new int[e-s+1];
		
		while(i<=mid && j<=e) {
			if(arr[i]<arr[j]) {
				ans[k]=arr[i];
				i++;
				k++;
			}else {
				ans[k]=arr[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		
		while(j<=e) {
			ans[k]=arr[j];
			j++;
			k++;
		}
		
		for(int a=0; a<ans.length; a++) {
			arr[s+a]=ans[a];
		}
		return arr;
	}

}
