// Last updated: 6/7/2026, 6:30:57 PM
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
class Solution {
    int k = 0;
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int currNum){
        if(root == null){
            return 0;
        }

        currNum = currNum*2 + root.val;

        if(root.left == null && root.right == null)
            return currNum;

        return dfs(root.left, currNum) + dfs(root.right, currNum);
            
    }
}