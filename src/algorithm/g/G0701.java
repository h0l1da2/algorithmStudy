package algorithm.g;

import java.util.Scanner;

public class G0701 {

    /**
     * 재귀함수
     * 설명
     * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력
     * <p>
     * 입력
     * 첫번째 줄에 정수 N(3<=N<=10)이 입력된다.
     * <p>
     * 출력
     * 첫 줄에 입력됨.
     * <p>
     * 예시 입력
     * 3
     * 예시 출력
     * 1 2 3
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        G0701 main = new G0701();
        main.dfs(n);
    }

    public void dfs(int n) {
        // void 형에서 return 은 함수 종료의 의미...
        if (n==0) return;

        dfs(n - 1);
        System.out.print(n + " ");
    }

    /**
     * 함수가 호출됐을 때 스택 프레임에는 ?
     * -매개변수 정보
     * -지역변수 정보
     * -복귀주소
     *
     * 스택프레임을 이용해서 백트래킹을 할 수 있음
     */
}
