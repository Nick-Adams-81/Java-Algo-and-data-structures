package popularInterviewQuestions.strings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthaseses {

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(map.containsKey(current)) {
                char pop = stack.size() != 0 ? stack.pop() : '#';
                if(pop != map.get(current)) {
                    return false;
                }
            } else {
                stack.push(current);
            }
        }
        return true;
    }
}
