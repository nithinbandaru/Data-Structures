package BinaryTrees2;
import java.util.LinkedList;
import java.util.Queue;

public class AreTreesStructurallyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreTreesStructurallyIdentical tree1 = new AreTreesStructurallyIdentical();
		tree1.insertLevelOrder(1);
		tree1.insertLevelOrder(2);
		tree1.insertLevelOrder(3);
		tree1.insertLevelOrder(4);
		tree1.insertLevelOrder(5);
		tree1.insertLevelOrder(6);
		tree1.insertLevelOrder(7);
		
		AreTreesStructurallyIdentical tree2 = new AreTreesStructurallyIdentical();
		tree2.insertLevelOrder(1);
		tree2.insertLevelOrder(2);
		tree2.insertLevelOrder(3);
		tree2.insertLevelOrder(4);
		tree2.insertLevelOrder(5);
		tree2.insertLevelOrder(6);
		tree2.insertLevelOrder(7);		
		
		tree1.levelOrderTraversal(tree1.root);
		System.out.println();
		tree2.levelOrderTraversal(tree2.root);
		System.out.println();
		System.out.println("Are Trees Identical : "+ AreStructurallyidentical(tree1.root, tree2.root));
		
	

	}

	public static boolean AreStructurallyidentical(TreeNode root1, TreeNode root2)
	{
		
		if(root1 == null && root2 == null)
		{
			return true;
		}
		
		if(root1 == null || root2 == null)
		{
			return false;
		}
		
		return (root1.data == root2.data && AreStructurallyidentical(root1.leftChild, root2.leftChild) && AreStructurallyidentical(root1.rightChild, root2.rightChild));
	}

	TreeNode root;
	class TreeNode
	{
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
		
		public TreeNode(int val)
		{
			data = val;
			leftChild = null;
			rightChild = null;
		}
		
	}

	public void insertLevelOrder(int value)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//TreeNode rootNode = root;
		TreeNode newNode = new TreeNode(value);
		if(root == null)
		{
			root = newNode;
			return;
		}
		queue.add(root);
		TreeNode temp;
		while(!queue.isEmpty())
		{
			temp = queue.remove();
			
			if(temp.leftChild == null)
			{
				temp.leftChild = newNode;
				//System.out.println("left child added: "+newNode.data);
				return;
			}
			else
			{
				queue.add(temp.leftChild);
			}
			if(temp.rightChild == null)
			{
				temp.rightChild = newNode;
				//System.out.println("Right child added: "+newNode.data);
				return;
			}
			else
			{
				queue.add(temp.rightChild);
			}
		}
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
				System.out.print(temp.data+" ");
				if(temp.leftChild != null)
				{
					queue.add(temp.leftChild);
				}
				if (temp.rightChild !=null)					
				{
					queue.add(temp.rightChild);
				}
			}	
		}
	}



}
