package algorithm.b;

import java.util.Scanner;

public class B0205 {

    /**
     * 설명
     * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
     * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     * <p>
     * 입력
     * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
     * <p>
     * 출력
     * 첫 줄에 소수의 개수를 출력합니다.
     * <p>
     * 예시 입력
     * 20
     * 예시 출력
     * 8
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();

        int result = 1; // 0,1 -> 소수아님 | 2 -> 무조건 소수
        boolean flag = false;
        for (int i = 3; i <= input; i++) { // 2는 무조건 소수니까, 3부터 ㄱㄱ
            for (int x = 2; x <= Math.sqrt(i); x++) {
                if (i % x == 0) {
                    flag = true; // 소수아님
                    break;
                }
            }
            if (!flag) {
                result++;
            }
            flag = false;
        }
        System.out.print(result);
    }
}
