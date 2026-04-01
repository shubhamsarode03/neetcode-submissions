class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int k = n *2;
        int[] ans = new int[k];
        int j=0;
        while(j<n){
            ans[j] = nums[j];
            j++;
        }
        int i=0;
        while(j<k){
            ans[j] = nums[k+i-k];
            j++;
            i++;
        }
        return ans;
    }
}