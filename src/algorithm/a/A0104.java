package algorithm.a;

import java.util.Scanner;

public class A0104 {

    /**
     * 설명
     * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
     * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
     * <p>
     * 출력
     * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
     * <p>
     * 예시 입력
     * 3
     * good
     * Time
     * Big
     * 예시 출력
     * doog
     * emiT
     * giB
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        String[] strArr = new String[count];
        for (int i = 0; i < count; i++) {
            String inputStr = in.next();
            strArr[i] = inputStr;
        }

        String result = "";
        for (String str : strArr) {
            String[] splitStr = str.split("");
            int arrayIndex = str.length() - 1;
            for (int i = 0; i < splitStr.length; i++) {
                result += splitStr[arrayIndex--];
            }
            System.out.println(result);
            result = "";
        }
    }
}
