public static ArrayList<Integer> updateMembers(ArrayList<Integer> members,int[] graduated,int[] newMembers){
    for(int i=0;i<graduated.length;i++){
        members.remove(Integer.valueOf(graduate[i]));

    }
    for(int i=0;i<newMembers.length;i++){
        if(!members.contains(newMmbers[i])){
            members.add(newMembers[i]);
        }

    }
    return members;
}