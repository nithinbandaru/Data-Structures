package Arrays2;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;


public class FindKthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {9,3,1,2,4,5,6};
		int k=2;
		int result=0;
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(arr.length,new Comparator<Integer>() {
		@Override
		public int compare(Integer x, Integer y) {
			if(x<y) 
				return 1;
			else if(x>y)
				return -1;
			else
				return 0;
		}
		});
		for(int i:arr)
		{
			pq.add(i);
		}
		for(int i=0;i<k;i++)
		{
			result=pq.poll();
		}
		System.out.println(result);
	}

}
