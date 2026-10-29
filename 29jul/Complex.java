public class Complex{
    double real;
    double imag;

    public Complex(){
        this.real=0.0;
        this.imag=0.0;
    }
    public Complex(double real,double imag){
      this.real=real;
      this.imag=imag; 
    } 
    public Complex add(Complex c1){
        Complex res=new Complex();
        res.real=this.real+c1.real;
        res.imag=this.imag+c1.imag;
        return res;

    }
     public Complex multiply(Complex c1){
        
        Complex res=new Complex();
        res.real=this.real*c1.real;
        res.imag=this.imag*c1.imag;
        return res;

    }

    public static void main(String[] args){
        Complex n1=new Complex(6.5,7.5);
        Complex n2=new Complex(7.5,8.5);
        Complex r1=new Complex();
        r1=n1.add(n2);
        r1=n1.multiply(n2);

        System.out.println("Result: "+r1.real+" + "+r1.imag+"i");
    }
}
