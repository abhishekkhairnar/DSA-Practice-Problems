package Stacks;

import java.util.Stack;
public class Paranthesis {
    public static void main(String[] args) {
        System.out.println(ispar("{{[)]}}"));
    }
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack();
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }
            else{
                if(c == ']' && stack.peek() == '['){
                    stack.pop();
                }else if(c == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(c == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}
