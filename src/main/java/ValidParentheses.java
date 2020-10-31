import java.util.Stack;

public class ValidParentheses {

    public static void main(String args[]){
     System.out.println(isValidParentheses("{<>}"));
    }

    public static boolean isValidParentheses(String s){
        String opening = "(<[{";
        String closing = ")>]}";
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(opening.indexOf(c) != -1){
                stack.add(c);
            }
            if(closing.indexOf(c) != -1 ){
               if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
