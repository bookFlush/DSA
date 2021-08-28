package problemSolution;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Count_pairs_with_given_sum_20 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int pairCnt = 0;
        
        
        // This code is giving erroneous result when there are multiple duplicate
        // numbers which can create the pairs. So, Instead of using Set we should use HashMap
        /*
        Set set = new HashSet();
        for(int num : arr){
            if(set.contains(k-num)){
                pairCnt++;
            }else
            set.add(num);
        }
        return pairCnt;
        */
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int num : arr){
            if(hm.containsKey(k - num)){
                pairCnt += hm.get(k - num);
            }
                if(hm.containsKey(num)){
                    hm.put(num, hm.get(num) + 1);
                }else {
                    hm.put(num, 1);
                }
                
          
        }
         
         return pairCnt;
        
    }
}
