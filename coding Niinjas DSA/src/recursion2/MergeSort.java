package recursion2;

public class MergeSort {
	
	public static void mergeSort(int[] input){	
		mergeSort(input,0,input.length-1);
	}
	
	private static void mergeSort(int[] arr, int si, int ei) {
		
		if(si>=ei) {
			return;
		}
		
		int mid = (si+ei)/2;
		mergeSort(arr,si,mid);
		mergeSort(arr,mid+1,ei);
		merge(arr,si,ei);
		
	}

	private static void merge(int[] arr, int si, int ei) {
		
		if(arr.length<=1) {
			return;
		}
		
		int mid =(si+ei)/2;
		int i = si;
		int j = mid+1;
		int k = 0;
		int[] ans = new int[ei-si+1];
		
		while(i<=mid && j<=ei) {
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
			ans[k] = arr[i];
			i++;
			k++;
		}
		
		while(j<=ei) {
			ans[k] = arr[j];
			k++;
			j++;
		}
		
		for(int a=0; a<ans.length; a++) {
			arr[si+a]=ans[a];
		}
	}

	
	
	public static void main(String[] args) {
		
		int arr[] = {5,2,8,9,1};
		mergeSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
	
}
