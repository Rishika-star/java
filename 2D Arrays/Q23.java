//FIND MAX ELEMENT
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int max=a[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}