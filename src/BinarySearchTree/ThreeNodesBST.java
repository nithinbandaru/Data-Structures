package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;



public class ThreeNodesBST {

	public TreeNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeNodesBST tree = new ThreeNodesBST();
		
		tree.insert(5);
		tree.insert(4);
		tree.insert(9);
		tree.insert(5);
		tree.insert(7);
		tree.insert(2);
		tree.insert(2);
		
		
		tree.levelOrderTraversal(tree.root);

		tree.deleteKey(5);
		tree.levelOrderTraversal(tree.root);
		tree.deleteKey(5);
		tree.levelOrderTraversal(tree.root);
		 
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
				System.out.print(temp.val+" ");
				if(temp.left != null)
				{
					queue.add(temp.left);
				}
				if (temp.middle !=null)					
				{
					queue.add(temp.middle);
				}
				if (temp.right !=null)					
				{
					queue.add(temp.right);
				}
			}	
		}
		System.out.println();
	}

	void insert(int val) {
		root = insert(root, val);
	}

	public TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		} else if (val < root.val) {
			root.left = insert(root.left, val);
		} else if (val > root.val) {
			root.right = insert(root.right, val);
		} else {
			root.middle = insert(root.middle, val);
		}
		return root;
	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	TreeNode deleteRec(TreeNode root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (key < root.val)
			root.left = deleteRec(root.left, key);
		else if (key > root.val)
			root.right = deleteRec(root.right, key);

		// if key is same as root's key, then This is the node
		// to be deleted
		else if (root.middle == null) {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.val = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.val);
		} else {
			TreeNode temp = root;
			while (temp.middle != null && temp.middle.middle != null) {
				temp = temp.middle;
			}
			temp.middle = temp.middle.middle;
		}

		return root;
	}

	int minValue(TreeNode root) {
		int minv = root.val;
		while (root.left != null) {
			minv = root.left.val;
			root = root.left;
		}
		return minv;
	}		
	
	class TreeNode
	{
		int val;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode middle = null;
		
		public TreeNode(int val)
		{
			this.val = val;			
		}
		
	}
	
	
}
