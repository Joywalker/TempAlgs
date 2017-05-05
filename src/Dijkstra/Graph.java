package Dijkstra;

import java.util.ArrayList;

/**
 * Created by Joywalker on 4/29/2017.
 */
public class Graph {

    private int verticesCount;
    private ArrayList<Vertex> vertices;
    public Graph(int nVertices)
    {
        this.verticesCount = nVertices;
        vertices = new ArrayList<Vertex>(verticesCount);
        for(int i = 0; i< verticesCount+1; i++)
        {
            vertices.add(new Vertex(i));
        }
    }

    public void addEdge(int _source, int _destination,double _cost)
    {
        Vertex ex = vertices.get(_source);
        Edge exEdge = new Edge(vertices.get(_destination),_cost);
        ex.neighboursList.add(exEdge);
    }

    public ArrayList<Vertex> getVertices() {return vertices;}
    public Vertex getVertex(int index)
    {
       return vertices.get(index);
    }
}
