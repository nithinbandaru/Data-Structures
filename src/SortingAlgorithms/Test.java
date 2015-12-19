package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {

	
	public static double value;
    public static int count;
	

	  // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }
    
    public static double getAverage(Node root) {
        /*
          Please implement this method to
          return the average of all node values (Node.getValue()) in the tree.
         */
    	int suma = root.getValue() + suma(root.getChildren());
		int count = 1 + count(root.getChildren());
		return suma / count;
      }
    
    private static int suma(List<Node> nodes) {
		if (nodes == null || nodes.isEmpty()) {
			return 0;
		}
		int suma = 0;
		for (Node n : nodes) {
			suma += n.getValue() + suma(n.getChildren());
		}
		return suma;
	}
    
    private static int count(List<Node> nodes) {
  		if (nodes == null || nodes.isEmpty()) {
  			return 0;
  		}
  		int suma = 0;
  		for (Node n : nodes) {
  			suma += 1 + count(n.getChildren());
  		}
  		return suma;
  	}
    
    public static int countWords(String s) {
        /*
          Please implement this method to
          return the word count in a given String.
          Assume that the parameter String can only contain spaces and alphanumeric characters.
         */

             String[] words=s.split(" ");
             return words.length;
 
    }
    
    public static int[] removeDuplicates(int[] a) {
        /*
          Please implement this method to
          remove all duplicates from the original array. Retain the order of the elements and
          always retain the first occurrence of the duplicate elements.
          For example, parameter: {2,1,2,3}, result: {2,1,3}
         */

       Set<Integer> set=new LinkedHashSet<Integer>();
       for(int i=0;i<a.length;i++){
    	   
    	   set.add(a[i]);
       }
       int[] arr = new int[set.size()];

       int index = 0;

       for( Integer i : set ) {
         arr[index++] = i; 
       }
       return arr;
    }
    
    

    public static void main(String args[]){
    	String s="Hello Hi How Are You";
    	//System.out.println(countWords(s));
    	String s1 = "abc";
    	String s2 = "abc";
    	System.out.println("s1 == s2 is:" + s1 == s2);	
    	int [] a={12,13,11,14};
    	int[] b=removeDuplicates(a);
    	//System.out.println(b[i]);
    	
    	List<Integer> l =getReversalsToSort(a);
    	System.out.println(l.toString()+l.size());
    }
    
    
    
    

    public static List<Integer> getReversalsToSort(int[] a) {
        /*
         You need to sort an array of integers by repeatedly reversing
         the order of the first several elements of it.

         For example, to sort [12,13,11,14], you need to  reverse the order of the first two (2)
         elements and get [13,12,11,14] and then reverse the order of the first three (3)
         elements and get [11,12,13,14]

         The method should return the shortest(!) possible list of integers corresponding to the required reversals.
         For the previous example, given an array [12,13,11,14]
         the method should return a list with Integers 2 and 3.
        */

        List<Integer> retList = new ArrayList<Integer>();
        if (a == null || a.length < 2) return retList;

        List<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            list.add(i);
        }

        int count = 2;
        while (!isSorted(list)) {
            Collections.reverse(list.subList(0, count));
            retList.add(count++);
        }

        return retList;
    }

   private static boolean isSorted(List<Integer> l){
        for(int i=0;i<l.size()-1;i++){
             if(l.get(i)>l.get(i+1))
                return false;
         }
         return true;

     }    
    
    
   
 
    
    
	
}
