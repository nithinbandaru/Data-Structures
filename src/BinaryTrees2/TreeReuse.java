package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;


public class TreeReuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeReuse tree = new TreeReuse();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		System.out.println("PreOrder Traversal:");
		tree.preOrderTraversal(tree.root);
		System.out.println();
		System.out.println("InOder Traversal");
		tree.inOrderTraversal(tree.root);
		System.out.println();
		System.out.println("PostOder Traversal");
		tree.postOrderTraversal(tree.root);
		System.out.println();
		System.out.println("Level Order Traversal");
		tree.levelOrderTraversal(tree.root);
		System.out.println();
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
	
	
	public void preOrderTraversal(TreeNode rootNode)
	{
		if(rootNode !=null)
		{
			System.out.print(rootNode.data+" ");
			preOrderTraversal(rootNode.leftChild);
			preOrderTraversal(rootNode.rightChild);			
		}
		
	}
	
	public void inOrderTraversal(TreeNode rootNode)
	{
		if(rootNode != null)
		{
			inOrderTraversal(rootNode.leftChild);
			System.out.print(rootNode.data+" ");
			inOrderTraversal(rootNode.rightChild);
		}
		
	}

	
	public void postOrderTraversal(TreeNode rootNode)
	{
		if(rootNode != null)
		{
			postOrderTraversal(rootNode.leftChild);			
			postOrderTraversal(rootNode.rightChild);
			System.out.print(rootNode.data+" ");
		}
	}
	
	
	
	

}
