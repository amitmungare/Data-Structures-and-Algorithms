package prioriyQueues;

import java.util.ArrayList;

public class MaxPriorityQueue {
	
	private ArrayList<Integer> heap;
	
	public MaxPriorityQueue() {
		heap = new ArrayList<>();
	}
	
	
		boolean isEmpty() {
			return heap.size()==0;
		}

		int getSize() {
			return heap.size();
		}

		int getMax() {
			if(isEmpty()) {
				return -1;
			}
			return heap.get(0);
		}

		void insert(int ele) {
			heap.add(ele);
			int childindex = heap.size()-1;
			int parentindex = (childindex-1)/2;
			
			while(childindex >0) {
				if(heap.get(childindex) > heap.get(parentindex)) {
					int temp = heap.get(childindex);
					heap.set(childindex, heap.get(parentindex));
					heap.set(parentindex, temp);
					childindex =parentindex;
					parentindex =(childindex-1)/2;
				}else {
					return;
				}
			}
		}

		int removeMax() {
			if(isEmpty()) {
				return -1;
			}
			
			int ans=heap.get(0);
			heap.set(0, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			
			int index=0;
			int maxIndex =index;
			int leftchildindex=1;
			int rightchildindex=2;
			
			while(leftchildindex < heap.size()) {
				if(heap.get(leftchildindex) > heap.get(maxIndex)) {
					maxIndex = leftchildindex;
				}
				if(rightchildindex < heap.size() && heap.get(rightchildindex) > heap.get(maxIndex)){
					maxIndex = rightchildindex;
				}
				if(maxIndex ==index) {
					break;
				}else {
					int temp = heap.get(index);
					heap.set(index, heap.get(maxIndex));
					heap.set(maxIndex, temp);
					index =maxIndex;
					leftchildindex =2* index +1;
					rightchildindex= 2* index +2;
				}
			}
			return ans;
		}

}
