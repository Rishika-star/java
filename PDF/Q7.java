public static ArrayList<Integer> updateWaitingList(ArrayList<Integer> waitingList,int[] cancelled,int[] Passengers){
    for(int i:cancelled){
        waitingList.remove(Integer.valueOf(i));
    }

    for(int i:newPassengers){
        if(!waitingList.contains(i)){
            waitingList.add(i);
        }
    }
    return waitingList;
}