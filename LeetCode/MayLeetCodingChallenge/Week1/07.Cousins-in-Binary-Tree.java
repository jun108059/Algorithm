// Cousins in Binary Tree

import java.util.LinkedList;
import java.util.Queue;


// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
		// 유효성 검사
		if (root == null)
			return false;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int depth = 0;
		int depthX = 0;
		int depthY = 0;

		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				TreeNode currNode = queue.poll();
				if (currNode.left != null)
					queue.add(currNode.left);
				if (currNode.right != null)
					queue.add(currNode.right);

				if ((currNode.left != null && currNode.right != null)						//조건1
						&& ((currNode.left.val == x && currNode.right.val == y)
								|| (currNode.left.val == y && currNode.right.val == x))) { 
					return false;
				}
				if (currNode.val == x) //x층 update
					depthX = depth;
				if (currNode.val == y) //y층 update
					depthY = depth;
			}
			depth++; //한층 내려갈때마다 depth+1
		}
		return depthX == depthY ? true : false; //조건2 with 3항연산자       
        
    }
}
