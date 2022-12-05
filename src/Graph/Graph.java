package Graph;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public static void main(String[] args) {

//        int [][] graph={{4,1},{0,2},{1,3},{2,4},{3,0}};
        Graph graph1=new Graph();
//        System.out.println( graph1.isBipartite(graph));
    }
    public ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList,int n)
    {
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[n+1];
        int count=0;

        for (int i = 1; i <=n; i++) {
            if(vis[i]==false)
            {
                Queue<Integer> que=new LinkedList<>();
                que.add(i);
                vis[i]=true;
                while(!que.isEmpty())
                {
                   int node=que.poll();
                   bfs.add(node);
                    for (int it:adjList.get(node)) {
                    if((vis[it])==false)
                        {
                         vis[it]=true;
                         que.add(it);
                        }
                    }
                }
                count++;
            }
        }
        return bfs;
    }
    public int discontiGraph(ArrayList<ArrayList<Integer>> adjList,int n)
    {
        boolean[] vis=new boolean[n+1];
        int count=0;
        for (int i = 1; i <=n; i++) {
            if(vis[i]==false)
            {
                Queue<Integer> que=new LinkedList<>();
                que.add(i);
                vis[i]=true;
                while(!que.isEmpty())
                {
                    int node=que.poll();
                    for (int it:adjList.get(node)) {
                        if((vis[it])==false)
                        {
                            vis[it]=true;
                            que.add(it);
                        }
                    }
                }
                count++;
            }
        } 
        return count;
    }

    //dfs traversal
    public void dfsOfGraph(ArrayList<ArrayList<Integer>> adj,int N)
    {
       boolean vis[]=new boolean[N+1];
        for (int i = 1; i <=N; i++) {
            if(vis[i]==false)
            {
                dfs(i,vis,adj);
            }
        }
    }
    private void dfs(int node,boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        System.out.println(node);
        vis[node]=true;
        for (Integer it:adj.get(node)){
            if(vis[it]==false)
            dfs(node,vis,adj);
        }
    }
    //////////////////////////////////
    public boolean findBipartiteBfs(ArrayList<ArrayList<Integer>> adj,int N)
    {
        int[] vis=new int[N+1];
        Arrays.fill(vis,-1);
        for (int i = 1; i <=N ; i++) {
            if(vis[i]==-1)
            {
              Queue<Integer> que=new LinkedList<>();
              que.add(i);
              vis[i]=0;
              while(!que.isEmpty()){
                  int node= que.poll();
              for (int it: adj.get(node)){
                  if(vis[it]==-1)
                  {
                      vis[it]=1-node;
                      que.add(it);
                  }
                  else if(vis[it]==node){
                     return false;
                  }
              }}
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int[] vis=new int[graph.length];
        Arrays.fill(vis,-1);
        for (int i = 0; i <vis.length ; i++) {
            if(vis[i]==-1)
            {
                Queue<Integer> que=new LinkedList<>();
                que.add(i);
                vis[i]=0;
                while(!que.isEmpty()){
                    int node= que.poll();
                    for (int it: graph[node]){
                        if(vis[it]==-1)
                        {
                            vis[it]=1-vis[node];
                            que.add(it);
                        }
                        else if(vis[it]==vis[node]){
                            return false;
                        }
                    }
                }
            }}
        return true;
    }
  public ArrayList<Integer> topoSort(int [][]adj,int N)
  {
    ArrayList<Integer> ans=new ArrayList<>();
    int[] vrtices=new int[N];
      for (int i = 0; i < N; i++) {
          vrtices[i]=adj[i].length;
      }
      Queue<Integer> que=new LinkedList<>();
      for (int i = 0; i < N; i++) {
         if(vrtices[i]==0) que.add(i);
      }
       while (!que.isEmpty())
       {
         int curr=que.poll();
         ans.add(curr);
           for (int el:adj[curr]) {
               vrtices[el]--;
                if(vrtices[el]==0){
                   que.add(el);
                } 
           }
       }
       return ans;
  }
}
