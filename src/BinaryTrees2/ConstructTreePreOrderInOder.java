package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;


public class ConstructTreePreOrderInOder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inOrder = {4, 2, 5, 1, 6, 3};
		int[] preOrder = {1, 2, 4, 5, 3, 6};
		
		TreeNode rootNode = buildTree(preOrder , inOrder);
		ConstructTreePreOrderInOder tree = new ConstructTreePreOrderInOder();
		tree.levelOrderTraversal(rootNode);

	}

	private static TreeNode buildTree(int[] preOrder, int[] inOrder) {
		// TODO Auto-generated method stub
		
		return buildTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
		
	}
	
	
	
	private static TreeNode buildTree(int[] preOrder, int preOrderStart, int preOrderEnd,
			int[] inOrder, int inOrderStart, int inOrderEnd) {
		// TODO Auto-generated method stub
		
		if(inOrderStart > inOrderEnd || preOrderStart > preOrderEnd)
		{
			return null;
		}
		
		int rootVal = preOrder[preOrderStart];
		int rootIndex = 0;
		
		for(int i=0; i<= inOrderEnd ; i++)
		{
			if(rootVal == inOrder[i])
			{
				rootIndex = i;
				break;
			}			
			
		}
		
		int leftTreeTillRoot = rootIndex - inOrderStart;
		
		TreeNode rootNode = new TreeNode(rootVal);
		
		rootNode.leftChild = buildTree(preOrder, preOrderStart+1, preOrderStart + leftTreeTillRoot, inOrder, inOrderStart, rootIndex - 1);
		rootNode.rightChild = buildTree(preOrder,  preOrderStart+ leftTreeTillRoot + 1, preOrderEnd, inOrder, rootIndex + 1, inOrderEnd) ;
				
		return rootNode;
	}



	TreeNode root;


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