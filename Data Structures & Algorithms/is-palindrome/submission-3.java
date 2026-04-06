class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        for(int i =0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                newString+=ch;
            }
        }
        char[] arr = newString.toCharArray();
        int i=0;
        int j = arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String newStr = new String(arr);
        if(newString.equals(newStr)){
            return true;
        }
        return false;
    }
}
