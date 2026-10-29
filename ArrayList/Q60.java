public static ArrayList<Integer> updateRecords(ArrayList<Integer> patients,int[] newPatients){
    for(int i:newPatients){
        if(!Patients.contains(i)){
            patients.add(i);
        }
    }
    return patients;
}
//patient empty h
//newPateints pehle se created h