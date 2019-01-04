/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//    1
//   / \
//  0   2
//     /
//    3
// list = {1}, (right.left == null) 3->1, go to root.right, 2
// list = {2,1},(right == null) go to root.left, 3
// list = {3,2,1}, (right == null) go to root.left, 1
// list = {3,2,1}, (right.left == root) go to root.left, 0
// list = {0,3,2,1}, (right == null) go to root.left, null
class postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        while ( root != null ){
            TreeNode right = root.right;
            if ( right != null ){
                while ( right.left != null && right.left != root ) right = right.left;
                if ( right.left == null ) {
                    list.addFirst(root.val);
                    right.left = root;
                    root = root.right;
                }
                else{
                    right.left = null;
                    root = root.left;
                }
            }
            else {
                list.addFirst(root.val);
                root = root.left;
            }
        }
        return list;
    }
}

