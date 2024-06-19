package day0619;

public class TreeOrder {
    public static void main(String[] args) {
        int dest = 20;

        //1. 전위 순회(preorder)
        System.out.println("1. preOrder traversal");
        preOrder(1, dest);
        System.out.println();

        //2. 중위 순회(inorder)
        System.out.println("2. inOrder traversal");
        inOrder(1, dest);
        System.out.println();

        //3. 후위 순회(postorder)
        System.out.println("3. postOrder traversal");
        postOrder(1, dest);
        System.out.println();
    }

    public static void preOrder(int n, int dest) {
        if (n >= dest) {
            return;
        }
        System.out.print(n + " ");
        preOrder(n * 2, dest);
        preOrder(n * 2 + 1, dest);
    }

    public static void inOrder(int n, int dest) {
        if (n >= dest) {
            return;
        }
        inOrder(n * 2, dest);
        System.out.print(n + " ");
        inOrder(n * 2 + 1, dest);
    }

    public static void postOrder(int n, int dest) {
        if (n >= dest) {
            return;
        }
        postOrder(n * 2, dest);
        postOrder(n * 2 + 1, dest);
        System.out.print(n + " ");
    }
}
