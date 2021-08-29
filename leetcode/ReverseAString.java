class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start<end){
            int a =s[start];
            int b = s[end];
            a = a+b;
            b =a-b;
            a = a-b;
            s[start]= (char)(a);
            s[end]=(char)(b);
            start++;
            end--;
        }
    }
}

// Time: O(n), Space: O(1)