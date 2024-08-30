package algorithm.f;

import java.util.Arrays;
import java.util.Scanner;

public class F0610 {

    /**
     * 마구간 정하기(결정알고리즘)
     * 설명
     * N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
     * 현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
     * 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
     * C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
     * 둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
     * <p>
     * 출력
     * 첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
     * <p>
     * 예시 입력
     * 5 3
     * 1 2 8 4 9
     * 예시 출력
     * 3
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int result = 0;

        int lt = 1; // 두 말 사이의 최소값
        int rt = arr[n-1]; // 최대값 (제일 큰 값 ->정렬됐으니 마지막 값)

        while(lt<=rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= c) {
                result = mid;
                lt = mid +1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(result);
    }

    public static int count(int[] arr, int ref) {
        int cnt = 1;
        int ep = arr[0]; // 한 마리 배치했음. 0번에다가.

        for (int i=1; i<arr.length; i++) {
            if (arr[i] - ep >= ref) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

}
