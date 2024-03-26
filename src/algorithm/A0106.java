package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A0106 {

    /**
     * 설명
     * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
     * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     * <p>
     * 입력
     * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
     * <p>
     * 출력
     * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
     * <p>
     * 예시 입력
     * ksekkset
     * 예시 출력
     * kset
     */

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.next();
        char[] charArr = input.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();
        int index = 0;
        for (int i=0; i<charArr.length; i++) {
            if (charMap.get(charArr[i]) == null) {
                charMap.put(charArr[i], index++);
            }
        }

        char[] st = new char[charMap.size()];
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            st[entry.getValue()] = entry.getKey();
        }

        System.out.println(String.valueOf(st));
    }
}
