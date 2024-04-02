package algorithm;

import java.util.Scanner;

public class A0110 {

    /**
     * 설명
     * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
     * 문자열의 길이는 100을 넘지 않는다.
     * <p>
     * 출력
     * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
     * <p>
     * 예시 입력
     * teachermode e
     * 예시 출력
     * 1 0 1 2 1 0 1 2 2 1 0
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String c = in.next();

        char h = c.charAt(0);
        int[] result = new int[str.length()];

        int count = 101;
        for (int i=0; i<str.length(); i++) {
            if (h == str.charAt(i)) {
                count = 0;
            } else {
                count++;
            }
            result[i] = count;
        }

        for (int i = str.length(); i > 0; i--) {
            if (h == str.charAt(i - 1)) {
                count = 0;
            } else {
                count++;
            }
            result[i - 1] = Math.min(result[i - 1], count);
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
