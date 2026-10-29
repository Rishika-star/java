import java.util.Scanner;
class Date{

int month;
int date;
public Date(){
    this.month=month;
    this.date=date;
}

public Date(int m,int d){
    this.month=m;
    this.date=d;
}

public int getMonth(){
    return month;
}

public int getDay(){
    return date;
}

public int daysInMonth(){
    if(month==2){
        return 28;
    }

    if(month=4||month=6||month==9||month==11){
        return 30;
    }
    return 31;
}

public void nextDay(){
    if(date<daysInMonth()){
        date++;
    }
    else{
        date=1;//when month k last date pe aagye to next date 1

        if(month==12){
            month=1;
        }
        else{
            month++
        }
    }
}
}