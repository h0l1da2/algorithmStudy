package algorithm.g;

import java.util.Scanner;

public class G0702 {

    /**
     * 재귀함수를 이용한 이진수 출력
     * 설명
     * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램.
     * 재귀함수를 이용해서 출력하시오.
     * <p>
     * 입력
     * 첫번째 줄에 10진수 N(1<=N<=1,000)이 주어짐.
     * <p>
     * 출력
     * 첫 줄에 2진수 출력.
     * <p>
     * 예시 입력
     * 11
     * 예시 출력
     * 1011
     */

    /**
     * 10 진수 -> 2진수 구하는 법
     * 10진수를 계속 2로 나눠서 몫 / 나머지를 구하고 그걸 쭉 이어붙이면 됨
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        G0702 main = new G0702();
        main.dfs(n);
    }

    public void dfs(int n) {
        // void 형에서 return 은 함수 종료의 의미...
        if (n==0) return;

        dfs(n / 2);
        System.out.print((n % 2));
    }

}
