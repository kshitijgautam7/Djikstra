import java.util.*;

public class Main {
    public static void main(String args[]) {
        Vertex vertexTest1 = new Vertex("yes", "first");
        Vertex vertexTest2 = new Vertex("yo", "second");
        Vertex vertexTest3 = new Vertex("y", "Third");
        Vertex vertexTest4 = new Vertex("ye", "fourth");

        Edge edgeTest1 = new Edge("link1",vertexTest1, vertexTest2, 2);
        Edge edgeTest2 = new Edge("link2",vertexTest1, vertexTest4, 1);

        List<Vertex> vertexes = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        vertexes.add(vertexTest1);
        vertexes.add(vertexTest2);
        vertexes.add(vertexTest3);
        vertexes.add(vertexTest4);

        edges.add(edgeTest1);
        edges.add(edgeTest2);

        Graph graphTest = new Graph(vertexes,edges);

      /*  System.out.println(graphTest.getVertexes());
        System.out.println(graphTest.getEdges());
        System.out.println(vertexes.get(0).getName());
        System.out.println(vertexes.get(0).getId());
        System.out.println(edges.get(0).getId());
        System.out.println(edges.get(0).getSource());
        System.out.println(edges.get(0).getDestination());
        System.out.println(edges.get(0).getWeight());
        System.out.println(graphTest.adjacent(vertexTest1,vertexTest2));
        System.out.println(graphTest.adjacent(vertexTest1,vertexTest1));
        System.out.println(graphTest.adjacent(vertexTest2,vertexTest3));
        System.out.println(graphTest.adjacent(vertexTest2,vertexTest4));
        System.out.println(graphTest.adjacent(vertexTest4,vertexTest1));
        System.out.println(graphTest.getNeighbours(vertexTest2));
        System.out.println(graphTest.getNeighbours(vertexTest1));
        System.out.println(graphTest.getNeighbours(vertexTest3));
        System.out.println(graphTest.getNeighbours(vertexTest4)); */


        Dijkstra test = new Dijkstra(graphTest,vertexTest1);
        System.out.println(test.startingVertex);
        test.execute();
        System.out.println(test.getPath(vertexTest4));

       // test.addUnivisited();

       // System.out.println(test.getUnvisited());
    }
}
