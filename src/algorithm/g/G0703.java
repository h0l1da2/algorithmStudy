package algorithm.g;

import java.util.Scanner;

public class G0703 {

    /**
     * 팩토리얼
     * 설명
     * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하시오.
     * 예를 들어 5! = 5*4*3*2*1=120
     * <p>
     * 입력
     * 첫번째 줄에 자연수 N(1<=N<=100)이 주어짐.
     * <p>
     * 출력
     * 첫 줄에 N팩토리얼 값을 출력.
     * <p>
     * 예시 입력
     * 5
     * 예시 출력
     * 120
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        G0703 main = new G0703();

        System.out.print(main.dfs(n));
    }

    public int dfs(int n) {
        // 1 에서는 재귀함수 호출 안 하고 1로 그냥 끝내버림.
        if (n==1) return 1;

        return n * dfs(n-1);
    }

}
