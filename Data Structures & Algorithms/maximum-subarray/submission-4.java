class Solution {
    public int maxSubArray(int[] nums) {
        int prevSum=0;
        int currentSum = Integer.MIN_VALUE;
        

        for(int i=0; i<nums.length; i++){
            
            prevSum += nums[i];
            if(prevSum> currentSum){
                currentSum = prevSum;

            }

            if(prevSum< 0){
                prevSum = 0;
            }
            
        }

        return currentSum;
    }
}
