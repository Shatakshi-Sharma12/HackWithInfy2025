package Greedy_Approach;

	import java.util.*;

	public class String_Match {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine(); // Read the string
	        int[] result = diStringMatch(s);
	        System.out.println(Arrays.toString(result)); // Output the permutation
	    }

	    public static int[] diStringMatch(String s) {
	        int n = s.length();
	        int[] res = new int[n + 1];

	        int low = 0, high = n;

	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == 'I') {
	                res[i] = low++;
	            } else {
	                res[i] = high--;
	            }
	        }

	        
	        res[n] = low;

	        return res;
	    }
	}


