class Solution {
    public int reverse(int x) {
        int num= 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        while(x>0){
            int last = x%10;
             if (num > (Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10 && last > 7)) {
            return 0;
        }
        if (num < (Integer.MIN_VALUE / 10) || (num == Integer.MIN_VALUE / 10 && last < -8)) {
            return 0;
        }
            num = num*10 + last;
            x = x/10;
        }
        return num*sign;
    }
}
