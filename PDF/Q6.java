public static ArrayList<Integrs> updateInventory(ArrayList<Integer> books,int[] newBooks){
    for(int i:newBooks){
        if(!books.contains(i)){
            books.add(i);
        }
    }
    return books;
}