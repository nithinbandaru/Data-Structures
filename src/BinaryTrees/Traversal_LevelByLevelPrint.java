package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Traversal_LevelByLevelPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Traversal_LevelByLevelPrint tree = new Traversal_LevelByLevelPrint();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.levelByLevelPrint(tree.root);

	}
	
	private void levelByLevelPrint(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(rootNode);
		queue.add(null);
		TreeNode temp;
		while(!queue.isEmpty())
		{
			temp = queue.poll();
			if(temp != null)
			{
				System.out.print(temp.data + " ");
				if(temp.left != null)
				{
					queue.add(temp.left);
				}
				if(temp.right != null)
				{
					queue.add(temp.right);
				}				
			}
			else
			{
				if(!queue.isEmpty())
				{
					queue.add(null);
					System.out.println();
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
		root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.right = new TreeNode(6);
		root.left.right.right = new TreeNode(8);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(4);
		root.right.left.left = new TreeNode(9);
		root.right.left.right = new TreeNode(10);
		root.right.right = new TreeNode(5);
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
