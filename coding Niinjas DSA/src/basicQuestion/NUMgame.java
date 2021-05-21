package basicQuestion;

public class NUMgame {

	public static void main(String[] args) {
		int arr[] = {10,11,1,2,3};
		arr=game(arr,arr.length);
		
		for(int e: arr) {
			System.out.print(e+" ");
		}
		

	}

	public static int[] game(int arr[], int n) {
        for(int i=0; i<n-1 ;i++){
        	
            if(i-1==n){
                arr[i] = arr[i];
                break;
            }
            arr[i] = arr[i] ^ arr[i+1];         
        }
        return arr;
    }
	
}
