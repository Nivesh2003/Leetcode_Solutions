class Solution {
    public boolean isPalindrome(int x) {
        int v = x;
        int s = 0;
        while(x>0){
            int ld = x%10;
            s = s*10 + ld;
            x = x/10;
        }
        if (v==s){return true;}
        else return false;
        
        
    }
}
