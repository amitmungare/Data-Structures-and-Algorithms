package stacksAndQueues;

public class Try {
	
	public static StackUsingLL<Integer> rev(StackUsingLL<Integer> s){
		
		StackUsingLL<Integer> t = new StackUsingLL<Integer>();
		
		while(!s.isEmpty()) {
			t.push(s.pop());			
		}
		return t;
	}
	
	public static QueueUsingLL<Integer> revQueue(QueueUsingLL<Integer> q){
		
		if(q.front()==null) {
			return null;
		}
		
		int temp = q.dequeue();
		revQueue(q);
		q.enqueue(temp);
		
		return q;
	}

	
	public static void main(String[] args) {
		StackUsingLL<Integer> s =new StackUsingLL<>();
		
		for(int i=1; i<=12; i++) {
			s.push(i);
		}
		s= rev(s);
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		
		System.out.println();
		
		
		QueueUsingLL<Integer> q = new QueueUsingLL<>();
		
		for(int i=1; i<=12; i++) {
			q.enqueue(i);
		}
		q= revQueue(q);
		while(!q.isEmpty()) {
			System.out.print(q.dequeue()+" ");
		}
		
	}

}
