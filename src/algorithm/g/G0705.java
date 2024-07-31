package algorithm.g;

public class G0705 {

    /**
     * 이진트리 순회 (깊이 우선 탐색)
     * 설명
     * 이진트리를 전위순회와 후위순회 연습하기
     * -모두 부모 기준
     * <전위순회>
     *     부모 -> 왼쪽 -> 오른쪽
     * <중위순회>
     *     왼쪽 -> 부모 -> 오른쪽
     * <후위순회>
     *     왼쪽 -> 오른쪽 -> 부모
     * <p>
     * 입력
     *
     * <p>
     * 전위순회 출력 : 1 2 4 5 3 6 7
     * 중위순회 출력 : 4 2 5 1 6 3 7
     * 후위순회 출력 : 4 5 2 6 7 3 1
     * <p>
     */

    Node root;

    public static void main(String[] args) {
        G0705 tree = new G0705();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.dfs(tree.root);
    }

    public void dfs(Node root) {
        // 말단 노드로 왔으니 재귀가 종료되어야 함. -> 더 갈 노드 없음.
        if (root == null) return;

//        System.out.print(root.data + " "); // 전위순회
        dfs(root.lt);
//        System.out.print(root.data + " "); // 중위순회
        dfs(root.rt);
//        System.out.print(root.data + " "); // 후위순회
    }

}

class Node {
    int data;

    Node lt;
    Node rt;

    public Node(int val) {
        this.data = val;
        this.lt = null;
        this.rt = null;
    }
}