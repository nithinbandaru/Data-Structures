package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;
// http://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
public class IsBinaryTreeBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsBinaryTreeBST tree = new IsBinaryTreeBST();
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(7);
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Given tree a BST: " + tree.isBST(tree.root));
		

	}

	
	
	
	
	public boolean isBST(TreeNode rootNode)
	{
		return isBSTUtil(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isBSTUtil(TreeNode rootNode, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if(rootNode == null)
		{
			return true;
		}
		if(rootNode.data < minValue || rootNode.data > maxValue)
		{
			return false;
		}
		if(rootNode.data == minValue || rootNode.data == maxValue)
		{
			return true;
		}
		
		return (isBSTUtil(rootNode.leftChild, minValue, rootNode.data) && isBSTUtil(rootNode.rightChild , rootNode.data, maxValue));
		
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
