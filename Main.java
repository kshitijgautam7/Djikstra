import java.util.*;

public class Main {
    public static void main(String args[]) {

        List<Vertex> vertexes = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        Vertex vertexA = new Vertex("Vertex A");
        Vertex vertexB = new Vertex("Vertex B");
        Vertex vertexC = new Vertex("Vertex C");
        Vertex vertexD = new Vertex("Vertex D");
        Vertex vertexE = new Vertex("Vertex E");
        Vertex vertexF = new Vertex("Vertex F");
        Vertex vertexG = new Vertex("Vertex G");
        Vertex vertexH = new Vertex("Vertex H");
        Vertex vertexI = new Vertex("Vertex I");
        Vertex vertexJ = new Vertex("Vertex J");
        Vertex vertexK = new Vertex("Vertex K");
        Vertex vertexL = new Vertex("Vertex L");
        Vertex vertexM = new Vertex("Vertex M");
        Vertex vertexN = new Vertex("Vertex N");
        Vertex vertexO = new Vertex("Vertex O");
        Vertex vertexP = new Vertex("Vertex P");
        Vertex vertexQ = new Vertex("Vertex Q");
        Vertex vertexR = new Vertex("Vertex R");
        Vertex vertexS = new Vertex("Vertex S");
        Vertex vertexT = new Vertex("Vertex T");
        Vertex vertexU = new Vertex("Vertex U");

        Edge edge1 = new Edge("A->O", vertexA, vertexO, 2);
        Edge edge2 = new Edge("B->N", vertexB, vertexN, 2);
        Edge edge3 = new Edge("B->C", vertexB, vertexC, 7);
        Edge edge4 = new Edge("C->F", vertexC, vertexF, 4);
        Edge edge5 = new Edge("C->D", vertexC, vertexD, 3);
        Edge edge6 = new Edge("D->G", vertexD, vertexG, 9);
        Edge edge7 = new Edge("D->H", vertexD, vertexH, 5);
        Edge edge8 = new Edge("I->H", vertexI, vertexH, 3);
        Edge edge9 = new Edge("I->S", vertexI, vertexS, 4);
        Edge edge10 = new Edge("I->J", vertexI, vertexJ, 5);
        Edge edge11 = new Edge("S->U", vertexS, vertexU, 1);
        Edge edge12 = new Edge("L->F", vertexL, vertexF, 7);
        Edge edge13 = new Edge("S->J", vertexS, vertexJ, 2);
        Edge edge14 = new Edge("E->J", vertexE, vertexJ, 1);
        Edge edge15 = new Edge("A->B", vertexA, vertexB, 2);
        Edge edge16 = new Edge("J->P", vertexJ, vertexP, 3);
        Edge edge17 = new Edge("E->H", vertexE, vertexH, 2);
        Edge edge18 = new Edge("E->P", vertexE, vertexP, 1);
        Edge edge19 = new Edge("E->K", vertexE, vertexK, 3);
        Edge edge20 = new Edge("Q->R", vertexQ, vertexR, 4);
        Edge edge21 = new Edge("L->Q", vertexL, vertexQ, 6);
        Edge edge22 = new Edge("Q->M", vertexQ, vertexM, 4);
        Edge edge23 = new Edge("P->R", vertexP, vertexR, 6);
        Edge edge24 = new Edge("R->K", vertexR, vertexK, 2);
        Edge edge25 = new Edge("K->G", vertexK, vertexG, 5);
        Edge edge26 = new Edge("K->L", vertexK, vertexL, 5);
        Edge edge27 = new Edge("T->M", vertexT, vertexM, 1);
        Edge edge28 = new Edge("N->O", vertexN, vertexO, 2);
        Edge edge29 = new Edge("N->M", vertexN, vertexM, 4);
        Edge edge30 = new Edge("M->F", vertexM, vertexF, 4);
        Edge edge31 = new Edge("G->F", vertexG, vertexF, 5);
        Edge edge32 = new Edge("G->H", vertexG, vertexH, 2);
        Edge edge33 = new Edge("D->I", vertexD, vertexI, 6);

        vertexes.add(vertexA);
        vertexes.add(vertexB);
        vertexes.add(vertexC);
        vertexes.add(vertexD);
        vertexes.add(vertexE);
        vertexes.add(vertexF);
        vertexes.add(vertexG);
        vertexes.add(vertexH);
        vertexes.add(vertexI);
        vertexes.add(vertexJ);
        vertexes.add(vertexK);
        vertexes.add(vertexL);
        vertexes.add(vertexM);
        vertexes.add(vertexN);
        vertexes.add(vertexO);
        vertexes.add(vertexP);
        vertexes.add(vertexQ);
        vertexes.add(vertexR);
        vertexes.add(vertexS);
        vertexes.add(vertexT);
        vertexes.add(vertexU);

        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        edges.add(edge5);
        edges.add(edge6);
        edges.add(edge7);
        edges.add(edge8);
        edges.add(edge9);
        edges.add(edge10);
        edges.add(edge11);
        edges.add(edge12);
        edges.add(edge13);
        edges.add(edge14);
        edges.add(edge15);
        edges.add(edge16);
        edges.add(edge17);
        edges.add(edge18);
        edges.add(edge19);
        edges.add(edge20);
        edges.add(edge21);
        edges.add(edge22);
        edges.add(edge23);
        edges.add(edge24);
        edges.add(edge25);
        edges.add(edge26);
        edges.add(edge27);
        edges.add(edge28);
        edges.add(edge29);
        edges.add(edge30);
        edges.add(edge31);
        edges.add(edge32);
        edges.add(edge33);

        Graph graph = new Graph(vertexes, edges);

        ShortestPathBFS test = new ShortestPathBFS(graph,4,vertexU, vertexT);
        test.execute();

    }
}
