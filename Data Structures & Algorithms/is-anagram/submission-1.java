class Solution {
    public boolean isAnagram(String s, String t) {
        int[] frq1 = new int[26];
        int[] frq2 = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i<s.length();i++){
            frq1[(int)s.charAt(i)-(int)'a']++;
            frq2[(int)t.charAt(i)-(int)'a']++;

        }
        
        for(int i=0;i<frq1.length;i++){
            
            if(frq1[i]!=frq2[i]){
                return false;
            }
        }
        return true;
    }
}
