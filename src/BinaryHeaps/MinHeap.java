package BinaryHeaps;

public class MinHeap {

	private int[] heap;
	private int size;
	private int maxsize;
	
	private static final int FRONT = 1 ;
	
	public MinHeap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size = 0;
		heap = new int[this.maxsize + 1];
		heap[0] = Integer.MIN_VALUE;
	}
	
	private int parent(int pos)
	{
		return pos/2;
	}
	
	private int leftChild(int pos)
	{
		return 2*pos;
	}
	
	private int rightChild(int pos)
	{
		return 2*pos + 1;
	}
	
	private boolean isLeaf(int pos)
	{
		
		if(pos >= size /2 && pos <= size)
		{
			return true;
		}
		
		return false;
		
	}
	
	
	private void swap(int pos1 , int pos2)
	{
		int temp = heap[pos1];
		heap[pos1] = heap[pos2];
		heap[pos2] = temp;
	}
	
	
	
	private void minHeapify( int pos )
	{
	
		if(!isLeaf(pos))
		{
			
			if(heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)] )
			{
				
				if(heap[leftChild(pos)] < heap[rightChild(pos)])
				{
					swap( pos , leftChild(pos));
					minHeapify(leftChild(pos));
				}
				else
				{
					swap( pos , rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}
	
	
	public void insert(int element)
    {
        heap[++size] = element;
        int current = size;
 
        while(heap[current] < heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }
	
	public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2*i]
                  + " RIGHT CHILD :" + heap[2 * i  + 1]);
            System.out.println();
        }
    }
	
	
	public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            minHeapify(pos);
        }
    }
	
	public int remove()
	{
		int minElement = heap[FRONT];
		heap[FRONT] = heap[size];
		size--;
		minHeapify(FRONT);
		return minElement;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The min Heap is ");
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.minHeap();
 
        minHeap.print();
        System.out.println("The min val is " + minHeap.remove());

		
	}

}
