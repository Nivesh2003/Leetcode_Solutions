class Solution {
    public int maxArea(int[] height) {
        int MaxWater = 0;
        int lp=0;
        int rp=height.length-1;
        while(lp<=rp){
            int width = rp-lp;
            MaxWater = Math.max(MaxWater,Math.min(height[lp],height[rp])*width);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
                    }
        return MaxWater;
    }
}
