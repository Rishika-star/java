import java.util.*;
public class Operations{
public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    
    //1.add()
    //TIME COMPLEXITY- O(n)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println(list);

    //2. Get element get()
    //TIME COMPLEXITY- O(n)
    int element=list.get(2);
    System.out.println(element);

    //3. Remove element remove()
    //TIME COMPLEXITY- O(n)
    list.remove(3);//index
    System.out.println(list);

    //4.Set element at index 
    //TIME COMPLEXITY- O(n)
    list.set(3,10);
    System.out.println(list);

    //5.Contains element - returns true or false
    //TIME COMPLEXITY- O(n)
    System.out.println(list.contains(2));

    //6.Adding value at an index
    //TIME COMPLEXITY- O(n)
    list.add(1,9);
    System.out.println(list);
}
}