import java.util.*;
import java.lang.*;
import java.io.*;

class KthMin {
    public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t =  Integer.parseInt(br.readLine());
		 for(int j=0;j<t;j++) {
			 int n =  Integer.parseInt(br.readLine());
			 String[] st = br.readLine().split(" ");
			 int target =  Integer.parseInt(br.readLine());
			 int[] ar = new int[st.length];
			 for(int i=0;i<ar.length;i++) {
				 ar[i] = Integer.parseInt(st[i]);
			 }
			 Arrays.parallelSort(ar);
			 System.out.println(ar[target-1]);
		 }
	}
}
