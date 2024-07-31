package algorithm.g;

import java.util.Scanner;

public class G0704 {

    /**
     * 피보나치수열
     * 설명
     * 1. 피보나치 수열을 출력한다. 앞에 2개의 수를 합하여 다음 숫자가 되는 수열
     * 2. 입력은 피보나치 수열의 총 항의 수, 만약 7이 입력되면 1 1 2 3 5 8 13 이 답.
     * <p>
     * 입력
     * 첫번째 줄에 총 항수 N(3<=N<=45)이 주어짐.
     * <p>
     * 출력
     * 첫 줄에 피보나치 수열을 출력
     * <p>
     * 예시 입력
     * 10
     * 예시 출력
     * 1 1 2 3 5 8 13 21 34 55
     */

    static int[] fibo;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        G0704 main = new G0704();

        fibo = new int[n + 1];
        main.dfs(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public int dfs(int n) {
        if (fibo[n] != 0) {
            return fibo[n];
        }
        // 1, 2 에서는 재귀함수 호출 안 하고 1로 그냥 끝내버림.
        if (n==1) return fibo[n] = 1;
        if (n==2) return fibo[n] = 1;

        // 앞에앞에 항, 앞에 항
        return fibo[n] = dfs(n-2)+dfs(n-1);
    }

}
