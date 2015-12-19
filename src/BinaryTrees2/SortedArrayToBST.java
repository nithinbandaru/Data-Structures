package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;

public class SortedArrayToBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedArrayToBST tree = new SortedArrayToBST();
		int[] sortedArray = {2,3,4,5,6,7,8};
		tree.levelOrderTraversal(tree.sortedArrayToBinarySearchTree(sortedArray, 0,sortedArray.length-1));
		System.out.println();
		

	}
	
	public TreeNode sortedArrayToBinarySearchTree(int[] arr, int lowIndex, int highIndex)
	{
		TreeNode rootNode = null;
		if(lowIndex > highIndex)
		{
			return null;
		}	
		
		int mid = (lowIndex + highIndex)/2;
		rootNode = new TreeNode(arr[mid]);
		rootNode.leftChild = sortedArrayToBinarySearchTree(arr, lowIndex, mid - 1);
		rootNode.rightChild = sortedArrayToBinarySearchTree(arr, mid + 1, highIndex);
		return rootNode;
	}
	
	TreeNode root;
	class TreeNode
	{
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
		
		public TreeNode(int val)
		{
			data = val;
			leftChild = null;
			rightChild = null;
		}
		
	}

	public void insertLevelOrder(int value)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//TreeNode rootNode = root;
		TreeNode newNode = new TreeNode(value);
		if(root == null)
		{
			root = newNode;
			return;
		}
		queue.add(root);
		TreeNode temp;
		while(!queue.isEmpty())
		{
			temp = queue.remove();
			
			if(temp.leftChild == null)
			{
				temp.leftChild = newNode;
				//System.out.println("left child added: "+newNode.data);
				return;
			}
			else
			{
				queue.add(temp.leftChild);
			}
			if(temp.rightChild == null)
			{
				temp.rightChild = newNode;
				//System.out.println("Right child added: "+newNode.data);
				return;
			}
			else
			{
				queue.add(temp.rightChild);
			}
		}
	}
	
	public void levelOrderTraversal(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
		else
		{
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(rootNode);
			TreeNode temp;
			while(!queue.isEmpty())
			{
				temp = queue.remove();
				System.out.print(temp.data+" ");
				if(temp.leftChild != null)
				{
					queue.add(temp.leftChild);
				}
				if (temp.rightChild !=null)					
				{
					queue.add(temp.rightChild);
				}
			}	
		}
	}



}
