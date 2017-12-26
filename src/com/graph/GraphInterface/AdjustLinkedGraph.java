package com.graph.GraphInterface;

import com.basicDataStructure.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by HoangVT on 12/22/17.
 */
public class AdjustLinkedGraph extends Graph
{
    private List<Vertex>[] AdjustedVertextLists;
    private int graphSize = 0;
    private int MarkVertext[];
    private  static final int WHITE = 0;
    private  static final int GRAY = 1;
    private static final int  BLACK = 2;
    private Queue<Integer> m_Queue = null;
    private Stack<Integer> m_Stack = null;
    public  AdjustLinkedGraph(int graphSize)
    {
        this.graphSize = graphSize;
        AdjustedVertextLists = new List[graphSize];
        MarkVertext = new int[graphSize];
        m_Queue     = new Queue<Integer>();
        m_Stack     = new Stack<Integer>();
        for (int i= 0; i<graphSize;i++)
        {
            AdjustedVertextLists[i] = new ArrayList<>();
            MarkVertext[i] = WHITE;
        }

    }
    public void initilization()
    {
        for (int i= 0; i<graphSize;i++)
        {
            AdjustedVertextLists[i] = new ArrayList<>();
            MarkVertext[i] = WHITE;
        }

    }
    public   void inputGraph(int fromVetext,int toVertex, int weight)
    {
        if (fromVetext == toVertex) return;
        Vertex newVetex = new Vertex(toVertex,weight);
        AdjustedVertextLists[fromVetext].add(newVetex);
    }


    public  void BFS(int StartVertex_ID)
    {
        MarkVertext[StartVertex_ID] = GRAY;
        m_Queue.push(StartVertex_ID);
        while (!m_Queue.isEmpty())
        {
            Integer VertextId = m_Queue.pop();
            List<Vertex>  adjustedLinkedList = AdjustedVertextLists[VertextId];
            int adjustedVertextNumber = adjustedLinkedList.size();
            for(int i=0;i<adjustedVertextNumber;i++)
            {
                int currentVertextId = adjustedLinkedList.get(i).getVetext_id();
                if (MarkVertext[currentVertextId] == WHITE)
                {
                    MarkVertext[currentVertextId] = GRAY;
                    m_Queue.push(currentVertextId);
                }
            }
            MarkVertext[VertextId] = BLACK;
            System.out.println("Vertext:"+VertextId+" is Visisted");
        }
    }
    public  void DFS(int StartVertextId)
    {
        int currentVertextId = 0;
        MarkVertext[StartVertextId]= GRAY;
        m_Stack.push(StartVertextId);
        while (!m_Stack.isEmpty())
        {
            currentVertextId = m_Stack.getHeadStack();
            List<Vertex> adjusVertextList = AdjustedVertextLists[currentVertextId];
            int adjustedVertextListSize = adjusVertextList.size();

            for (Vertex vt:adjusVertextList) {

                if (MarkVertext[vt.getVetext_id()] == WHITE)
                {
                    MarkVertext[vt.getVetext_id()] = GRAY;
                    m_Stack.push(vt.getVetext_id());
                    currentVertextId = vt.getVetext_id();
                    break;
                }
                else
                {
                    adjustedVertextListSize--;
                }
            }
            if (adjustedVertextListSize == 0)
            {
                MarkVertext[currentVertextId] = BLACK;
                System.out.println("Vertext:"+currentVertextId+" is Visisted");
                m_Stack.pop();

            }
        }
    }

    public  void RecursiveDFS(int s)
    {
        MarkVertext[s] = GRAY;
        List<Vertex> AdjustVertextList = AdjustedVertextLists[s];
        for(Vertex vt: AdjustVertextList) {
            if( MarkVertext[vt.getVetext_id()] == WHITE)
            {
                MarkVertext[vt.getVetext_id()]= GRAY;
                RecursiveDFS(vt.getVetext_id());
            }

        }
        MarkVertext[s] = BLACK;
        System.out.println("Vertext:"+s+" is Visisted");


    }





}
