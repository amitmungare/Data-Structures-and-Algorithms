package recursion1;

public class TOH {

	public static void toh(int disks, char source, char auxiliary, char destination) {
		
		if(disks==0) {
			return;
		}
		toh(disks-1, source, destination, auxiliary);
		System.out.println(source+" "+ destination);
		toh(disks-1, auxiliary, source, destination);
	}
	
	
	public static void main(String[] args) {
		int n = 3;
		toh(n, 'a', 'b', 'c');
	}
	
}
