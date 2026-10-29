class UniversityEmployee{
    int id;
    String name;
    int salary;

    public UniversityEmployee( int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=school;

    }

    public void addSalary(double amount){
        salary+=amount;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
       return "Name: "+name+"\n"+"id: "+id+"\n"+"Salary: "+salary;
    }
}

class CollegeEmployee extends UniversityEmployee{
    String collegeName;
    public CollegeEmployee(int id,String name,double Salary,String collegeName){
        super(id,name,Salary);
        this.collegeName=collegeName;
    }

    public String getCollegeName(){
        return collegeName;
    }

    public String toString(){
        return super.toString()+"\n"+"College Name: "+collegeName;
    }
}

class Department extends CollegeEmployee{
    String DeptName;
    String HeadOfDept;
    static double tsalary=0;

    public Department(String DeptName,String HeadOfDept){
        this.DeptName=DeptName;
        this.HeadOfDept=HeadOfDept;
        tsalary+=Salary;
    }

    public static double calculateTotalSalaryOfDepartmentEmployee(){
            return tsalary;
        }

    public String toString(){
       return super.toString()+ "\n" + "Department: "+DeptName + "Department Head: "+ HeadOfDept;
    }
}