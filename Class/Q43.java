class Student{
    private int studentid;
    private String name;
    private int[] marks=new int[5];
    public Student(int studentid,String name,int[] marks){
        this.studentid=studentid;
        this.name=name;
        for(int i=0;i<5;i++){
            this.marks[i]=marks[i];
        }
    }

    public void printValues(){
        System.out.println(studentid);
        System.out.println()
    }
}