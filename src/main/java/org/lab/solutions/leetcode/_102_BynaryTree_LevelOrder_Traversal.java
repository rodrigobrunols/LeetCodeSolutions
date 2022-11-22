package org.lab.solutions.leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 * <p>
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 */

public class _102_BynaryTree_LevelOrder_Traversal {
    // Definition for a Node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    ;

    /**
     * DFS = Preorder Traversal
     *
     * @param root root of tree
     * @return The array with in order traversal
     * <p>
     * Time O(n) worst case
     * Space O(n) worst case
     */
    public List<List<Integer>> solution(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();

        if ( root == null) return levels;

        var queue = new LinkedList<TreeNode>();

        queue.add(root);

        int level = 0;

        while(!queue.isEmpty()){
            //start current level
            levels.add(new ArrayList<Integer>());

            //numero de elementos no nivel atual;
            int level_length = queue.size();

            for(int i = 0; i< level_length; i++){

                TreeNode node = queue.remove();

                levels.get(level).add(node.val);

                if(node.left != null) queue.add(node.left);

                if(node.right != null) queue.add(node.right);
            }

            level++;
        }

        return levels;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
    }
}
