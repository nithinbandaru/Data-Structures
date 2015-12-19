package BinaryTrees;


public class InOrderSuccessorBST {

	TreeNode root;
	
	public static void main(String[] args) {

		InOrderSuccessorBST tree = new InOrderSuccessorBST();
		tree.constructTree();
		tree.inOrderTraversal(tree.root);
		
		TreeNode successor = GetSuccessor(tree.root , 12);

		System.out.println("InOrder succesor : " + successor.data);
		
		
	}
	
	
	
	private static TreeNode GetSuccessor(TreeNode rootNode, int key) {

		// search the node in the BST
		TreeNode current = searchBST(rootNode, key);
		System.out.println("current found : " + current.data);
		
		// case 1 : Node has right subtree
		
		if(current.right != null)
		{
			TreeNode temp = current.right;
			while(temp.left != null)
			{
				temp = temp.left;
			}
			// temp is the inorder successor
			return temp;		
			
		}
		else
		{
			// No right subtree
			
			TreeNode successor = null;
			TreeNode ancestor = rootNode;
			
			while(ancestor != current)
			{
				if(current.data < ancestor.data)
				{
					successor = ancestor;
					ancestor = ancestor.left;
				}
				else
				{
					ancestor = ancestor.right;
				}
			}
			
			
			return successor;
		}
		
	}



	private static TreeNode searchBST(TreeNode rootNode, int key) {

		if(rootNode == null || rootNode.data == key){
			
			return rootNode;
		}
		if(key < rootNode.data)
		{
			return searchBST(rootNode.left , key);
		}
		
		return searchBST(rootNode.right , key);
	}



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
		root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.left.left = new TreeNode(6);
		root.left.right = new TreeNode(12);
		root.left.right.left = new TreeNode(11);		
		root.right.left = new TreeNode(17);
		root.right.left.left = new TreeNode(16);		
		root.right.right = new TreeNode(25);
		root.right.right = new TreeNode(27);
	}
	
	public void inOrderTraversal(TreeNode rootNode)
	{
		
		if(rootNode == null)
		{
			return;
		}
		
		inOrderTraversal(rootNode.left);		
		System.out.print(rootNode.data + " ");
		inOrderTraversal(rootNode.right);
		
	}
}
