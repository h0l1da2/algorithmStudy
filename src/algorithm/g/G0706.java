package algorithm.g;

import java.util.Scanner;

public class G0706 {

    /**
     * 부분집합구하기(DFS)
     * 설명
     * 자연수 N이 주어지면 1부터 N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫번째 줄에 자연수 N(1<=N<=10)이 주어짐.
     * <p>
     * 출력
     * 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력 예제와 같은 순서로 출력한다.
     * 단 공집합은 출력하지 않음.
     * <p>
     * 예시 입력
     * 3
     * 예시 출력
     * 1 2 3
     * 1 2
     * 1
     * 2 3
     * 2
     * 3
     */

    /**
     * 원소가 n 개인 집합의 부분집합의 갯수는 2의 n 제곱이다.
     * 2진 트리로 ... ->
     */
    static int n;
    static int[] check; // 부분집합으로 사용한다? 사용하지않는다? 체크하기

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        G0706 main = new G0706();

        check = new int[n + 1];
        main.dfs(1);
    }

    public void dfs(int l) { // l 을 원소로 사용한다? 사용하지 않는다?
        if (l == n+1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    tmp += i + " ";
                }
            }
            if (!tmp.isEmpty()){ System.out.println(tmp); }

        } else {
            // 사용한다 라고 체크했을 때는
            check[l] = 1;
            dfs(l+1); // 왼쪽으로 뻗고

            // 사용하지 않는다 라고 체크하면
            check[l] = 0;
            dfs(l+1); // 오른쪽으로 뻗는다고 생각하깅. ! (treeSet)
        }

    }

}
