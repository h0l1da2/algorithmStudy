package algorithm;

import java.util.Scanner;

public class A0111 {

    /**
     * 설명
     * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
     * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
     * 단 반복횟수가 1인 경우 생략합니다.
     * <p>
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     * <p>
     * 출력
     * 첫 줄에 압축된 문자열을 출력한다.
     * <p>
     * 예시 입력
     * KKHSSSSSSSE
     * 예시 출력
     * K2HS7E
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int count = 0;
        String result = "";
        char c = s.charAt(0);
        s += " ";

        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            } else {
                result += String.valueOf(c);
                if (count > 1) {
                    result += count;
                }
                count = 1;
            }
            c = s.charAt(i);
        }

        System.out.println(result);
    }
}
