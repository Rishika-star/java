import java.util.Scanner;
class main{
    boolean isStrongVirus(String dna){
        int x=dna.indexOf('x');
        int y=dna.indexOf('y');

        if(x==-1 || y==-1){
            return false;
        }
        return Math.abs(x-y)==4;
    }
}