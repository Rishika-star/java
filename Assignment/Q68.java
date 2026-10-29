class Result{
    static int largESubarray(int ar[],int n){
        int max=Integer.MIN_VALUE;//max=-1
        for(int i=0;i<n;i++){
            int sum=0;//Har naye starting index ke liye sum dobara 0 se shuru hoga.
            for(int j=i;j<n;j++){
                  sum+=ar[j];
                  if(sum==0){
                    max=Maths.max(max,j-i+1);
                  }
            }

        }
        return max;
    }
}