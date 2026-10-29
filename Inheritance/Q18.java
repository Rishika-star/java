class BankAccount{
    private int number;
    private int balance;
    public bankAccount(int number,int balance){
        this.number=number;
        this.balance=balance;

    }

    public void deposit(int amt){
        balance+=amt;
    }

    public void withdraw(amt){
         balance-=amt;
    }
    public int getBalance(){
        return balance;
    }
}

class MinMaxAccount extends BankAccount{
    private int minBalance;
    private int maxBalance;

    public MinMaxAccount(int number,int balance){
        super(number,balance);
        minBalance=balance;
        maxBalance=balance;
    
    }
  public void deposit(int amt){
    super.deposit(amt);
    int balance=getBalance;
    if(balance<minBalance){
        minBalance=balance;
    }
    if(balance>maxBalance){
        maxBalance=balance;
    }
  }

  public void withdraw(int amt){
    super.withdraw(amt);
    int balance=getBalance();
    if(balance<minBalance){
        minBalance=balance;
    }
    if(balance>maxBalance){
        maxBalance=balance;
    }
  }
public int getMin(){
    return minBalance;
}

public int getMax(){
    return maxBalance;
}
}