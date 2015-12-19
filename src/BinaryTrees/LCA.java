package BinaryTrees;


public class LCA {

	public static void main(String[] args) {

		LCA tree = new LCA();
		tree.constructTree();
		tree.inOrderTraversal(tree.root);
		
		TreeNode p = tree.root.left.left.left ;
		TreeNode q = tree.root.left.right;
		
		TreeNode lca = FindLCA(tree.root, p , q);
		
		System.out.println("Ancestor : " + lca.data);
		
	}

	private static TreeNode FindLCA(TreeNode rootNode, TreeNode p, TreeNode q) {

		if(rootNode == null || rootNode == p || rootNode == q)
		{
			return rootNode;
		}
		
		TreeNode left = FindLCA(rootNode.left, p, q);
		TreeNode right = FindLCA(rootNode.right, p, q);
		
		if(left != null && right != null)
		{
			return rootNode;
		}
		
		
		return (left != null ? left : right);
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
