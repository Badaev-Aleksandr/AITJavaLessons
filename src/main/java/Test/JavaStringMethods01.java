package Test;

public class JavaStringMethods01 {
    //Comparing String methods - equals, equalsIgnoreCase, s.compareTo(s1),s.compareToIgnoreCase, s.startsWith(), s.endsWith()
    public static void main(String[] args) {
    String s = "Welcome to Java";
    String t = "Welcome to Java";
    if (s.equals(t))System.out.println("YES");
    else System.out.println("NO");

        System.out.println(s.compareTo(t));
        System.out.println(s.startsWith("Welcom"));
        System.out.println(s.endsWith("Java"));
    }
}
