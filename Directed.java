import java.io.*;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javafx.animation.Timeline;

/**
 * This class represents a directed graph using adjacency list  
 *  */ 
 
public class Directed extends Thread 
{
    private int V;                     // The edge from which edge is started
    private LinkedList<Integer> adj[]; // Adjacency Lists
    private GInfo g = new GInfo();     // // The additional class which provides all the details connecting with program such as sizes of elements

    /**
     *  Constructor
     */
    Directed(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    /**
     *  Function to add an edge into the graph
     */ 
    void addEdge(int v, int w) {

        adj[v].add(w);
    }


    /**
     *  Prints Breadth First traversal
     * @param s given source
     * @param b ball which are used for the Breadth First traversal
     * @param arena is used to setup menu on this arena
     */
    
    void BreadthFirst(int s, Ball[] b, GameArena arena) {

        /**
         *  Mark all the vertices as not done
        */
        
        
        boolean done[] = new boolean[V];
        int j =0;
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();


        /**
         * Mark the current node as done and enqueue it
         */
         
        done[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();           
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();


            /**
             * Sleep program to color the next ball
             */
            try 
            {
                Thread.sleep(1000);
                b[s].setColour("#FFD700");
                arena.update();
                
            }

                catch (InterruptedException e) 
                {
            e.printStackTrace();
            }  
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!done[n]) 
                { 
                    done[n] = true; 
                    queue.add(n); 
                   
                }
            }
           
        }
        
    }


    /**
     * Function to connect two balls using arrows in GameArena. It is used when directed links are needed.
     * @param a the ball from which arrow is being made
     * @param b the ball to which arrow is being made
     * @param arena is used to setup menu on this arena
     */
    public void directedLink(Ball a, Ball b, GameArena arena)
    {
        Arrow arrow = new Arrow (a.getXPosition(), a.getYPosition(), b.getXPosition(), b.getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
    }

    /**
     * Function to connect two balls using arrows in GameArena. It is used for custom graph.
     * @param x index of first ball
     * @param y index of second ball 
     * @param arena is used to setup menu on this arena
     * @param ball array of ball for setting up custom direct
     */
    public void customDirect(int x, int y, GameArena arena, Ball [] ball)
    {
        Arrow arrow = new Arrow (ball[x].getXPosition(), ball[x].getYPosition(), ball[y].getXPosition(), ball[y].getYPosition(), g.getWidthLine(), g.getTextColor(), arena);
    }
}