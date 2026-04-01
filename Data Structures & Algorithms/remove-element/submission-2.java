class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        boolean found = false;
        for( int i =0; i<nums.length;i++){
            
            if(nums[i] == val){
                 index =i;
                 found = true;
                 break;
            }
        }
        if(!found){
            return nums.length;
        }
        for(int j = index+1; j<nums.length; j++){
            if(nums[j] != val){
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
                index++;
            }
        }
        return index;
    }
}