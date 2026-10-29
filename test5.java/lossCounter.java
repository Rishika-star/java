/*Is question mein humein loss days count karne hain, yani array mein kitne numbers 0 se strictly less hain. */
import java.util.Scanner;
class Solution{
    public static int count(int[] a,int T){
        int lossDays=0;
        for(int i=0;i<T;i++){
            if(a[i]<0){
                lossDays++;
            }
        }
        return lossDays;
    }
}