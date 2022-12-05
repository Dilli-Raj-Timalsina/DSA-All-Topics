package Graph;

public class DisjointSet {
    int []parent=new int[1000];
    int []rank=new int[1000];

    //constructor
    DisjointSet(int n)
    {
        for (int i = 0; i < n; i++) {
            parent[i]=i;
            rank[i]=0;
        }
    }

    //find the parent of given node
    public int findParent(int node)
    {
        if(node==parent[node])
        {
            return node;
        }
        return parent[node]= findParent(parent[node]);
    }
    //Union two given sets u,v
    public void union(int u,int v)
    {
        u=findParent(u);
        v=findParent(v);
        if(rank[u]<rank[v])
        {
            parent[u]=v;
        }
        else if(rank[v]<rank[u])
        {
            parent[v]=u;
        }
        else{
            parent[u]=v;
           rank[v]++;
        }
    }

}
