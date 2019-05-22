import java.io.*; 
import java.util.*; 
  
/**
 * This class represents a directed graph using adjacency list 
*/ 
public class Depth 
{ 
    private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; // Array  of lists for Adjacency List Representation 


    /**
     * Constructor 

     */
    public Depth(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 


    /**
     * Function to add an edge into the graph
     * @param v is parameter used for putting a number of first ball
     * @param w is parameter used for putting a number of second ball
     * 
     */
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);
    } 
  
    
    /**
     * This function first mark current node and print it
     * Then recuring for all the vertices adjacent to vertex
     * @param v the index of elements which are shown on the screen in array
     * @param done decide if element was done or not
     * @param arena is used to setup menu on this arena
     * @param b array of ball for which DepthTraversal is being executed
     */ 
    void Execute(int v,boolean done[], GameArena arena, Ball[] b) 
    { 
        done[v] = true; 
        System.out.print(v+" "); 
        Iterator<Integer> i = adj[v].listIterator();
        try 
            {
             /**
             * Sleep program to color the next ball
             */
                Thread.sleep(1000);
                b[v].setColour("#FFD700");
                arena.update();
            }

                catch (InterruptedException e) {
           
            e.printStackTrace();
            }
            
            
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!done[n]) 
                Execute(n, done, arena, b); 
        } 
    } 
    
    /**
     * The execute function of program
     * Marking all the vertices as default
     * Using recursivion, print DepthFirst
     * @param v number from whih depth first should start
     * @param arena is used to setup menu on this arena
     * @param b ball which are used for the Depth First traversal
     */
    void DepthFirst(int v, GameArena arena, Ball[] b ) 
    {  
        boolean done[] = new boolean[V]; 
        Execute(v, done, arena, b); 
    }
} 