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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null)
            return false;
        else if(isSame(s,t))
            return true;
        else{
            return isSubtree(s.left,t) || isSubtree(s.right,t);
        }
    }
    
    public boolean isSame(TreeNode s, TreeNode t){
       if(s==null && t==null)
            return true;
        else if(s==null || t==null)
            return false;
        else if(s.val!=t.val)
            return false;
        else{
            return isSame(s.left,t.left) && isSame(s.right,t.right);
        }
    }
}