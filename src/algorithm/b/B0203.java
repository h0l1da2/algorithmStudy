package algorithm.b;

import java.util.Scanner;

public class B0203 {

    /**
     * 설명
     * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
     * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
     * 예를 들어 N=5이면
     * | 회수     | 1  | 2 | 3 | 4 | 5 |
     * |--------|-----|---|---|---|---|
     * | A의 정보 |  2 | 3 | 3 | 1 | 3 |
     * | B의 정보 |  1 | 1 | 2 | 2 | 3 |
     * | 순서    |  A | B | A | B | D |
     * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
     * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
     * <p>
     * 출력
     * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
     * <p>
     * 예시 입력
     * 5
     * 2 3 3 1 3
     * 1 1 2 2 3
     * 예시 출력
     * A
     * B
     * A
     * B
     * D
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String count = in.nextLine();
        String aLine = in.nextLine();
        String bLine = in.nextLine();

        String[] aStr = aLine.split(" ");
        String[] bStr = bLine.split(" ");

        int cnt = Integer.parseInt(count);

        String[] result = new String[cnt];
        for (int i=0; i<cnt; i++) {
            int a = Integer.parseInt(aStr[i]);
            int b = Integer.parseInt(bStr[i]);

            if (a == b) {
                result[i] = "D";
            } else if (a == 1) { // 가위
                if (b == 2) result[i] = "B";
                if (b == 3) result[i] = "A";
            } else if (a == 2) { // 바위
                if (b == 1) result[i] = "A";
                if (b == 3) result[i] = "B";
            } else if (a == 3) { // 보
                if (b == 1) result[i] = "B";
                if (b == 2) result[i] = "A";
            }
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}
