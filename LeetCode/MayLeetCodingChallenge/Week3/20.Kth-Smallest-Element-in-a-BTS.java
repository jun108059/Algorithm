// Kth Smallest Element in a BST

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Java Solution 1 - Inorder Traversal
// We can inorder traverse the tree and get the kth smallest element. Time is O(n).
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
 
        TreeNode p = root;
        int result = 0;
 
        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                TreeNode t = stack.pop();
                k--;
                if(k==0)
                    result = t.val;
                p = t.right;
            }
        }
    return result;
    }
}


// Similarly, we can also write the inorder traversal as the following:

public int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode p = root;
    while(p!=null){
        stack.push(p);
        p=p.left;
    }
    int i=0;
    while(!stack.isEmpty()){
        TreeNode t = stack.pop();
        i++;
 
        if(i==k)
            return t.val;
 
        TreeNode r = t.right;
        while(r!=null){
            stack.push(r);
            r=r.left;
        }
 
    }
 
    return -1;
}

// Java Solution 2 - Extra Data Structure

// We can let each node track the order, i.e., the number of elements that are less than itself. Time is O(log(n)).
