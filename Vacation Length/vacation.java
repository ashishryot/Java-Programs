 import java.util.*;


class Solution {
    public int solution(int[] A) {
       
        int start=0,end=0;
		Hashtable hash=new Hashtable();
		for(int i=0;i<A.length;i++) {
			if(hash.containsKey(A[i])) {
				hash.put(A[i],((int)hash.get(A[i])+1));
			}
			else
				hash.put(A[i], 0);
		}
	
		hash.put(A[0], 1);
		int c=1;
		for(int i=1;i<A.length;i++) {
			if((int)hash.get(A[i])==0) {
				c++;
			}
			if(A[i]!=A[start]) {
				end++;
				hash.put(A[i], 1);
			}
			else if(A[i]==A[start]) {
				start++;
				end++;
				
			}
			
			if(start>end) {
				end=start;
			}
			
			if(c==hash.size()) {
				break;
			}
		}
	
		return (end-start);
    }
}