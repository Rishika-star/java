public class Account{
    int accNo;
    String Name;
    float Balance;
    public void setaccNo(int accNo){
        this.accNo=accNo;

    }

    public void setName(String Name){
        this.Name=Name;

    }
    public void setBalance(float Balance){
        this.Balance=Balance;

    }

    public int getaccNo(int accNo){
        return accNo;

    }

    public String getName(String Name){
        return Name;

    }
    public float getBalance(float Balance){
        return Balance;

    }

    public int withdrawAmount(float amount){
        this.Balance=this.Balance+amount;
        return Balance;
    }
}