import java.util.*;

public class AdjacencyListGraph {
    ArrayList<LinkedList<AdjacencyListNode>> alist;
    
    AdjacencyListGraph(){
        alist= new ArrayList<>();
    }

    public void addNode(AdjacencyListNode node){
        LinkedList<AdjacencyListNode> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<AdjacencyListNode> currentList = alist.get(src);
        AdjacencyListNode dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
        //or  alist.get(src).add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<AdjacencyListNode> currentList = alist.get(src);
        AdjacencyListNode dstNode = alist.get(dst).get(0);
        for(AdjacencyListNode node : currentList){
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<AdjacencyListNode> currentList : alist){
            for(AdjacencyListNode node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}