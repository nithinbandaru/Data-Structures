package BinaryTrees2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class IndeedQuantilesProblem {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        int M = scanner.nextInt();
        
        List<Integer> a = new ArrayList();
        for (int i=0; i < M; i++) {
        	String value = scanner.next();
        	String count = scanner.next();

            for (int j=0; j < Integer.parseInt(count); j++)
                a.add(Integer.parseInt(value));
        }
        int N = a.size();
        
        List<Integer> quantiles = new ArrayList<>();
        for (int k=1; k < Q; k++) {
        	int ik = (int) Math.ceil(N * k / Q);
        	quantiles.add(a.get(ik));
        }

        Collections.sort(quantiles);
        for (int quantile: quantiles)
        	System.out.println(quantile);
    }
}