import java.util.Scanner;
class Employee1{
    int id;
    String name;
    int[] salary=new int[6];

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
            System.out.print(salary[i]);
            if(i<5){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Total Slary: "+ calTotalSalary());
        System.out.println("Received Maximum Salary in Month: " +maxSalary());
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
        for(int i=1;i<6;i++){
            if(salary[i]>max){
                max=salary[i];
            }
        }
        return max;
    }
}