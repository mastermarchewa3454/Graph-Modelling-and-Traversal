import java.io.*;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javafx.animation.Timeline;

// This class represents a directed graph using adjacency list 
// representation 
public class Directed extends Thread {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists
    private GInfo g = new GInfo();

    // Constructor
    Directed(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {

        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BreadthFirst(int s, Ball[] b, GameArena arena) {

        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];
        int j =0;
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();           
            System.out.print(s + " ");
            
            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> i = adj[s].listIterator();
            try 
            {
                Thread.sleep(1000);
                b[s].setColour("#FFD700");
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
                { 
                    visited[n] = true; 
                    queue.add(n); 
                   
                }
            }
           
        }
        
    }
    public void directedLink(Ball a, Ball b, GameArena arena)
    {
        Arrow arrow = new Arrow (a.getXPosition(), a.getYPosition(), b.getXPosition(), b.getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
    }
}