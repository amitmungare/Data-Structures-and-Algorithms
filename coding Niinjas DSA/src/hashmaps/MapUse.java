package hashmaps;

public class MapUse {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new Map<>();
		for(int i =0; i<40; i++) {
			map.insert("abc"+i , 1+i);
			System.out.println("i= "+i + "lf= "+map.loadFactor());
		}
	}

}
