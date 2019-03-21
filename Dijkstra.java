import java.util.*;

public class Dijkstra {
    public Dijkstra(Graph graph, Vertex vertex) {
        this.graph = graph;
        startingVertex = vertex;
        this.edges = new ArrayList<>(graph.getEdges());
        this.vertices = new ArrayList<>(graph.getVertexes());

    }

    Graph graph;
    Vertex startingVertex;

    private Set<Vertex> unvisited;
    private Set<Vertex> visited;
    private Map<Vertex, Vertex> previous;
    private Map<Vertex, Integer> distance;
    ArrayList<Edge> edges;
    ArrayList<Vertex> vertices;


    public void execute() {
        unvisited = new HashSet<>(vertices);
        visited = new HashSet<>();
        previous = new HashMap<>();
        distance = new HashMap<>();
        visited.add(startingVertex);
        distance.put(startingVertex, 0);
        setAllStartingDistances();
        visited.remove(startingVertex);

        while(!unvisited.isEmpty()) {
            Vertex currentNode = getMinimum(unvisited);
            visited.add(currentNode);
            unvisited.remove(currentNode);
            ArrayList<Vertex> neighbours = graph.getNeighbours(currentNode);
            for(int i = 0; i < neighbours; i++){
                if(distance.get(i) > (distance.get(currentNode) + edges.get(i).getWeight(){
                    distance.replace(distance, distance.get(currentNode) + edges.get(i).getWeight());
            }

            }



            neighbours.add(graph.getNeighbours(currentNode));

           /* if(!neighbours.isEmpty()) {
                for (int i = 0; i < neighbours.size(); i++) {
                    findMinDistance(neighbours.get(i));
                }
            } */
        }

    }



    public void setAllStartingDistances() {
        for (int i = 0; i < unvisited.size(); i++) {
            distance.put(vertices.get(i), Integer.MAX_VALUE);
        }
    }

    public Vertex getMinimum(Set<Vertex> vertices) {
        Vertex minimum = null;
        for (Vertex vertex : vertices) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }
        return minimum;
    }


    public void findMinDistance(Vertex node){
        List<Vertex> adjacentNodes = graph.getNeighbours(node);
        for(Vertex target : adjacentNodes){
            if(getShortestDistance(target)>getShortestDistance(node)){
                distance.put(target, getShortestDistance(node) + getDistance(node, target));
                previous.put(target, node);
                visited.add(target);
            }
        }
    }


    public Integer getDistance(Vertex vertexSource, Vertex vertexDestination) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource().equals(vertexSource) && edges.get(i).getDestination().equals(vertexDestination)) {
                return edges.get(i).getWeight();
            }
        }
        return null;
    }




    public void setUnvisited(Set<Vertex> unvisited) {
        this.unvisited = unvisited;
    }

    public void addUnvisited() {

        unvisited.addAll(vertices);
    }

    public Set<Vertex> getUnvisited() {
        return unvisited;
    }



      public int getShortestDistance(Vertex destination) {
         Integer d = distance.get(destination);
            if(d == Integer.MAX_VALUE){
                return d;
            }
            return 0;
        }

    public LinkedList<Vertex> getPath(Vertex target) {
        LinkedList<Vertex> path = new LinkedList<Vertex>();
        Vertex step = target;
        // check if a path exists
        if (previous.get(step) == null) {
            return null;
        }
        path.add(step);
        while (previous.get(step) != null) {
            step = previous.get(step);
            path.add(step);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }

}


