package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreOrderTraversal tree = new PreOrderTraversal();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		tree.preOrderTraversal(tree.root);
		System.out.println();
		tree.nonRecursivePreOrderTraversal(tree.root);		

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
	
	public void preOrderTraversal(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
		else
		{	
			System.out.print(rootNode.data+" ");
			preOrderTraversal(rootNode.leftChild);	
			preOrderTraversal(rootNode.rightChild);
			
		}
	}


	public void nonRecursivePreOrderTraversal(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(true)
		{
			while(rootNode!= null)
			{
				System.out.print(rootNode.data+" ");
				stack.push(rootNode);
				rootNode = rootNode.leftChild;
			}
			if(stack.isEmpty())
			{
				break;
			}
			rootNode = stack.pop();
			rootNode = rootNode.rightChild;
		}
		
		return;		
	}

}
