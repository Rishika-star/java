public static ArrayList<Integer> findOverheatingMachine(ArrayList<Integer>temparature){
ArrayList<Integer> s=new ArrayList<>();
for(int i:temparture){
    if(i>=90){
        s.add(i);
    }
}
return s;
}