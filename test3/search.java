/*search element diya hai. Humein check karna hai ki woh element array mein kitni baar aata hai, aur uski frequency print karni hai. */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}