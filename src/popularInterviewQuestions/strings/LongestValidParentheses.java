package popularInterviewQuestions.strings;

import java.util.Stack;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if(stack.size() == 0) {
                    stack.push(i);
                } else {
                    answer = Math.max(answer, i - stack.peek());
                }
            }
        }
        return answer;
    }

}
