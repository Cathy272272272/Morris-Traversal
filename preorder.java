/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        while ( root != null ){
            TreeNode left = root.left;
            if ( left != null ){
                while ( left.right != null && left.right != root ) left = left.right;
                if ( left.right == null ) {
                    list.add(root.val);
                    left.right = root;
                    root = root.left;
                }
                else{
                    left.right = null;
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
