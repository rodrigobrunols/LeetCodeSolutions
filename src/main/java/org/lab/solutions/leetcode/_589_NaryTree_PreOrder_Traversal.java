package org.lab.solutions.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 * <p>
 * Input: root = [1,null,3,2,4,null,5,6]
 * Output: [1,3,5,6,2,4]
 */

public class _589_NaryTree_PreOrder_Traversal {
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
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
    public List<Integer> solution(Node root) {
        var nodeList = new ArrayList<Integer>();

        return preorder(root, nodeList);
    }

    List<Integer> preorder(Node root, List<Integer> list) {
        if (root == null) return list;

        list.add(root.val);

        for (int i = 0; i < root.children.size(); i++) {
            list = preorder(root.children.get(i), list);
        }

        return list;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
    }
}
