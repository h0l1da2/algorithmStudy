package algorithm.d;

import java.util.*;

public class D0404 {

    /**
     * 설명
     * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     * <p>
     * 입력
     * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
     * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
     * <p>
     * 출력
     * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
     * <p>
     * 예시 입력
     * bacaAacba
     * abc
     * 예시 출력
     * 3
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        int result = 0;

        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i=0; i<t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) +1);
        }

        int lt = 0;
        int rt = t.length();
        while (true) {
            HashMap<Character, Integer> map = new HashMap<>(tmap);
            for (int i=lt; i<rt; i++) {
                int tmp = map.getOrDefault(s.charAt(i), -1);
                if (tmp == -1) {
                    break;
                }
                if (tmp == 1) {
                    map.remove(s.charAt(i));
                }
                if (tmp > 1) {
                    map.put(s.charAt(i), tmp-1);
                }
            }
            if (map.size() == 0) {
                result++;
            }
            lt++;
            rt++;
            if (rt > s.length()) {
                break;
            }
        }

        System.out.println(result);
    }
}
