# Morris-Traversal
Summary:  

Inorder, Preorder, Postorder

The only difference between Inorder and Preorder is the time to add.
Inorder: add when left.right == root
Preorder: add when left.right == null.
However, both need to add when left == null.

Postorder: Symmetric to Inorder and Preorder and use addFirst instead of add.
The time to addFirst is right.left == null and right == null.
We store each node from root to leaf, since we use addFirst, we need to store the right child first and then left child, them we get Postorder.
