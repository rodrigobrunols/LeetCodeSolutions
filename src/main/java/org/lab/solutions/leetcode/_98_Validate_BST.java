package org.lab.solutions.leetcode;

public class _98_Validate_BST {

    /**
     * Definition for a binary tree node.
     *
     */
      private class TreeNode {
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

    //Top Down DFS
    public boolean isValidBST(TreeNode root) {

        return preeorder(root, null, null);
    }

    private Integer prev = null;

    /**
     * Time O(n)
     * Space O(n)
     *
     * @param root
     * @param low
     * @param high
     * @return true if is a valide BST
     */
    public boolean preeorder(TreeNode root, Integer low, Integer high){
        if(root == null) return true;

        //process
        if ( (low != null && root.val <= low) || (high != null && root.val >= high)) return false;

        return preeorder(root.left, low, root.val) && preeorder(root.right, root.val, high);
    }

    public boolean inorder(TreeNode root){
        if(root == null) return true;

        if(!inorder(root.left)) return false;
        
        //procces
        if(prev != null && root.val <= prev) return false;
        prev = root.val;

        return inorder(root.right);

    }

    public static void main(String[] args) {

    }
}
