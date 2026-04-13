class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int d = 0;
        while(true){
            if(start-d>=0){
                if(nums[start-d]==target){
                    return d;
                }
            }
            if(start+d < nums.length){
                if(nums[start+d]==target){
                    return d;
                }
            }
            d++;
        }
    }
}