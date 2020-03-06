public class Palindrome {

    public static boolean isPalindrome(String str){

        String reversed="";
        String lowerStr=str.toLowerCase();
        for(int i=str.length()-1; i>=0; i--){
            reversed+= lowerStr.charAt(i);
        }
        if(lowerStr.equals(reversed)){
            System.out.println("the string is palindrome");
            return true;
        }else {return false;}
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Jacaj"));
    }
}
