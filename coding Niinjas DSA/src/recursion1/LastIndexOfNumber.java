package recursion1;

public class LastIndexOfNumber {
	
	public static int lastIndex(int input[], int x) {	
		return index(input,x,input.length-1);
	}
	
	public static int index(int arr[], int x, int si) {
		
		if(si == -1){
			return -1;	
		}
		
		
		if(arr[si]==x) {
			return si;
		}
		
		return index(arr,x,si-1);
		
	}
	
public static void main(String[] args) {
		
		int input[] = {8,6,3,4,5,6,7};
		int x = 8;
		System.out.println(lastIndex(input, x));
	}

}
