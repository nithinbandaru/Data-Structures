package BinaryTrees;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


public class VerticalSumInABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		VerticalSumInABinaryTree tree = new VerticalSumInABinaryTree();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.verticalSum(tree.root);

	}
	
	private void verticalSum(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		verticalSumUtil(rootNode , 0 , map);
		
		if(map!=null)
		{
			System.out.println(map.entrySet());
		}
		
	}

	private void verticalSumUtil(TreeNode rootNode, int horizontalDistance,
			Map<Integer, Integer> map) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
		}
		verticalSumUtil(rootNode.left , horizontalDistance - 1 , map);
		
		int prevSum = (map.get(horizontalDistance) == null ) ? 0 : map.get(horizontalDistance);
		map.put(horizontalDistance, prevSum + rootNode.data);
		
		verticalSumUtil(rootNode.right , horizontalDistance + 1 , map);
		
		
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
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
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
