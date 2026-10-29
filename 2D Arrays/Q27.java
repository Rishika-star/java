//MATRIX EQUALITY
static void processMatrix(int[][] a,int[][] b,int m,int n){
    boolean equal=true;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(a[i][j]!=b[i][j]){
                equal=false;
            }
        }
    }

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(equal){
                System.out.println((a[i][j]+b[i][j])+" ");
            }
            else{
                System.out.println((a[i][j]-b[i][j])+" ");
            }
        }
        System.out.println();
    }
}