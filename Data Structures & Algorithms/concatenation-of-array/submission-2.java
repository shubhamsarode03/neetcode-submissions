class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int k = n *2;
        int[] ans = new int[k];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }
        for(int j=0; j<nums.length; j++){
            ans[j+nums.length] = nums[j];
        }
        return ans;
    }
}