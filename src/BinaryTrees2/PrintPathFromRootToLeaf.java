package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;

public class PrintPathFromRootToLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPathFromRootToLeaf tree = new PrintPathFromRootToLeaf();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		tree.insertLevelOrder(8);
		tree.insertLevelOrder(9);
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		
		int heightOfTree = tree.heightOfTree(tree.root);
		
		System.out.println("Height of Tree: "+heightOfTree);
		
		int[] path = new int[heightOfTree];
		int level = 0;
	
		traverseTillLeaves(tree.root, path, level, heightOfTree);
		
	}

	private static void traverseTillLeaves(TreeNode rootNode, int[] path,
			int level, int height) {
		// TODO Auto-generated method stub
	
		if(rootNode == null)
		{
			return;
		}
		else
		{
			path[level] = rootNode.data;
			level++;
			if(rootNode.leftChild == null && rootNode.rightChild ==  null)
			{
				printPathTillLeaves(path, level);
				path = new int[height];
				level = 0;
				
			}
			else
			{
				traverseTillLeaves(rootNode.leftChild, path, level, height);
				traverseTillLeaves(rootNode.rightChild, path, level, height);
				
			}
		}
	}

	private static void printPathTillLeaves(int[] path, int level) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<level;i++)
		{
			System.out.print(path[i] +" ");
		}
		System.out.println();
		
	}

	public static int heightOfTree(TreeNode rootNode) {
		int height = 0;
		if (rootNode == null) {
			return 0;
		} else {
			int leftHt = heightOfTree(rootNode.leftChild);
			int rightHt = heightOfTree(rootNode.rightChild);
			height = leftHt > rightHt ? leftHt : rightHt;
		}

		return height + 1;
	}

	public int heightOfTreeNonRecursive(TreeNode rootNode) {
		int height = 0;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if (rootNode == null) {
			return 0;
		} else {
			queue.add(rootNode);

			while (!queue.isEmpty()) {
				int nodeCount = queue.size();
				height++;
				TreeNode temp;
				while (nodeCount > 0) {
					temp = queue.remove();
					if (temp.leftChild != null) {
						queue.add(temp.leftChild);
					}

					if (temp.rightChild != null) {
						queue.add(temp.rightChild);
					}
					nodeCount--;
				}

			}

		}

		return height;
	}

	TreeNode root;

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

	public void insertLevelOrder(int value) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		// TreeNode rootNode = root;
		TreeNode newNode = new TreeNode(value);
		if (root == null) {
			root = newNode;
			return;
		}
		queue.add(root);
		TreeNode temp;
		while (!queue.isEmpty()) {
			temp = queue.remove();

			if (temp.leftChild == null) {
				temp.leftChild = newNode;
				// System.out.println("left child added: "+newNode.data);
				return;
			} else {
				queue.add(temp.leftChild);
			}
			if (temp.rightChild == null) {
				temp.rightChild = newNode;
				// System.out.println("Right child added: "+newNode.data);
				return;
			} else {
				queue.add(temp.rightChild);
			}
		}
	}

	public void levelOrderTraversal(TreeNode rootNode) {
		if (rootNode == null) {
			return;
		} else {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(rootNode);
			TreeNode temp;
			while (!queue.isEmpty()) {
				temp = queue.remove();
				System.out.print(temp.data + " ");
				if (temp.leftChild != null) {
					queue.add(temp.leftChild);
				}
				if (temp.rightChild != null) {
					queue.add(temp.rightChild);
				}
			}
		}
	}

}
