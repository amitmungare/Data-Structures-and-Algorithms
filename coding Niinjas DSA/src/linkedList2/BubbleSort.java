package linkedList2;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans =1234;
int newans=0;
        
        while(ans !=0){
            int r=ans%10;
            newans = newans*10+r;
            ans =ans/10;
        }
        
        System.out.println(newans);
		
	}

}
