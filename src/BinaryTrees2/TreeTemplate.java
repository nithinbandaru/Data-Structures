package BinaryTrees2;
import java.util.*;

public class TreeTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTemplate tree = new TreeTemplate();		
		
		tree.insertIntoBinaryTree(1);
		tree.insertIntoBinaryTree(2);
		tree.insertIntoBinaryTree(3);
		tree.insertIntoBinaryTree(4);
		tree.insertIntoBinaryTree(5);
		tree.insertIntoBinaryTree(6);
		tree.insertIntoBinaryTree(7);

		tree.preOrderTraversal(tree.root);

	}

	TreeNode root;

	public void preOrderTraversal(TreeNode rootNode) {
		// rootNode = root;
		if (rootNode != null) {
			System.out.print(rootNode.data+" ");
			preOrderTraversal(rootNode.leftChild);
			preOrderTraversal(rootNode.rightChild);
		}
	}

	

	public void insertIntoBinaryTree(int value) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//TreeNode rootNode = root;
		TreeNode newNode = new TreeNode(value);
		if (root == null) {
			root = newNode;
			System.out.println("rootNode: " + root.data);
			return ;
		}
		queue.add(root);
		//System.out.println("hi");
		TreeNode temp;
		while (!queue.isEmpty()) {
			temp = queue.remove();
			if (temp.leftChild == null) {
				temp.leftChild = newNode;
				//queue.clear();
				return;
			} 
			else
			{
				queue.add(temp.leftChild);
			}
			if (temp.rightChild == null) {
				temp.rightChild = newNode;
				//queue.clear();
				return;
			} else {
				queue.add(temp.rightChild);
			}
		}

	}
	class TreeNode {

		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int val) {
			data = val;
			leftChild = null;
			rightChild = null;
		}

	}

}

  