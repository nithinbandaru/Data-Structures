package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;

public class FindKthSmallestElementInBST {

	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKthSmallestElementInBST tree = new FindKthSmallestElementInBST();
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(1);
		tree.insertLevelOrder(3);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(7);
		//tree.levelOrderTraversal(tree.root);
		System.out.println();
		findKthSmallElement(tree.root , 4);
		
		
	}

	
	public static void findKthSmallElement(TreeNode rootNode, int k) {
		
		
		if(rootNode == null)
		{
			return ;
		}
		else
		{
			
			findKthSmallElement(rootNode.leftChild , k );
			count++;
			if(count == k)
			{
			System.out.println("Kth Smallest Element: "+ rootNode.data+" ");
			}			
			findKthSmallElement(rootNode.rightChild , k );
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
