class Solution {
    public boolean isValid(String s) {
        
        char[] str = s.toCharArray();
        Deque<Character>stack = new ArrayDeque<>();
        for(char c: str){
            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c== ')' && top !='('){
                    return false;
                }
                if(c== ']' && top !='['){
                    return false;
                }
                if(c=='}' && top!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
        
}

