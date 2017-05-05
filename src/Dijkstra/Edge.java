package Algorithms.Dijkstra;

/**
 * Created by Joywalker on 4/29/2017.
 */
public class Edge{

    private Vertex destination;
    private double cost;

    public Edge(Vertex _destination, double length) //add edge from current node to destination vertex
    {
        this.destination = _destination; // destination vertex
        this.cost = length; //cost of the destination
    }

    //getters
    public double getLength() {return this.cost;}
    public Vertex getDestination() {return this.destination;}
}
