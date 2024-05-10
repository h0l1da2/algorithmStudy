package algorithm.d;

import java.util.Scanner;

public class D0401_1 {

    /**
     * 설명
     * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
     * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
     * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
     * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
     * <p>
     * 입력
     * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
     * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
     * <p>
     * 출력
     * 학급 회장으로 선택된 기호를 출력합니다.
     * <p>
     * 예시 입력
     * 15
     * BACBACCACCBDEDE
     * 예시 출력
     * C
     */

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String input = in.next();

        String result = "";

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (int i=0; i<input.length(); i++) {
            char s = input.charAt(i);

            if (s == 'A') a++;
            if (s == 'B') b++;
            if (s == 'C') c++;
            if (s == 'D') d++;
            if (s == 'E') e++;
        }

        int max = Math.max(a, b);
        max = Math.max(max, c);
        max = Math.max(max, d);
        max = Math.max(max, e);

        if (max == a) { result = "A"; }
        else if (max == b) { result = "B"; }
        else if (max == c) { result = "C"; }
        else if (max == d) { result = "D"; }
        else if (max == e) { result = "E"; }

        System.out.println(result);
    }
}
