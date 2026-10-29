import java.util.Scanner;
class Main{
static int maxMarks(int[] marks,int N){
    int max=marks[0];
    for(int i=1;i<N;i++){
        if(marks[i]>max){
            max=marks[i];
        }
    }
    return max;
}

}