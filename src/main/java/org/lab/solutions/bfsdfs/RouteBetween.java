package org.lab.solutions.bfsdfs;

import org.lab.solutions.linkedlist.Node;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.Queue;

public class RouteBetween {


    public boolean routeBetweenNodes(GraphNode graphNodeA , GraphNode graphNodeB){
        if(graphNodeA == null || graphNodeB == null) return false;
        if(graphNodeA.equals(graphNodeB)) return true;

        var queue = new LinkedList<GraphNode>();

        graphNodeA.marked = true;

        queue.add(graphNodeA);

        while (!queue.isEmpty()){
            var n = queue.remove();

            for(var graphNode : n.getNeighbors()){
                if(n.equals(graphNodeB)) {
                    return true;
                }else {
                    if(!n.marked){
                        n.marked = true;
                        queue.add(n);
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(GraphNode node){
//        if(node == null) return false;
//        var queue = new LinkedList<GraphNode>();
//        node.visited = true;
//        queue.add(node);
//        while (!queue.isEmpty()){
//            var n = queue.remove();
//            visit(n);
//            for(var graphNode : n.getNeighbors()){
//                    if(!n.visited){
//                        n.visited = true;
//                        queue.add(n);
//                    }
//            }
//        }


        return false;
    }

    private void visit(GraphNode n) {
    }

    public static void main(String[] args) {

    }
}
