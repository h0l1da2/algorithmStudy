package algorithm.b;

import java.util.Scanner;

public class B0209 {

    /**
     * 설명
     * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
     * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
     * 입력
     * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
     * <p>
     * 출력
     * 최대합을 출력합니다.
     * <p>
     * 예시 입력
     * 5
     * 10 13 10 12 15
     * 12 39 30 23 11
     * 11 25 50 53 15
     * 19 27 29 37 27
     * 19 13 30 13 19
     * 예시 출력
     * 155
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int result = Integer.MIN_VALUE;
        int tmp = Integer.MIN_VALUE;

        // 가로
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                tmp += arr[i][j];
            }
            result = Math.max(result, tmp);
            tmp = 0;
        }
        // 세로
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                tmp += arr[j][i];
            }
            result = Math.max(result, tmp);
            tmp = 0;
        }
        // 왼대각선
        for (int i=0; i<n; i++) {
            tmp += arr[i][i];
        }
        result = Math.max(result, tmp);
        tmp = 0;

        // 오른대각선
        for (int i=0; i<n; i++) {
            tmp += arr[i][n-i-1];
        }
        result = Math.max(result, tmp);
        System.out.print(result);
    }
}
