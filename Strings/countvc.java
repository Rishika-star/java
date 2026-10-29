class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextInt();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            if(ch=='a'||ch=='e'||ch==ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println(Vowels+" "+consonants)
    }
}