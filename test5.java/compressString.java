import java.util.Scanner;
public class Main{
    public static String compressString(String str){
        String result="";
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            int count=0;

            while(i<str.length && str.charAt(i)==ch){
                count++;
                i++;
            }
             result += ch;

            if (count > 1) {
                result += count;
            }
        }

        return result;
        }
    }
