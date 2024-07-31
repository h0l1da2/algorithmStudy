package algorithm.g;

import java.util.LinkedList;
import java.util.Queue;

public class G0707 {

    /**
     * 이진트리 순회(BFS) : 넓이 우선 탐색
     * 설명
     *    1     - 0레벨 (root)
     *  2   3   - 1레벨 (루트에서 1번만에 갈 수 있음)
     * 4 5 6 7  - 2레벨 (루트에서 2번만에 갈 수 있음)
     * 위 그림과 같은 이진트리를 레벨 탐색 연습하세요.
     * 루트에서 1번만에 갈 수 있는 거 다 가보기.
     * 2번만에 갈 수 있는 거 다 가보기.
     * Hint : 큐 사용하기
     * <p>
     * 출력
     * 1 2 3 4 5 6 7
     */

    Node2 root;

    public static void main(String[] args) {
        G0707 tree = new G0707();

        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);

        tree.bfs(tree.root);
    }

    public void bfs(Node2 root) {
        Queue<Node2> que = new LinkedList<>();
        que.offer(root); // 루트 노드
        int level = 0;
        while (!que.isEmpty()) {
            int len = que.size(); // que 원소가 몇 개 있나?
            System.out.print(level + " : ");

            for (int i = 0; i < len; i++) {
                Node2 cur = que.poll();
                System.out.print(cur.data + " ");

                // 자식이 있는 노드라면 que 에 넣어주고, que 에서 더 돌 수 있게 해줌.
                if (cur.lt != null) que.offer(cur.lt);
                if (cur.rt != null) que.offer(cur.rt);
            }
            level++;
            System.out.println();
        }
    }

}

class Node2 {
    int data;
    Node2 lt;
    Node2 rt;

    public Node2(int value) {
        data = value;
        lt = null;
        rt = null;
    }
}
