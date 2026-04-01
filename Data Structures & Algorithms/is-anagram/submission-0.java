class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
        
            boolean found = false;
            for(int j= 0; j<t.length();j++){
                if(st[i]=='\0' ||tt[j]=='\0'  ){
                    continue;
                }
                if(st[i]== tt[j]){
                    st[i]= '\0';
                    tt[j]='\0';
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}
