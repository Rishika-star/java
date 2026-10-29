public static ArrayList<Integer> updateBookings(ArrayList<Integer> bookings,int[] cancelled,,int[] newBookings){
    for(int i:cancelled){
        if(bookings.contains(i)){
            bookings.remove(Integer.valueOf(i));

        }
    }
    for(int i:newBookings){
        if(!bookings.contains(i)){
            bookings.add(i);
        }
    }
    return bookings;
}
