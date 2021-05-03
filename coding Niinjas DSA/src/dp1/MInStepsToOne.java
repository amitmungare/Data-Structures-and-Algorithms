package dp1;

public class MInStepsToOne {
	
	public static int minStep(int n) {
		
		int storage[] =new int[n+1];
		
		for(int i=2; i<=n ;i++) {
			int min= storage[i-1];
			if(i%3==0) {
				if(min>storage[i/3]) {
					min=storage[i/3];
				}
			}
			if(i%2==0) {
				if(min>storage[i/2]) {
					min=storage[i/2];
				}
			}
			storage[i] = 1+min;
		}
		return storage[n];
	}

	
	public static void main(String[] args) {		
		System.out.println(minStep(10));
	}

}
