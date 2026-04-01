class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>>map = new HashMap<>();

        for(String word: strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        for(String key:map.keySet()){

            result.add(map.get(key));
        }
        return result;
    }
}
