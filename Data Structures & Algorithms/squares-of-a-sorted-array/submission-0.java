class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int[] sortedArr = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            arr[i] = nums[i] * nums[i];
        }
        int left = 0;
        int right= nums.length-1;
        int pos = nums.length-1;
        while(left<=right){
            if(arr[left]<arr[right]){
                sortedArr[pos] = arr[right];
                right--;
                
            }else {
                sortedArr[pos] = arr[left];
                left++;
                
            }
            pos--;
        }
        return sortedArr;
    }
}