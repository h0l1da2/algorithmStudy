package algorithm;

import java.util.Locale;
import java.util.Scanner;

public class A0101 {

    /**
     * 설명
     * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
     * <p>
     * 입력
     * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
     * 문자열은 영어 알파벳으로만 구성되어 있습니다.
     * <p>
     * 출력
     * 첫 줄에 해당 문자의 개수를 출력한다.
     * <p>
     * 예시 입력
     * Computercooler
     * c
     * 예시 출력
     * 2
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputStr = in.next();
        String inputChar = in.next();

        inputStr = inputStr.toLowerCase(Locale.ROOT);
        inputChar = inputChar.toLowerCase(Locale.ROOT);

        String[] splitStr = inputStr.split("");

        int result = 0;
        for (String str : splitStr) {
            if (str.equals(inputChar)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
