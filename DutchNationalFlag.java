import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =  Integer.parseInt(br.readLine());
        for(int j = 0 ;j<t;j++){
            int s =  Integer.parseInt(br.readLine());
            String[] st =  br.readLine().split(" ");
            int[] ar = new int[st.length];
            for(int i= 0; i<st.length;i++){
                ar[i] =  Integer.parseInt(st[i]);
            }
            Arrays.sort(ar);
            for(int ele:ar){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
	}
}
