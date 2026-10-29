import java.util.Scanner;
public class main{
    public static void count(int[] a,int T){
        int EVEN=0;
        int even=0;
        for(int i=0;i<T;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
          System.out.println(even + " " + odd);
    }
}