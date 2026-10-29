class Employee{
    private int e_id;
    private String name;
    private int[] salary=new int[6];
   public void getValues(int e_id,String name,int[] salary){
          Scanner sc=new Scanner(System.in);
          this.id=id;
          this.name=name;
          for(int i=0;i<6;i++){
            this.salary[i]=salary[i];
          }
   }

   public void printValues(){
    System.out.println(id);
    System.out.println(name);
    for(int i=0;i<6;i++){
        System.out.println(salary[i]+" ");
    }
    
   }

   public int calTotalSalary(){
    int total=0;
    for(int i=0;i<6;i++){
        total+=salary[i];
    }
    return total;
   }

public int maxSalary(){
    int max=salary[0];
    int month=1;
    for(int i=0;i<6;i++){
        if(salary[i]>max){
            max=salary[i];
            month++;
        }
    }
    return month;
}
    
}
