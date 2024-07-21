package algorithm.f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class F0607 {

    /**
     * 좌표 정렬
     * 설명
     * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
     * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
     * <p>
     * 입력
     * 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
     * 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
     * <p>
     * 출력
     * N개의 좌표를 정렬하여 출력하세요.
     * <p>
     * 예시 입력
     * 5
     * 2 7
     * 1 3
     * 1 2
     * 2 5
     * 3 6
     * 예시 출력
     * 1 2
     * 1 3
     * 2 5
     * 2 7
     * 3 6
     */

    /**
     * 1. 좌표 저장용 클래스 만들기 - ( Comparable<Point> 인터페이스 구현 객체 )
     * - compareTo : 정렬 기준 메서드 재정의 override
     * this (대상) -> o (매개변수) : 오름차순이면 this - o (음수) 10 - 20
     * this (대상) <- o (매개변수) : 내림차순이면 o - this (양수) 20 - 10
     *
     * 2. Collections.sort(list) 하면 -> Override 한 compareTo() 기준으로 정렬해줌 ㄷㄷ 대박;짱짱맨ㅋㅋ
     */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Point> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for (int i=0; i<n; i++) {
            Point p = list.get(i);
            System.out.println(p.x + " " + p.y);
        }
    }
}
class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

