//ALONE IN COUPLE CLONE
//INPUT-  1 2 3 1 2 4 4
//OUTPUT-4
class Result{
    static int findAlone(int a[],int n){
        for(int i=0;i<n;i++){
            int count=0;
           for(int j=0;j<n;j++){
            if(a[i]==a[j]){
                count++;
            }
           }
           if(count==1){
            return a[i];
           }
        }
        return -1;
    }
}