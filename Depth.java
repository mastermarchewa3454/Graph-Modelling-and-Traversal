import java.io.*; 
import java.util.*; 
/**
 * This class represents a directed graph using adjacency list 
*/ 
public class Depth 
{ 
    private int x;   // No. of vertices 
    private LinkedList<Integer> adj[]; // Array  of lists for Adjacency List Representation 


    /**
     * Constructor 
     */
    public Depth(int x) 
    { 
        x = x; 
        adj = new LinkedList[x]; 
        for (int i=0; i<x; ++i) 
            adj[i] = new LinkedList(); 
    } 


    /**
     * Function to add an edge into the graph
     * @param x is parameter used for putting a number of first ball
     * @param y is parameter used for putting a number of second ball
     * 
     */
    void addEdge(int x, int y) 
    { 
        adj[x].add(y);
    } 
  
    
    /**
     * This function first mark current node and print it
     * Then recuring for all the vertices adjacent to vertex
     * @param x the index of elements which are shown on the screen in array
     * @param done decide if element was done or not
     * @param arena is used to setup menu on this arena
     * @param b array of ball for which DepthTraversal is being executed
     */ 
    void Execute(int x,boolean done[], GameArena arena, Ball[] b) 
    { 
        done[x] = true; 
        System.out.print(x+" "); 
        Iterator<Integer> i = adj[x].listIterator();
        try 
            {
             /**
             * Sleep program to color the next ball
             */
                Thread.sleep(1000);
                b[x].setColour("#FFD700");
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
     * @param x number from whih depth first should start
     * @param arena is used to setup menu on this arena
     * @param b ball which are used for the Depth First traversal
     */
    void DepthFirst(int x, GameArena arena, Ball[] b ) 
    {  
        boolean done[] = new boolean[x]; 
        Execute(x, done, arena, b); 
    }
} 