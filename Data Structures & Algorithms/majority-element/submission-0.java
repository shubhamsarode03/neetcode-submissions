class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        

        for(int i=0; i<nums.length; i++){
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()> nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}