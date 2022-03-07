package stack.Solution;

import java.util.LinkedList;
import java.util.Queue;


class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     *
     * @param url       String that represents an URL that the user has visited
     * @param numVisits An int that represents the number of times that the user has
     *                  visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     *
     * @return An int that represents the number of times that the user has visited
     * the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     *
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     *
     * @param an int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class SolutionB {
    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();


    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        // WRITE CODE HERE
        for(int i=0 ; i < n ; i ++){
        sites.remove();
        }
    }
    static void FrontToLast(Queue<Integer> q,
                            int qsize)
    {
        // Base condition
        if (qsize <= 0)
            return;

        // pop front element and push
        // this last in a queue
        q.add(q.peek());
        q.remove();

        // Recursive call for pushing element
        FrontToLast(q, qsize - 1);
    }

    static void pushInQueue(Queue<Integer> q,
                            int temp, int qsize)
    {

        // Base condition
        if (q.isEmpty() || qsize == 0)
        {
            q.add(temp);
            return;
        }

        // If current element is less than
        // the element at the front
        else if (temp <= q.peek())
        {

            // Call stack with front of queue
            q.add(temp);

            // Recursive call for inserting a front
            // element of the queue to the last
            FrontToLast(q, qsize);
        }
        else
        {

            // Push front element into
            // last in a queue
            q.add(q.peek());
            q.remove();

            // Recursive call for pushing
            // element in a queue
            pushInQueue(q, temp, qsize - 1);
        }
    }
    // Method to sort the queue
    static void sort(Queue<Integer> q) {
        // Return if queue is empty
        if (q.isEmpty())
            return;

        // Get the front element which will
        // be stored in this variable
        // throughout the recursion stack
        int temp = q.peek();

        // Remove the front element
        q.remove();

        // Recursive call
        sort(q);

        // Push the current element into the queue
        // according to the sorting order
        pushInQueue(q, temp, q.size());
    }

    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        // WRITE CODE HERE
    }

    public static void main(String[] args) {
        String[] visitedSites = {"www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com"};

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);

    }

}