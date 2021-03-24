package recursion1;

public class FirstIndexOfNumber {
	
	public static int firstIndex(int input[], int x) {	
		return index(input,x,0);
	}
	
	public static int index(int arr[], int x, int si) {
		
		if(arr.length-1 ==si) {
				return -1;	
		}
		
		if(arr[si]==x) {
			return si;
		}
		
		return index(arr,x,si+1);
		
	}
	
public static void main(String[] args) {
		
		int input[] = {1,2,3,4,5,6};
		int x = 5;
		System.out.println(firstIndex(input, x));
	}

}
