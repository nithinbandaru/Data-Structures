package SortingAlgorithms;

import java.util.Arrays;

public class Test1 {

	
	 public static int getSumOfNumbers(String s) {
	        /*
	          Please implement this method to
	          return the sum of all integers found in the parameter String. You can assume that
	          integers are separated from other parts with one or more spaces (' ' symbol).
	          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
	         */
	              String[] arr=s.split(" ");
	              int sum=0;
	              for(String ele:arr){
	            	  if(isNumeric(ele))
	            		  sum+=Integer.parseInt(ele);
	              }
	              return sum;

	    }

	 public static boolean isNumeric(String s) {  
		    return s.matches("[-+]?\\d*\\.?\\d+");  
		}
	 
	 
	 public static int getSumOfTwoClosestToZeroElements(int[] a) {
	        /*
	          Please implement this method to
	          return the sum of the two elements closest to zero.
	          If there are two elements equally close to zero like -2 and 2,
	          consider the positive element to be "closer" to zero than the negative one.
	         */
	             int[] b = a;
	            Arrays.sort(b);
	            int negativeValuePlacement = 0;
	            int positiveValuePlacement = 0;
	            int closestNumberToZero;

	            for( int i = 0; i < b.length; i++) {
	                if (b[i] < 0) {negativeValuePlacement++;
	                    positiveValuePlacement++;
	                }
	                if (b[i] == 0) positiveValuePlacement++;
	            }
	            --negativeValuePlacement;

	            if (b[0] >= 0) closestNumberToZero = b[positiveValuePlacement];
	            else {
	                if ((b[negativeValuePlacement]*-1) < b[positiveValuePlacement]) {
	                closestNumberToZero = (b[negativeValuePlacement]*-1);
	            }   else    closestNumberToZero = b[positiveValuePlacement]; }
	        return closestNumberToZero;

	    }

	 public static double getProbability(int Y, int X) {
	        /*
	          If you roll Y standard six-sided dice, what’s the probability that you get at least X 4s?
	          To calculate that you should divide the number of comibnations with X or more 4s
	          by the total number of possible combinations.
	         */

		       if(X > Y)
	             return 0;
	           if(X == Y)
	             return (1/Math.pow(6,Y));
	           else
	             return (1/Math.pow(6,X)+(Math.pow(5,Y-X)/Math.pow(6,Y-X)))+getProbability(Y,X+1);
	    }
	
	
	public static void main(String[] args) {
		String s="12 some text 3  7";
	/*	System.out.println(getSumOfNumbers(s));
		System.out.println(getProbability(1, 2));
	*/	System.out.println(Math.ceil(-4.7));
		System.out.println(Math.round(-4.7));
		System.out.println(Math.floor(-4.7));
		
		boolean a=false;
		if(a=true){
			System.out.println("Hello");
		}else{
			System.out.println("fg");
		}
		if(false){
			System.out.println("dsad");
		}else{
			System.out.println("aaa");
			//Math.pow(a, b);
		}
	}
	
	public int power(int x,int y) throws Exception{
	    if(x<0 || y<0)
	        throw new Exception("n and p should be non-negative");
	    else{
	       return (int)Math.pow(x,y);
	    }
	}
	

}

