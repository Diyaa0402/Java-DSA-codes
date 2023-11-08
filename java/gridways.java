public class gridways {
    public static int gridwaycount(int i, int j, int n, int m){
        //base case
        if(i==n-1 && j==m-1){    // cndn for last cell
            return 1;
        }else if(i==n || j==m){   //boundary cross conditn
            return 0;
        }
        
        //recursion
        int w1= gridwaycount(i, j+1, n, m);
        int w2= gridwaycount(i+1, j, n, m);
        return w1+w2;

    }
    public static void main(String args[]){
        int n=4, m=4;
        System.out.println(gridwaycount(0,0, n, m));

    }
    
}
