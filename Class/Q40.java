class Date{
    private int month;
    private int date;
    Date(){
        this.month=1
        this.date=1;
    }

    Date(int m,int n){
        this.month=m;
        this.date=d;
    }

    public int daysInMonth(){
        if(month==2){
            return 28;
            
        }
        else if(month==4 || month=6||month==9||month=11){
            return 30;
        }
        else{
            return 31;
        }
       
       public int getMonth(){
        retun month;
       }

        public int getMonth(){
            return month;
        }

        void nextDay(){
            date++;
            if(date>daysInMonth){
                date=1;
                month++;
                if(month>12){
                    month=1;
                }
            }
        }
    }
}