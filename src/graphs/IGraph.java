package graphs;

import java.util.Set;

/**
 * Represents the basic operations of a graph structure.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 * @param <V> the type of vertices in the graph
 */
public interface IGraph<V>
{
    /**
     * Adds a new vertex to the graph. If the vertex already
     * exists, then no change is made to the graph.
     *
     * @param vertex the new vertex
     * @return true if the vertex was added, otherwise false
     */
    boolean addVertex(V vertex);

    /**
     * Adds a new edge to the graph. If the edge already exists,
     * then no change is made to the graph.
     *
     * Edges are considered to be directed.
     *
     * @param source the source vertex of the edge
     * @param destination the destination vertex of the edge
     * @param weight the edge weight, throws an IllegalArgumentException
     *               if the weight is negative
     * @return true if the edge was added, otherwise false
     * @throws IllegalArgumentException when given a non-positive edge weight
     * @throws IllegalArgumentException when given a source or destination vertex that does not exist
     */
    boolean addEdge(V source, V destination, int weight);

    /**
     * Returns the number of vertices in the graph.
     * @return the vertex count.
     */
    int vertexSize();

    /**
     * Returns the number of edges in the graph.
     * @return the edge count
     */
    int edgeSize();

    /**
     * Reports whether a vertex is in the graph or not.
     * @param vertex a vertex to search for
     * @return true if the vertex is in the graph, or false otherwise
     */
    boolean containsVertex(V vertex);

    /**
     * Reports whether an edge is in the graph or not.
     * @param source the source vertex of the edge
     * @param destination the destination vertex of the edge
     * @return true if edge is in the graph, or false otherwise
     */
    boolean containsEdge(V source, V destination);

    /**
     * Returns the edge weight of an edge in the graph.
     *
     * @param source the source vertex of the edge
     * @param destination the destination vertex of the edge
     * @return the edge weight, or -1 if the edge weight is not found
     */
    int edgeWeight(V source, V destination);

    /**
     * Returns a set with all vertices in the graph.
     * @return a vertex set
     */
    Set<V> vertices();

    /**
     * Returns a set with all edges in the graph.
     * @return an edge set
     */
    Set<Edge<V>> edges();

    /**
     * Removes a vertex from the graph.
     *
     * @param vertex the vertex to search for and remove
     * @return true if the vertex was found and removed, otherwise false
     */
    boolean removeVertex(V vertex);

    /**
     * Removes an edge from the graph.
     *
     * @param source the source vertex of the edge to search for and remove
     * @param destination the destination vertex of the edge to search for and remove
     * @return true if the edge was found and removed, otherwise false
     */
    boolean removeEdge(V source, V destination);

    /**
     * Removes all vertices and edges from the graph.
     */
    void clear();
}
