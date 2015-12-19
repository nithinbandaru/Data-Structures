package BinaryHeaps;

import java.util.PriorityQueue;

public class KSmallestElementsUnorderedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 23, 12, 9, 30, 2, 50};
		int k = findKthLargest(arr , 3);
		System.out.println(k);
	}

	public static int findKthLargest(int[] nums, int k) {
        int p = 0;
        int numElements = nums.length;
        // create priority queue where all the elements of nums will be stored
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        // place all the elements of the array to this priority queue
        for (int n : nums){
            pq.add(n);
        }

        // extract the kth largest element
        while (numElements-k+1 > 0){
            p = pq.poll();
            k++;
        }

        return p;
    }
	
}
