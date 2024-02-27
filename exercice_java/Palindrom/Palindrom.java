public class Palindrom {
    static Boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        if (args.length==1){
            String s=args[0];
            //s=s.toLowerCase();
            if (isPalindrome(s)){
                System.out.println("Ce mot est un palindrome !");
            }else{
                System.out.println("Ce mot n'est pas un palindrome !");
            }
        }else{
            System.out.println("Veuillez saisir un mot !");
        }
    
        
    }
}
