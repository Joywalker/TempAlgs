package Dijkstra;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Joywalker on 4/29/2017.
 */
public class Vertex implements Comparable<Vertex> {
    public double distance = Double.POSITIVE_INFINITY;
    public ArrayList<Edge> neighboursList;
    public LinkedList<Vertex> shortestPathList;
    private int vertexIndex;

    public ArrayList<Edge> getNeighboursList() {
        return neighboursList;
    }

    public LinkedList<Vertex> getShortestPathList() {
        return shortestPathList;
    }

    public void setShortestPathList(LinkedList<Vertex> path)
    {
        this.shortestPathList = path;
    }

    public void addVertexToPath(Vertex visitedVertex)
    {
        shortestPathList.add(visitedVertex);
    }

    public Vertex(int _index)
    {
        this.vertexIndex = _index;
        neighboursList = new ArrayList<Edge>();
        shortestPathList = new LinkedList<>();
    }

    @Override
    /**
     *  This method will help the Queue sort the objects
     */
    public int compareTo(Vertex other) {
        if(other.distance > this.distance)
            return -1;
        if(this.distance > other.distance)
            return 1;
        return 0;
    }

    @Override
    public String toString()
    {
        return String.valueOf(vertexIndex);
    }
}
