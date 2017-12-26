package com.graph.GraphInterface;

import java.util.List;
import java.util.Map;

/**
 * Created by HoangVT on 12/22/17.
 */
public class Vertex {
    private int Vetext_id;
    //
    private int weight;
    public Vertex(int vetext_id)
    {
        this.Vetext_id = vetext_id;
    }
    public Vertex(int vetext_id,int weight)
    {
        this.Vetext_id = vetext_id;
        this.weight = weight;
    }

    private Map<Integer,Integer> adjustVertextst;

    public int getVetext_id() {
        return Vetext_id;
    }

    public void setVetext_id(int vetext_id) {
        Vetext_id = vetext_id;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
