import java.util.*;
import java.lang.*;
import java.io.*;
// imported above modules
class KthMin {
    public static void main(String[] args) throws IOException {
		 int ar[]={2,5,7,3,15,25,10, 30,2};	 
	         int t =  Integer.parseInt(br.readLine());
		 for(int j=0;j<t;j++) {
			 for(int i=0;i<ar.length;i++) {
				 ar[i] = Integer.parseInt(st[i]);
			 }
			 Arrays.parallelSort(ar);
			 System.out.println(ar[target-1]);
		 }
	    System.out.println("Task Accomplished");
	}
}
