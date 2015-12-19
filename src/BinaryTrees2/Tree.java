package BinaryTrees2;
import java.util.Iterator;
import java.util.LinkedList;

 
public class Tree 
{
	BinaryTreeNode root;
		
	public static void main(String [] args)
	{
		Tree tree = new Tree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(7);
		
		tree.printOrderTraversal();
		tree.printLevelOrder();
	}
	
	
	public class BinaryTreeNode
	{
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;

		public BinaryTreeNode(int value)
		{
			data = value;
			left = null;
			right = null;
		}
	}
	
	public void printOrderTraversal()
	{
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(BinaryTreeNode current_node)
	{
		if(current_node == null)
		{
			return;
		}
		
		inOrderTraversal(current_node.left);
		System.out.println("data: " + current_node.data);
		inOrderTraversal(current_node.right);
	}
	
	public void printLevelOrder()
	{
		LinkedList<BinaryTreeNode> nodes_at_current_level = new LinkedList<BinaryTreeNode>();
		nodes_at_current_level.add(root);
		
		while(nodes_at_current_level.size() > 0)
		{
			LinkedList<BinaryTreeNode> nodes_at_next_level = new LinkedList<BinaryTreeNode>();			
			Iterator<BinaryTreeNode> nodes_at_current_level_iterator = nodes_at_current_level.iterator();
			
			while(nodes_at_current_level_iterator.hasNext())
			{
				BinaryTreeNode node = nodes_at_current_level_iterator.next();
				
				if(node.left != null)
				{
					nodes_at_next_level.add(node.left);
				}
				
				if(node.right != null)
				{
					nodes_at_next_level.add(node.right);
				}
				
				System.out.print(node.data + "  ");
			}
			
			nodes_at_current_level = nodes_at_next_level;	
			System.out.println();
		}
		
	}
	
	public void insert(int value)
	{
		BinaryTreeNode new_node = new BinaryTreeNode(value);
		
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		BinaryTreeNode current_visited_node = root;
		boolean new_node_inserted = false;
		
		while(!new_node_inserted)
		{
			if(current_visited_node.data > new_node.data)
			{
				if(current_visited_node.left == null)
				{
					current_visited_node.left = new_node;
					new_node_inserted = true;
				}
				else
				{
					current_visited_node = current_visited_node.left;
				}
			}			
			else if(current_visited_node.data < new_node.data)
			{
				if(current_visited_node.right == null)
				{
					current_visited_node.right = new_node;
					new_node_inserted = true;
				}
				else
				{
					current_visited_node = current_visited_node.right;
				}				
			}
		}
	}
	
	
	
}
