class University{
    private String universityName="Chitkara";
    public String getuniversityName(){
        return universityName;
    }

}

class Department extends University{
    String departmentName;

    public Department(String departmentName){
        this.departmentName=departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }


}
class Section extends Department{
    String sectionName;

    public String Section(String departmentName,String sectionName){
        this.departmentName=departmentName;
        this.sectionName=sectionName;
    }

    public String getSectionName(){
        return sectionName;
    }
}

class Student extends Section{
    String studentName;
    int age;
    int fees;
    static int totalFees=0;

    public String Student(String studentName,int age,int fees){
        super(sectionName);
        this.studentName=studentName;
        this.age=age;
        this.departmentName=departmentName;
        this.fees=fees;
        totalFees+=fees;

        public String getName(){
            return studentName;
        }
        public int getAge(){
            return age;
        }
    
        public int getFees(){
            return fees;
        }
    }

    public static int getTotalfees(){
        return totalFees;
    }
}