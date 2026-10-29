//BASE CLASS

public class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
    public static void main(String[] args){
    Fish shark=new Fish();
    shark.eat();
}
}

//DERIVED CLASS
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}