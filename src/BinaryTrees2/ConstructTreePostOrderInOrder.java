package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;


public class ConstructTreePostOrderInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] inOrder = {4, 2, 5, 1, 6, 3};
		int[] postOrder = {4, 5, 2, 6, 3, 1};
		
		TreeNode rootNode = buildTree(postOrder, inOrder);
		
		
	}

	
	private static TreeNode buildTree(int[] postOrder, int[] inOrder) {
		// TODO Auto-generated method stub
		return buildTree(postOrder, 0, postOrder.length - 1 , inOrder, 0 , inOrder.length - 1);
	}


	private static TreeNode buildTree(int[] postOrder, int postOrderStart, int postOrderEnd,
			int[] inOrder, int inOrderStart, int inOrderEnd) {
		// TODO Auto-generated method stub
		
		if(postOrderStart > postOrderEnd ||  inOrderStart >  inOrderEnd)
		{
			return null;
		}
		
		int rootVal = postOrder[postOrderEnd];
		int rootIndex = 0;
		
		for(int i = 0; i <= inOrderEnd ; i++ )
		{
			if(rootVal == inOrder[i])
			{
				rootIndex = i;
				break;
			}
		}
		
		TreeNode rootNode = new TreeNode(rootVal);
		
		
		
		
		return rootNode;
	}


	TreeNode root;

	static class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode(int val) {
			data = val;
			leftChild = null;
			rightChild = null;
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
