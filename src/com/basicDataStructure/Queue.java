package com.basicDataStructure;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by HoangVT on 12/25/17.
 */
public class Queue<E> {
    private List<E> m_data;
    private int m_size;
    public Queue()
    {
        m_data = new LinkedList<E>();
        m_size = 0;
    }

    public boolean isEmpty()
    {
        return  (m_size == 0);
    }
    public void  push(E obj)
    {
        m_data.add(obj);
        m_size = m_size + 1;
    }
    public E pop()
    {
        if (isEmpty()) return null;
        m_size = m_size - 1;
        E  result = m_data.get(0);
        m_data.remove(0);
        return  result;
    }

}
