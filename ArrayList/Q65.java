public static ArrayList<Integer> updateMembers(ArrayList<Integer> numbers){
    ArrayList<Integer> s=new ArrayList<>();
    for(int i:numbers){
        if(i!=0){
            s.add(i);
        }
    }

    for(int i:numbers){
        if(i==0){
            s.add(i);
        }
    }
    return s;
}