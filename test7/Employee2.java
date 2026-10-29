import java.util.Scanner;
class Employee2{
    public void getValues(int id,String name,int[] salary){
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
            System.out.println(salary[i]);
            if(i<5){
                System.out.println(" ");
            }
            System.out.println();
            System.out.println("Total Salary: "+calTotalSlary());
            System.out.println("Received Maximum in Salary in Month: " + maxSalary());

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
                int month=1;//change
                for(int i=0;i<6;i++){
                    if(salary[i]>max){
                        max=salary[i];
                        month=i+1;//change
                    }
                }
               return month;//change

            }
        }
