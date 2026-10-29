class CustomException extends Exception{
private String msg;
public CustomException(String msg){
    super(msg);//custom error msg
    this.msg=msg;
}

}
class Main{
    static int power(int num,int exp) throws CustomException{
        if(num<0|| exp<0 ){
            throw new CustomException("Negative numbers not allowed");
        }
        if(num==0 || exp==0){
            throw new CustomException("Both can never be zero")''
        }

        int result=1;
        for(int i=1;i<=exp;i++){
            result*=num;
        }
        return result;
    }
}