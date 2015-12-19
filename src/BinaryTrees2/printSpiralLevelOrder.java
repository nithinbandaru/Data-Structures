package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class printSpiralLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSpiralLevelOrder tree = new printSpiralLevelOrder();
		tree.insertLevelOrder(1);
		
		tree.insertLevelOrder(2);
		tree.insertLevelOrder(3);
		
		tree.insertLevelOrder(4);
		tree.insertLevelOrder(5);
		tree.insertLevelOrder(6);
		tree.insertLevelOrder(7);
		
		tree.insertLevelOrder(9);
		tree.insertLevelOrder(10);
		tree.insertLevelOrder(11);
		tree.insertLevelOrder(12);
		tree.insertLevelOrder(13);
		tree.insertLevelOrder(14);
		tree.insertLevelOrder(15);
		tree.insertLevelOrder(16);
		
		
		tree.levelOrderTraversal(tree.root);
		System.out.println();
		printSpiralTree(tree.root);

	}
	
	private static void printSpiralTree(TreeNode rootNode) {
		// TODO Auto-generated method stub
		
		if(rootNode == null)
		{
			return;
			
		}
		
		Stack<TreeNode> parentStack = new Stack<TreeNode>();
		Stack<TreeNode> childStack = new Stack<TreeNode>();
		
		parentStack.push(rootNode);
		TreeNode temp ;
		
		while(!parentStack.isEmpty() || !childStack.isEmpty())
		{
			
			while(!parentStack.isEmpty())
			{
				temp = parentStack.pop();
				System.out.print(temp.data +" ");
				
				if(temp.rightChild != null)
				{
					childStack.push(temp.rightChild);
				}
				
				if(temp.leftChild != null)
				{
					childStack.push(temp.leftChild);
				}				
				
			}
			
			
			while(!childStack.isEmpty())
			{
				temp = childStack.pop();
				System.out.print(temp.data +" ");
				
				
				if(temp.leftChild != null)
				{
					parentStack.push(temp.leftChild);
				}				
				if(temp.rightChild != null)
				{
					parentStack.push(temp.rightChild);
				}
				
			}
			
			
			
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
