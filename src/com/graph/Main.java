package com.graph;

import com.basicDataStructure.Queue;
import com.basicDataStructure.Stack;
import com.graph.GraphInterface.AdjustLinkedGraph;
import com.graph.GraphInterface.Graph;
import com.graph.GraphInterface.Vertex;

public class Main {

    public static void main(String[] args) {
        AdjustLinkedGraph graph0 = new AdjustLinkedGraph(8);
        graph0.inputGraph(0,1,1);
        graph0.inputGraph(0,4,1);
        graph0.inputGraph(1,0,1);
        graph0.inputGraph(1,5,1);
        graph0.inputGraph(2,3,1);
        graph0.inputGraph(2,5,1);
        graph0.inputGraph(2,6,1);
        graph0.inputGraph(3,2,1);
        graph0.inputGraph(3,6,1);
        graph0.inputGraph(3,7,1);
        graph0.inputGraph(4,0,1);
        graph0.inputGraph(5,1,1);
        graph0.inputGraph(5,2,1);
        graph0.inputGraph(5,6,1);
        graph0.inputGraph(6,2,1);
        graph0.inputGraph(6,3,1);
        graph0.inputGraph(6,5,1);
        graph0.inputGraph(6,7,1);
        graph0.inputGraph(7,3,1);
        graph0.inputGraph(7,6,1);
        System.out.println("1>=====>");
        graph0.DFS(7);
        System.out.println("2>=====>");
        AdjustLinkedGraph graph = new AdjustLinkedGraph(8);
        graph.inputGraph(0,1,1);
        graph.inputGraph(0,4,1);
        graph.inputGraph(1,0,1);
        graph.inputGraph(1,5,1);
        graph.inputGraph(2,3,1);
        graph.inputGraph(2,5,1);
        graph.inputGraph(2,6,1);
        graph.inputGraph(3,2,1);
        graph.inputGraph(3,6,1);
        graph.inputGraph(3,7,1);
        graph.inputGraph(4,0,1);
        graph.inputGraph(5,1,1);
        graph.inputGraph(5,2,1);
        graph.inputGraph(5,6,1);
        graph.inputGraph(6,2,1);
        graph.inputGraph(6,3,1);
        graph.inputGraph(6,5,1);
        graph.inputGraph(6,7,1);
        graph.inputGraph(7,3,1);
        graph.inputGraph(7,6,1);

        graph.RecursiveDFS(7);
    }
}
