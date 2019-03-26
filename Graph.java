import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<Vertex> vertexes;
    List<Edge> edges;

    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public boolean adjacent(Vertex x, Vertex y)	{
        // Returns true when there’s an edge from x to y
        // TODO: Implement this method

        for(int i = 0; i<getEdges().size(); i++){
           if(edges.get(i).getDestination().equals(x)){
               if(edges.get(i).getSource().equals(y)) {
                   return true;
               }
           }

           if(edges.get(i).getDestination().equals(y)){
               if(edges.get(i).getSource().equals(x)){
                   return true;
               }
           }

           if(edges.get(i).getSource().equals(x)){
               if(edges.get(i).getDestination().equals(y)){
                   return true;
               }
           }

           if(edges.get(i).getSource().equals(y)){
               if(edges.get(i).getDestination().equals(x)){
                   return true;
               }
           }
        }
        return false;
    }

    public ArrayList<Vertex> getNeighbours(Vertex vertex) {
        // Returns all neighbours of a given vertex

        ArrayList<Vertex> vertexList = new ArrayList<>();
        for(int i = 0; i<getEdges().size(); i++){
            if(edges.get(i).getDestination().equals(vertex)){
                vertexList.add(edges.get(i).getSource());
            }
            if(edges.get(i).getSource().equals(vertex)){
                vertexList.add(edges.get(i).getDestination());
            }
        }

        if(vertexList.size() > 0){
            return vertexList;
        }
        return null;
    }

    }


