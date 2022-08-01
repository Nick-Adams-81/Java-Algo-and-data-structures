package popularInterviewQuestions.strings;

import java.util.Stack;

public class DecodeString {

    // Asked  by google!!!!
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                int num = ch - '0';
                while (i + 1 < length && Character.isDigit(i + 1)) {
                    num = num * 10 + s.charAt(i + 1) - '0';
                }
                numStack.push(num);
            } else if(ch == '[') {
                strStack.push(sb.toString());
                sb = new StringBuilder();
            } else if(ch == ']') {
                int k = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for(int j = 0; j < k; j++) {
                    temp.append(sb);
                }
                sb = temp;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
