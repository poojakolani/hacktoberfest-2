import java.util.*;
import java.lang.*;
import java.io.*;
//imported above repo
class DutchNational {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =  Integer.parseInt(br.readLine());
        for(int j = 0 ;j<t;j++){
            int s =  Integer.parseInt(br.readLine());
            String[] st =  br.readLine().split(" ");
            int[] ar = new int[st.length];
	    int low,mid,high;
	    low = 0;
		mid = 0;
		high = ar.length - 1;
		while (mid<=high){
		if(mid==0)
		{
			//swap() low and mid 
			low++;
			mid++;
		}
		elseif(mid==1){
			mid++;
		}
		else
		{
			//swap() high and mid
			high--;
		}
		}
        }
	}
}
