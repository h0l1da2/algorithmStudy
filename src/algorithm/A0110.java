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
        String s = in.next();
        String t = in.next();

        int[] arr = new int[s.length()];

        int count = 101;
        char c = t.charAt(0);

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                count = 0;
            } else {
                count++;
            }
            arr[i] = count;
        }

        for (int i=s.length(); i>0; i--) {
            if (s.charAt(i - 1) == c) {
                count = 0;
            } else {
                count++;
            }
            arr[i - 1] = Math.min(count, arr[i - 1]);
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
