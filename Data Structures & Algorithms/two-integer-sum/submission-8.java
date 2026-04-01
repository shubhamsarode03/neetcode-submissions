class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        int value1 = -1;
        int value2 =-1;
        while(i<j){
            if(arr[i]+arr[j]== target){
                value1 =arr[i] ;
                value2 =arr[j];
                break;
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
                j--;
            }
        }
        int[] result = new int[2];
        int found = 0;
        for(int k=0; k<nums.length;k++){
            if(nums[k] == value1 && found == 0){
                result[0] = k;
                found++;
            }else if(nums[k] == value2){
                result[1]= k;
            }
        }
        Arrays.sort(result);
        return  result;
    }
}
