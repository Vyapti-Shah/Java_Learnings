public class AdjacencyMatrix {
    public static void main(String[] args) {
        //Adjacency Matrix - A 2D array to store 1's/0's to represent edges
        //                 - number of rows = number of unique nodes
        //                 - number of columns = number of unique nodes(vertices)
        //                 - runtime complexity to check an edge = 0(1)
        //                 - space complexity = 0(v^2)

        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
        graph.addNode(new AdjacencyMatrixNode('A'));
        graph.addNode(new AdjacencyMatrixNode('B'));
        graph.addNode(new AdjacencyMatrixNode('C'));
        graph.addNode(new AdjacencyMatrixNode('D'));
        graph.addNode(new AdjacencyMatrixNode('E'));

        graph.addEdge(0, 1); //(A, B)
        graph.addEdge(1, 2); //(B, C)
        graph.addEdge(2, 3); //(C, D)
        graph.addEdge(2, 4); //(C, E)
        graph.addEdge(4, 0); //(E, A)
        graph.addEdge(4, 2); //(E, C)

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(3, 2));

    }
}
