package com.graph.GraphInterface;

import java.sql.Array;

/**
 * Created by HoangVT on 12/24/17.
 */
public abstract  class Graph {
    public void convertAdjustedMatrix2AdjustedListGraph(int[][] adjustedMatrix, Vertex[] adjustLinkedList)
    {

    }
    public void convertAdjustedListGraph2AdjustedMatrix( Vertex[] adjustLinkedList,int[][] adjustedMatrix)
    {

    }
    public  abstract void inputGraph(int fromVetext,int toVertex, int weight);
}
