import java.util.Scanner;
public class Example1{
    public int matrixA[][];
    public int matrixB[][];
    public int resultmatrix[][];
    public int rows=2;
    public int cols=2;
   
    public void getData(){
        matrixA= new int[rows][cols];
        matrixB= new int[rows][cols];
        resultmatrix= new int[rows][cols];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrixA[i][j]=in.nextInt();
            }
            
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrixB[i][j]=in.nextInt();
            }
        }
    }

        public void findSumMatrix(){
            for(int i=0;i<rows;i++){
                for(int j=0;i<cols;i++){
                resultmatrix[i][j]=matrixA[i][j]+matrixB[i][j];
                }
                
            }
            

        }

        public void displayData(){
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                  System.out.println(resultmatrix[i][j]);
                }
                
            }
            System.out.println();
           
        }

        public static void main(String arg[]){
            Example1 obj=new Example1();
            obj.getData();
            obj.findSumMatrix();
            obj.displayData();
        }
    }
