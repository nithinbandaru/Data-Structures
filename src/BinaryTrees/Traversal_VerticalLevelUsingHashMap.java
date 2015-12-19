package BinaryTrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


public class Traversal_VerticalLevelUsingHashMap {

	public static void main(String[] args) {
		
		Traversal_VerticalLevelUsingHashMap tree = new Traversal_VerticalLevelUsingHashMap();
		tree.constructTree();
		tree.levelOrderTraversal(tree.root);
		tree.printVerticalOrder(tree.root);

	}
	
	private void printVerticalOrder(TreeNode rootNode) {
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		int HzDist = 0;
		
		getVerticalOrder(rootNode , HzDist , map);
		
		for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
	}

	private void getVerticalOrder(TreeNode rootNode, int hzDist,
			Map<Integer, ArrayList<Integer>> map) {
		
		if(rootNode == null)
		{
			return;
		}
	    ArrayList<Integer> list = map.get(hzDist);
	    if (list == null) {
	        list = new ArrayList<Integer>();
	        map.put(hzDist, list);
	    }
	    list.add(rootNode.data);

	    getVerticalOrder(rootNode.left, hzDist-1, map);
	    getVerticalOrder(rootNode.right, hzDist+1, map);		
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
		root.right.left.right = new TreeNode(8);		
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		
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
