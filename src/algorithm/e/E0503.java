package algorithm.e;

import java.util.Scanner;
import java.util.Stack;

public class E0503 {

    /**
     * 크레인 인형뽑기(카카오)
     * 설명
     * 인형 뽑기를 하자. 설명 너무 길어서 생략...
     * <p>
     * 입력
     * 첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
     * 두 번째 줄부터 N*N board 배열이 주어집니다.
     * board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
     * 0은 빈 칸을 나타냅니다.
     * 1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
     * board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
     * 마지막 줄에는 moves 배열이 주어집니다.
     * moves 배열의 크기는 1 이상 1,000 이하입니다.
     * moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
     * <p>
     * 출력
     * 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
     * <p>
     * 예시 입력
     * 5
     * 0 0 0 0 0
     * 0 0 1 0 3
     * 0 2 5 0 1
     * 4 2 4 4 2
     * 3 5 1 3 1
     * 8
     * 1 5 3 5 1 2 1 4
     * 예시 출력
     * 4
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];

        for (int i=0; i<m; i++) {
            moves[i] = in.nextInt();
        }

        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<m; i++) {
            int move = moves[i] - 1;
            for (int j=0; j<n; j++) {
                int tmp = board[j][move];
                if (tmp != 0) {
                    stack.push(board[j][move]);
                    board[j][move] = 0;
                    break;
                }
            }
        }

        int[] arr = new int[stack.size()];
        int cnt = 0;
        for (int i : stack) {
            arr[cnt++] = i;
        }

        int tmp = arr[0];
        int count = 1;
        for (int i = count; i < arr.length; i++) {
            if (tmp == arr[i]) {
                arr[i] = 0;
                arr[i - 1] = 0;
                result = result + 2;
                i = count;
            }
            if (arr[i] != 0) {
                tmp = arr[i];
            }
        }

        System.out.println(result);
    }
}
