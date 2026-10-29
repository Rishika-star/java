//STRING REVERSING
class Result{
    static String translate(String letter){
        String[] words=letter.split(" ");
        String result="";
        for(int i=words.length-1;i>=0;i--){
              result+=words[i];
              if(i>0){
            result+=" ";
        }
        
        }
        return result;
    }
}