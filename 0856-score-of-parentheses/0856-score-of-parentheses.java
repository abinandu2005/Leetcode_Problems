class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> stack=new Stack<>();
        int cur=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                stack.push(cur);
                cur=0;
            }
            else cur=stack.pop()+Math.max(2*cur,1);
        }
        return cur;
    }
}