package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;

public class FindNumberOfLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumberOfLeaves tree = new FindNumberOfLeaves();
		tree.insertLevelOrder(54);
		tree.insertLevelOrder(23);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(9);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(50);
		tree.insertLevelOrder(7);
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Element Found: "+tree.findNumOfLeaves(tree.root));
		
	

	}
	public int findNumOfLeaves(TreeNode rootNode)
	{
		int numOfLeaves = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(rootNode == null)
		{
			return 0;
		}
		queue.add(rootNode);
		TreeNode temp;
		while(!queue.isEmpty())
		{
			temp = queue.remove();
			if(temp.leftChild != null)
			{
				queue.add(temp.leftChild);
			}
			if(temp.rightChild != null)
			{
				queue.add(temp.rightChild);
			}	
			if(temp.leftChild == null && temp.rightChild == null)
			{
				numOfLeaves++;
			}
		}		
		
		return numOfLeaves;
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
