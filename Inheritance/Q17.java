class Person{

    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

class Father extends Person{
    String job;
    public Father(String name,int age,String job){
        super(name,age);
        this.job=job;

    }
    public String getJob(){
        return job;
    }
}
class Child extends Father(){
    String school;
    int fees;
    static int tf=0;

    public Child(String father_name,int age,String job,String school,int fees){
        super(age,job);
        this.father_name=father_name;
        this.school=school;
        this.fees=fees;
        tf+=fees;

    }

    public String getSchool(){
        return school;
    }

    public int getFees(){
        return fees;
    }

    public static int getTotalfees(){
        return tf;
    }
}