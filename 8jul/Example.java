import java.util.Scanner;
public class Example{
    public int a[];
    public int sum=0;
    public float avg;

    public void getData(){
        a= new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=in.nextInt();
        }
    }

        public void findSumAvg(){
            for(int i=0;i<5;i++){
                sum+=a[i];
            }
            avg=sum/5;

        }

        public void displayData(){
            for(int i=0;i<5;i++){
                System.out.println(i+" "+a[i]);
            }
            System.out.println("sum= "+sum);
            System.out.println("avg= "+avg);
        }

        public static void main(String arg[]){
            Example obj=new Example();
            obj.getData();
            obj.findSumAvg();
            obj.displayData();
        }
    }
