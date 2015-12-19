package Arrays;
import java.util.Random;

public class KthSmallestOrLargestElement {

	private int[] ar ;
	private int len;
	public KthSmallestOrLargestElement (int k) {
		ar = new int[k];
		System.out.println("array size " + ar.length);
	}
	
	public void insert(int i) {
		ar[len++] = i;
		swim();
	}
	
	public int remove() {
		int val = ar[0];
		ar[0] = ar[len-1];
		len--;
		sank();
		
		return val;
	}
	
	public void swim() {
		int i = len - 1;
		while ((i-1)/2 >=0) {	
			if (ar[i] > ar[(i-1)/2]) {
				int val = ar[(i-1)/2];
				ar[(i-1)/2]= ar[i];
				ar[i] = val;			
			} else {
				break;
			}

			i = (i - 1)/ 2;
		}
	}
	
	public void sank() {
		int child = 1;
		int i = 0;
		while (child < len) {
			if (child + 1 < len && ar[child+1] > ar[child]) {
				child = child + 1;
			}
			if (ar[child] > ar[i]) {
				int val = ar[i];
				ar[i] = ar[child];
				ar[child]  = val;
			} else {
				break;
			}
			i = child;
			child = (2 * i + 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		KthSmallestOrLargestElement k = new KthSmallestOrLargestElement(10);
		for (int i =0;  i < 10; i++ ) {
			int f = ran.nextInt(100);
			k.insert(f);
			System.out.print(f+ " ");
		}
		System.out.println();
		for (int i =0; i < 9; i++)
			System.out.print(" " + k.remove());
//		System.out.println("First " + k.remove());
//		KthSmallestOrLargestElement  a = new KthSmallestOrLargestElement (1);
		System.out.println("Het");

	}

}
