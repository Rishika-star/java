public class PalindromeCheck{
    public static boolean isPalindrome(String str){
        //Convert to lowercase for uniform comparison
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;//mismatch found

            }
            left++;
            right--;
        }
        return true;//all characters matched
    }

    public static void main(String[] args){
        String input="Racecar";
        if(isPalindrome(input)){
            System.out.println(""+input+" is a palindrome");
        }
        else{
            System.out.println(""+input+" is not a palindrome.");
        }
    } 
}