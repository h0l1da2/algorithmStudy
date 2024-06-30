package algorithm.e;

import java.util.Scanner;
import java.util.Stack;

public class E0501 {

    /**
     * 설명
     * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
     * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
     * <p>
     * 입력
     * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
     * <p>
     * 출력
     * 첫 번째 줄에 YES, NO를 출력한다.
     * <p>
     * 예시 입력
     * (()(()))(()
     * 예시 출력
     * NO
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        Stack<Character> stack = new Stack<>();

        char l = '(';
        char r = ')';

        String result = "YES";

        char[] charArr = input.toCharArray();

        int cnt = 0;
        for (char c : charArr) {
            cnt++;
            if (c == l) {
                stack.push(c);
            }
            if (c == r) {
                break;
            }

        }

        for (int i = cnt; i < charArr.length; i++) {
            if (charArr[i] == r) {
                if (stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }

            if (charArr[i] == l) {
                stack.push(charArr[i]);
            }
        }

        if (charArr[0] == r || charArr[charArr.length - 1] == l) {
            result = "NO";
        }

        System.out.println(result);
    }
}
