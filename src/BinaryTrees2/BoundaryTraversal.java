package BinaryTrees2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class BoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundaryTraversal tree = new BoundaryTraversal();
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		// tree.levelOrderTraversal(tree.root);
		System.out.println();
		// System.out.println("Element Found: "+tree.findNumOfLeaves(tree.root));
		// printBoundaryTraversal(tree.root);
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		printVertical(tree.root, 0, map);
		for (Integer key : map.keySet())
			System.out.println(map.get(key));
	//	ziZagTraversal(tree.root);

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

	private static void printVertical(TreeNode root, int level,
			HashMap<Integer, ArrayList<Integer>> map) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		if (!map.containsKey(level)) {
			map.put(level, new ArrayList<Integer>());
		}
		map.get(level).add(root.data);
		printVertical(root.leftChild, level - 1, map);
		printVertical(root.rightChild, level + 1, map);

	}

	private static void printBoundaryTraversal(TreeNode root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;
		if (root.leftChild != null)
			printLeft(root);
		printLeaves(root);
		if (root.rightChild != null)
			printRight(root.rightChild);
	}

	private static void printLeaves(TreeNode root) {
		// TODO Auto-generated method stub

		if (root == null)
			return;
		if (root.leftChild == null && root.rightChild == null)
			System.out.print(root.data);

		printLeaves(root.leftChild);
		printLeaves(root.rightChild);
	}

	private static void printLeft(TreeNode root) {
		if (root == null)
			return;
		if (root.leftChild != null) {
			System.out.print(root.data);
			printLeft(root.leftChild);
		} else if (root.rightChild != null) {
			System.out.print(root.data);
			printLeft(root.rightChild);
		}

	}

	private static void printRight(TreeNode root) {
		if (root == null)
			return;
		if (root.rightChild != null) {
			printRight(root.rightChild);
			System.out.print(root.data);
		} else if (root.leftChild != null) {
			printRight(root.leftChild);
			System.out.print(root.data);

		}

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
