package algorithm.e;

import java.util.Scanner;
import java.util.Stack;

public class E0502 {

    /**
     * 설명
     * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     * <p>
     * 출력
     * 남은 문자만 출력한다.
     * <p>
     * 예시 입력
     * (A(BC)D)EF(G(H)(IJ)K)LM(N)
     * 예시 출력
     * EFLM
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();

        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        StringBuilder result = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(arr[i]);
            }
        }

        for (char c : stack) {
            result.append(c);
        }

        System.out.println(result);
    }
}
