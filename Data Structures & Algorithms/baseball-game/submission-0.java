class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack = new Stack<>();
        List<Integer>list = new ArrayList<>();
       
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("D")){
                int result = stack.peek()*2;
                stack.push(result);
            }else if(operations[i].equals("+")){
                int num1 = stack.pop();
                int num2 = stack.peek();
                stack.push(num1);
                int result = num1 + num2;
                stack.push(result);
            }else if(operations[i].equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        int sum=0;
        for(Integer val:stack){
            sum += val;
        }
        return sum;
    }
}