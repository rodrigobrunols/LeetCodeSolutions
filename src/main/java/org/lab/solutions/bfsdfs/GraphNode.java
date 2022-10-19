package org.lab.solutions.bfsdfs;

import org.lab.solutions.linkedlist.Node;

import java.util.ArrayList;

public class GraphNode {

    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<GraphNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<GraphNode> neighbors) {
        this.neighbors = neighbors;
    }

    ArrayList<GraphNode> neighbors;

    boolean marked;

    public GraphNode(String data) {
        this(data, new ArrayList<GraphNode>(),false);
    }

    public GraphNode(String data, ArrayList<GraphNode> neighbors, boolean visited) {
        this.data = data;
        this.neighbors = neighbors;
        this.marked = visited;
    }

    public GraphNode(String data, ArrayList<GraphNode> neighbors) {
        this(data, neighbors,false);
    }
}
