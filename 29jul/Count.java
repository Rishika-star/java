public class Count{
    static int c=0;
    public Count(){
        c++;
    }

    public static void main(String[] args){
        Count c=new Count();
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();
        Count c4=new Count();
        System.out.println(Count.c);
    }
}