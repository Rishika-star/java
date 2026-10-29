public static LinkedList<Integer> findIncreasingPrices(LinkedList<Integer> prices){
    LinkedList<Integer> res=new LinkedList<>();
    for(int i=1;i<prices.size();i++){
        if(prices.get(i)>prices.get(i-1)){
            res.add(prices.get(i));
        }
    }
}
/*
1.Compare eCH PRICE WITH PRICE IMMEDIATELY BEFORE IT.
2. If current price is greater than the previous price add it to the result.*/