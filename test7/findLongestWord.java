import java.util.Scanner;
public class Main{
    public static String findLongestWord(String input ){

        String[] words=input.split(" ");
        String longest=words[0];

        for(int i=1;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
        return longest;
    }
}