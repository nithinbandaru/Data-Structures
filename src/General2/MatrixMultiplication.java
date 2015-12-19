package General2;

import java.util.Scanner;

public class MatrixMultiplication {

   public static void main(String[] args) {
       
       double[][] a = {{0.25, 0.33 , 0.5 , 0.33},
    		   		   {0.25, 0.33 , 0.0 , 0.33},
    		           {0.25, 0.00 , 0.5 , 0.00},
    		           {0.25, 0.33 , 0.0 , 0.33}       
       				  };
       double[][] c = multiply(a, a);
       System.out.println("Product of A and B is");
       for (int i = 0; i < c.length; i++) {
           for (int j = 0; j < c[0].length; j++) {
               System.out.print(c[i][j] + " ");
           }
           System.out.println();
       }
   }

   public static double[][] multiply(double[][] a, double[][] b) {
       int rowsInA = a.length;
       int columnsInA = a[0].length; // same as rows in B
       int columnsInB = b[0].length;
       double[][] c = new double[rowsInA][columnsInB];
       for (int i = 0; i < rowsInA; i++) {
           for (int j = 0; j < columnsInB; j++) {
               for (int k = 0; k < columnsInA; k++) {
                   c[i][j] = c[i][j] + a[i][k] * b[k][j];
               }
           }
       }
       return c;
   }
}
