package com.graph.GraphInterface;

import com.basicDataStructure.*;

import java.util.List;


/**
 * Created by HoangVT on 12/22/17.
 */
public class AdjustLinkedGraph extends Graph
{
    private Vertex[] vertextSet;
    private int graphSize = 0;
    private int vertexMarked[];
    private  static final int WHITE = 0;
    private  static final int GRAY = 1;
    private static final int  BLACK = 2;
    private Queue<Integer> m_Queue = null;
    private Stack<Integer> m_Stack = null;
    private int            time = 0;
    public  AdjustLinkedGraph(int graphSize)
    {
        this.graphSize = graphSize;
        vertextSet = new Vertex[graphSize];
        vertexMarked = new int[graphSize];
        m_Queue     = new Queue<Integer>();
        m_Stack     = new Stack<Integer>();
        for (int i= 0; i<graphSize;i++)
        {
            vertextSet[i] = new Vertex(i);
            vertexMarked[i] = WHITE;
        }

    }

    public   void inputGraph(int fromVetex,int toVertex, int weight)
    {
        if (fromVetex == toVertex) return;
        Integer[] adjustedVertex = {toVertex,weight};
        vertextSet[fromVetex].getAdjustedVertexList().add(adjustedVertex);
    }


    public  void BFS(int StartVertex_ID)
    {
        vertexMarked[StartVertex_ID] = GRAY;
        m_Queue.push(StartVertex_ID);
        while (!m_Queue.isEmpty())
        {
            Integer VertextId = m_Queue.pop();
            List<Integer[]>  adjustedLinkedList = vertextSet[VertextId].getAdjustedVertexList();
            int adjustedVertextNumber = adjustedLinkedList.size();
            for(int i=0;i<adjustedVertextNumber;i++)
            {
                int currentVertextId = adjustedLinkedList.get(i)[0];
                if (vertexMarked[currentVertextId] == WHITE)
                {
                    vertexMarked[currentVertextId] = GRAY;
                    m_Queue.push(currentVertextId);
                }
            }
            vertexMarked[VertextId] = BLACK;
            System.out.println("Vertext:"+VertextId+" is Visisted");
        }
    }
    public  void DFS(int StartVertextId)
    {
        int currentVertexId = 0;
        vertexMarked[StartVertextId]= GRAY;
        m_Stack.push(StartVertextId);
        while (!m_Stack.isEmpty())
        {
            currentVertexId = m_Stack.getHeadStack();
            List<Integer[]> adjustVertextList = vertextSet[currentVertexId].getAdjustedVertexList();
            int adjustedVertextListSize = adjustVertextList.size();

            for (Integer[] vt:adjustVertextList) {

                if (vertexMarked[vt[0]] == WHITE)
                {
                    vertexMarked[vt[0]] = GRAY;
                    m_Stack.push(vt[0]);
                    currentVertexId = vt[0];
                    break;
                }
                else
                {
                    adjustedVertextListSize--;
                }
            }
            if (adjustedVertextListSize == 0)
            {
                vertexMarked[currentVertexId] = BLACK;
                System.out.println("Vertext:"+currentVertexId+" is Visisted");
                m_Stack.pop();

            }
        }
    }

    public  void RecursiveDFS(int s)
    {
        vertexMarked[s] = GRAY;
        time = time + 1;
        
        List<Integer[]> adjustVertextList = vertextSet[s].getAdjustedVertexList();
        for(Integer[] vt: adjustVertextList) {
            if( vertexMarked[vt[0]] == WHITE)
            {
                vertexMarked[vt[0]]= GRAY;
                RecursiveDFS(vt[0]);
            }

        }
        vertexMarked[s] = BLACK;
        System.out.println("Vertext:"+s+" is Visisted");


    }





}
