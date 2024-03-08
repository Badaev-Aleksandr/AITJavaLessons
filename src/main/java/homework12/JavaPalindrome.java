package homework12;

public class JavaPalindrome {
    public static void main(String[] args) {
        String s = "123454321";

        System.out.println(isPalindrome(s) ? "YES" : "NO");


    }
    private static boolean isPalindrome(String s){
        if (s.length()==1 || s.length() == 0)
            return true;// base step
       if (s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));// recursive step

       return false;
    }
}
