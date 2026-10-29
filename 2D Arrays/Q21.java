//FIND SUM OF MAIN DIAGNOL OF MATRIX
public static int mainDiagnolSum(int[][] matrix,int m){
    int sum=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            if(i==j){
                sum+=matrix[i][j];
            }
        }
    }
    return sum;
}