public class Countpaths {
    public static int Matrixpath(int i,int j,int n, int m) {
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        //move to down
        int downpaths=Matrixpath(i+1,j,n,m);

        //move to right
        int rightpaths=Matrixpath(i,j+1,n,m);

        return downpaths+rightpaths;
        
    }
    public static void main(String args[]) {
        int n=4,m=4;
        int total=Matrixpath(0,0,n,m);

        System.out.println(total);
        
    }
    
}
