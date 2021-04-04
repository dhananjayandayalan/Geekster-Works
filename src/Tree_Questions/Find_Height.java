package Tree_Questions;

public class Find_Height {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(6);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(solve(root));
    }

    public static int solve(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        return Math.max(left, right) + 1;
    }
}
