import java.util.*;

public class ShortestPath{
    int dist[];
    int v;
    public ShortestPath(int v){
        this.v = v;
        dist = new int[v + 1];
    }
    public void Find_shortest_path(int source, int adjacency_matrix[][]){
        for (int i=1;i<=v;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[source] = 0;
        for (int i=1;i<=v-1;i++){
            for (int s=1;s<=v;s++){
                for (int d=1;d<=v;d++){
                    if (adjacency_matrix[s][d]!=Integer.MAX_VALUE){
                        if (dist[d] > dist[s] + adjacency_matrix[s][d])
                            dist[d] = dist[s] + adjacency_matrix[s][d];
                    }
                }
            }
        }
        for (int s=1;s<=v;s++){
            for (int d = 1; d <= v; d++){
                if (adjacency_matrix[s][d]!=Integer.MAX_VALUE){
                    if (dist[d]>dist[s]+adjacency_matrix[s][d])
                        System.out.println("The Graph contains negative edge cycle");
                }
            }
        }
        for (int i=1;i<=v;i++){
            System.out.println("distance of source  " + source + " to "+ i + " is " + dist[i]);
        }
    }
    public static void main(String... arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int v=sc.nextInt();
        sc.nextLine();
        int adjacency_matrix[][] = new int[v + 1][v + 1];
        for (int s=1;s<=v;s++){
            for (int d=1;d<=v;d++){
                System.out.println("Enter weight of edge from vertex "+ s +" to vertex "+ d );
                adjacency_matrix[s][d] = sc.nextInt();
                if (s==d){
                    adjacency_matrix[s][d] = 0;
                    continue;
                }
                else if (adjacency_matrix[s][d]==0){
                    adjacency_matrix[s][d] = Integer.MAX_VALUE;
                }
            }
        }
        System.out.println("Enter the source vertex");
        int source = sc.nextInt();
        ShortestPath ans = new ShortestPath(v);
        ans.Find_shortest_path(source, adjacency_matrix);
    }
}