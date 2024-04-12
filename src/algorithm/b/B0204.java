package algorithm.b;

import java.util.Scanner;

public class B0204 {

    /**
     * 설명
     * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
     * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
     * <p>
     * 입력
     * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
     * <p>
     * 출력
     *첫 줄에 피보나치 수열을 출력합니다.
     * <p>
     * 예시 입력
     * 10
     * 예시 출력
     * 1 1 2 3 5 8 13 21 34 55
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();

        int[] result = new int[input];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;

        int x = result[2];
        int y = result[3];
        for (int i=4; i<input; i++) {
            result[i] = x + y;
            x = y;
            y = result[i];
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
