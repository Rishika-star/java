//COULMN SUM
static int coulmnSum(int[][] matrix,int rows,int k){
    int sum=0;
    for(int i=0;i<rows;i++){//only rows ki loop chlegi
        sum+=matrix[i][k];
    }
    return sum;
}