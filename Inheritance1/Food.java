class Food1{  
void eat(){System.out.println("eating...");}  
}  
class Pizza extends Food{  
void p1(){System.out.println("Cheese");}  
}  
class Burger extends Food{  
void p2(){System.out.println("Tikki");}  
}  
public class Food{  
public static void main(String args[]){  
Pizza p=new Pizza();  
p.p1();  

//c.bark();//C.T.Error  
}}