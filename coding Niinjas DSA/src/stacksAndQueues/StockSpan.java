package stacksAndQueues;

import java.util.Stack;

public class StockSpan {
	
	public static int[] stockSpan(int[] price) {
		
		Stack<Integer> s=new Stack<Integer>();
		int ans[] =new int[price.length];
		ans[0]=1;
		s.push(0);
		
		for(int i=1;i<ans.length;i++) {
			while(!s.isEmpty() && price[s.peek()]<price[i]) {
				s.pop();
			}
			
			
			if(s.isEmpty()) {
				ans[i]=i+1;
			}else {
				ans[i] = i-s.peek();
			}
			s.push(i);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		
		int[] a= {60, 70, 80, 100, 90, 75, 80, 120};
		a=stockSpan(a);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
