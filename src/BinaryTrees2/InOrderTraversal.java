package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InOrderTraversal tree = new InOrderTraversal();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		tree.inOrderTraversal(tree.root);
		System.out.println();
		tree.nonRecursiveInOrderTraversal(tree.root);
		

	}
	public TreeNode leastCommonAncestor(TreeNode root, TreeNode l1, TreeNode l2){
		if(root == null)
			return null;
		else if(root.data == l1.data || root.data == l2.data)
			return root;		
		TreeNode left = leastCommonAncestor(root.leftChild, l1, l2);
		TreeNode right = leastCommonAncestor(root.rightChild, l1, l2);
		if(left != null && right != null)
			return root;
		else if(left != null)
			return left;
		else if(right != null)
			return right;
		return root;
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
	
	public void inOrderTraversal(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return;
		}
		else
		{
			inOrderTraversal(rootNode.leftChild);
			System.out.print(rootNode.data+" ");
			inOrderTraversal(rootNode.rightChild);
		}
	}
	
	public void nonRecursiveInOrderTraversal(TreeNode rootNode)
	{
		if(rootNode == null)
		{
			return ;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(true)
		{
			while(rootNode != null)
			{
				stack.push(rootNode);
				rootNode = rootNode.leftChild;
			}
			
			if(stack.isEmpty())
			{
				break;
			}
			
			rootNode = stack.pop();
			System.out.print(rootNode.data+" ");
			rootNode = rootNode.rightChild;
			
		}
	}


}
