public class AdjacencyList {
    public static void main(String[] args) {
        //Adjacency List - An array/arraylist of linkedlists
        //               - Each LinkedList has a unique node at the head
        //               - All adjacent neighbors to that node are added to that node's linkedlist
        //               - runtime complexity to check an Edge = 0(V)
        //               - space complexity = 0(V + E)

        AdjacencyListGraph graph = new AdjacencyListGraph();

        graph.addNode(new AdjacencyListNode('A'));
        graph.addNode(new AdjacencyListNode('B'));
        graph.addNode(new AdjacencyListNode('C'));
        graph.addNode(new AdjacencyListNode('D'));
        graph.addNode(new AdjacencyListNode('E'));

        graph.addEdge(0, 1); //(A, B)
        graph.addEdge(1, 2); //(B, C)
        graph.addEdge(1, 4); //(B, E)
        graph.addEdge(2, 3); //(C, D)
        graph.addEdge(2, 4); //(C, E)
        graph.addEdge(4, 0); //(E, A)
        graph.addEdge(4, 2); //(E, C)

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(3, 2));
    }
}
