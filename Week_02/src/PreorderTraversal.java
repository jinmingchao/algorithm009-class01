import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author MingChao Jin
 * @Date 2020/5/31 15:13
 * @Description: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //1. Recursion
    //TC:On
    //SC:On
    public static List<Integer> preorderTraversal1(TreeNode root) {
        if(root == null) {
            return new LinkedList<>();
        }
        List<Integer> list = new LinkedList<>();
        list.add(root.val);
        if (root.left!=null) {
            list.addAll(preorderTraversal1(root.left));
        }
        if(root.right !=null) {
            list.addAll(preorderTraversal1(root.right));
        }
        return list;
    }

    //2. Use stack
    //TC:On
    //SC:On
    public static List<Integer> preorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        List<Integer> list = new LinkedList<>();
        TreeNode current = root;
        while ( current!=null||!stack.empty()) {
            while (current !=null) {
                list.add(current.val);
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            current = current.right;

        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode second = null;
        TreeNode thrid = new TreeNode(2);
        TreeNode fourth = new TreeNode( 3);
        root.left = second;
        root.right = thrid;
        thrid.left = fourth;
//        List<Integer> list= preorderTraversal1(root);
        List<Integer> list= preorderTraversal2(root);
        System.out.println(list);
    }
}
