public class Str {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";
        System.out.println(a);
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        if (a.equalsIgnoreCase(b)){
            System.out.println("Both the strings are equal");
        }
        else{
            System.out.println("They are not equal");
        }

    }
}