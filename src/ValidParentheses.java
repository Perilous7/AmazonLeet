import java.util.Deque;
import java.util.LinkedList;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static boolean isValid(String s){
        Deque<Character> deque = new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                deque.push(c);
            }
            else if (c == '{')
                deque.push('}');
            else if (c == '[')
                deque.push(']');
            else if (deque.isEmpty() || deque.pop() != c)
                return false;
        }
        return deque.isEmpty();
    }
}
