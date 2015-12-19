package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// in order traversal without recursion
public class Traversal_InOrderUsingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Traversal_InOrderUsingStacks tree = new Traversal_InOrderUsingStacks();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.inOrderTraversal(tree.root);

	}
	
	private void inOrderTraversal(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = rootNode;
		boolean traversalDone = false;
		while(!traversalDone)
		{
			if(current != null)
			{
				stack.push(current);
				current = current.left;
			}
			else
			{
				if(!stack.isEmpty())
				{
					current = stack.pop();
					System.out.print(current.data + " ");
					current = current.right;
				}
				else
				{
					traversalDone = true;
				}
			}
			
		}
		
		
	}

	TreeNode root;
		
	class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val)
		{
			data = val;
			left = null;
			right = null;			
		}
		
	}
	
	public void constructTree()
	{
		root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);
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
				if(temp.left != null)
				{
					queue.add(temp.left);
				}
				if (temp.right !=null)					
				{
					queue.add(temp.right);
				}
			}	
		}
		System.out.println();
	}
	
}
