public static ArrayList<Integer> updateMembers(ArrayList<Integer> members,int[] expired,int[] newMembers){
    for(int i:expired){
        if(members.contains(i)){
            members.remove(Integer.remove)
        }
    }
    for(int i:newMembers){
        if(~!members.contains(i)){
            members.add(i);
        }
    }
    return members;
}