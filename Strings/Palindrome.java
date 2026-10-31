public class Palindrome{
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str="racecar";
        boolean ans=isPalindrome(str);//IMPORTANT RETURN TYPE DEKHO
        if(!ans){
            System.out.println("NOT A PALINDROME");
        }
        else{
             System.out.println("PALINDROME");
        }
    }
}