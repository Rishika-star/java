import java.util.Scanner;
public static int[][] multiply(int[][] A,int[][] B,int R1,int R2,int C1,INT C2 ){
 
 int[][] result=new int[R1][C2];
 for(int i=0;i<R1;i++){
    for(int j=0;j<C2;j++){
        for(int k=0;k<C2;k++){
            result[i][j]+=A[i][j]*B[i][j];
        }
    }
 }
 return result;
}