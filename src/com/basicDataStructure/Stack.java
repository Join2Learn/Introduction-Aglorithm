package com.basicDataStructure;

import com.graph.GraphInterface.Vertex;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by HoangVT on 12/25/17.
 */
public class Stack<E> {
    private List<E> m_data;
    private int m_size;
    public  Stack()
    {
        m_data = new LinkedList<E>();
        m_size = 0;
    }
    public boolean isEmpty()
    {
        return  (m_size==0);
    }

    public void push(E obj)
    {
        m_data.add(obj);
        m_size = m_size + 1;
    }
    public E pop()
    {
        E result = null;
        if (!isEmpty())
        {
            m_size = m_size -1;
            result = m_data.get(m_size);
            m_data.remove(result);
        }
        return result;

    }
    public E getHeadStack()
    {
        return  m_data.get(m_size -1);
    }


}
