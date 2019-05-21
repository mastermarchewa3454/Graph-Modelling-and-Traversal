import java.io.*; 
import java.util.*; 
  
// This class represents a directed graph using adjacency list 
// representation 
public class Depth 
{ 
    private int V;   // No. of vertices 
  
    // Array  of lists for Adjacency List Representation 
    private LinkedList<Integer> adj[]; 
  
    // Constructor 
    Depth(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);  // Add w to v's list. 
    } 
  
    // A function used by DFS 
    void DFSUtil(int v,boolean visited[], GameArena arena, Ball[] b) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adj[v].listIterator();
        try 
            {
                Thread.sleep(1000);
                b[v].setColour("#FFD700");
                arena.update();
            }

                catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
            
            
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited, arena, b); 
        } 
    } 
  
    // The function to do DFS traversal. It uses recursive DFSUtil() 
    void DepthFirst(int v, GameArena arena, Ball[] b ) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited, arena, b); 
    }
} 