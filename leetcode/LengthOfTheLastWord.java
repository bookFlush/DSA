class Solution {
    public int lengthOfLastWord(String s) {
        int  n = s.length();
        int i = n-1;
        int count = 0;
        while(i>=0){
            if(s.charAt(i)!=' '){
                count++;
                i--;
            }else if(count > 0 && s.charAt(i)==' '){
                break;
            }
            else{
                while(i>=0 && s.charAt(i)==' '){
                    i--;
                }
            }
        }
        return count;
    }
}