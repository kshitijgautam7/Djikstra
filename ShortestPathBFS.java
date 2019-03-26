import java.util.*;

public class ShortestPathBFS {
    public ShortestPathBFS(Graph g, int miles, Vertex startingVertex, Vertex endVertex) {
        graph = g;
        maxDistance = miles;
        this.startingVertex = startingVertex;
        this.endVertex = endVertex;

    }

    private Graph graph;
    private Integer maxDistance;
    private Vertex startingVertex;
    private Vertex endVertex;
    private Queue<Vertex> q = new LinkedList<>();
    private Map<Vertex, Vertex> parentNodes = new HashMap<>();

    public void execute() {


        for (int i = 0; i < graph.edges.size(); i++) {

            if (graph.edges.get(i).getWeight() > maxDistance) {
               // System.out.println(edges.get(i));
                graph.edges.remove(i);
                i--;

            }

        }

        //System.out.println(graph.edges);


        q.add(startingVertex);
        startingVertex.visited = true;

        while (!q.isEmpty()) {
            Vertex x = q.remove();
            if (!x.visited) {
                x.visited = true;
            }

            ArrayList<Vertex> neighbours = graph.getNeighbours(x);

            for (int i = 0; i < neighbours.size(); i++) {
                Vertex y = neighbours.get(i);

                if (!y.visited) {
                    q.add(y);
                    parentNodes.put(y,x);
                }
            }
        }

        Vertex currentVertex = parentNodes.get(endVertex);
        System.out.println("Path from " + startingVertex.getName() + " to " + endVertex.getName() + " with maximum distance of " + maxDistance);
        parentNodes.put(startingVertex, null);

        ArrayList<String> solution = new ArrayList<>();


        while(parentNodes.get(currentVertex) != null){
            //System.out.println(currentVertex.getName());
            solution.add(currentVertex.getName());
            currentVertex = parentNodes.get(currentVertex);
        }

        solution.add(startingVertex.getName());
        Collections.reverse(solution);
        solution.add(endVertex.getName());

        if(solution.size() == 2){
            System.out.println("No path");
        }
        else {
            System.out.println(solution);
        }


    }


}