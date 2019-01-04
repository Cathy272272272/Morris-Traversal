/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        while ( root != null ){
            TreeNode left = root.left;
            if ( left != null ){
                while ( left.right != null && left.right != root ) left = left.right;
                if ( left.right == null ) {
                    left.right = root;
                    root = root.left;
                }
                else{
                    left.right = null;
                    list.add(root.val);
                    root = root.right;
                }
            }
            else {
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}
