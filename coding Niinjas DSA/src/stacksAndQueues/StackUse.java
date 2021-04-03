package stacksAndQueues;

public class StackUse {

	public static void main(String[] args) {
	
		StackUsingArray s =new StackUsingArray(3);
		
		for(int i=1; i<=11; i++) {
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}

	}

}



//https://github.com/Ebazhanov/linkedin-skill-assessments-quizzes