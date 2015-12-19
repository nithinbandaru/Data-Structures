package General;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		PathSum tree = new PathSum();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		List<Integer> sumList = new ArrayList<Integer>(); 
		boolean hasPath = hasPathSum(tree.root, 14, sumList );
		for(int i : sumList)
		{
			System.out.print(i+" ");
		}

	}
	
	private static boolean hasPathSum(TreeNode rootNode, int sum,
			List<Integer> sumList) {
		// TODO Auto-generated method stub
		
		
		if(rootNode == null)
		{
			return false;
		}
		
		if(rootNode.left == null && rootNode.right == null)
		{
			if(rootNode.data == sum)
			{
				sumList.add(rootNode.data);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		if(hasPathSum(rootNode.left, sum - rootNode.data , sumList))
		{
			sumList.add(rootNode.data);
			return true;
		}
		if(hasPathSum(rootNode.right, sum - rootNode.data , sumList))
		{
			sumList.add(rootNode.data);
			return true;
		}
		
		return false;
		
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
		root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		
		
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
