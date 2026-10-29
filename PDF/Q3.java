public static ArrayList<Integer> findOverloadedServers(ArrayList<Integer>ncpuUsage){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<cpuUsage.size();i++){
        if(cpuUsage.get(i)>=80){
            list.add(cpuUsage.get(i));
        }
    }
    return list;
}