package com.graph.GraphInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HoangVT on 12/22/17.
 */
public class Vertex {
    private int vetexId;
    private int weight = 1;
    private int prevVertexId = -1;
    private int f = -1;
    private int d = -1;
    private List<Integer[]> adjustedVertexList = new ArrayList<Integer[]>();



    public int getPrevVertexId() {
        return prevVertexId;
    }

    public void setPrevVertexId(int prevVertexId) {
        this.prevVertexId = prevVertexId;
    }


    public Vertex(int vetext_id)
    {
        this.setVertex_id(vetext_id);
    }
    public Vertex(int vetext_id,int weight)
    {
        this.setVertex_id(vetext_id);
        this.setWeight(weight);
    }



    public int getVetexId() {
        return vetexId;
    }

    public void setVertex_id(int vetext_id) {
        vetexId = vetext_id;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public List<Integer[]> getAdjustedVertexList() {
        return adjustedVertexList;
    }

    public void setAdjustedVertexList(List<Integer[]> adjustedVertexList) {
        this.adjustedVertexList = adjustedVertexList;
    }
}
