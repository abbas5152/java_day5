//Q4) Write a Java program to get the character at the given index within the String.Take the input
//        with the help of Scanner class
//
//Sample Output:
//        Enter the String:
//        “Java Exercises”
//        Enter the character position you want to access:
//        2
//        Character at position 2 is :
//        v


import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the string");

        String s1=new String(sc1.nextLine());
        System.out.println("Enter the character position you want to access");
        int i=sc1.nextInt();
        char ch=s1.charAt(i);
        System.out.println("Character at position " +i + " is");
        System.out.println(ch);

    }
}
