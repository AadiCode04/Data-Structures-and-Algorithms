package String;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are immutable;

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        //length find
        String fullName = "Tony Stark";
        System.out.println(fullName.length());

        //concatenation
        String firstName = "aadi" ;
        String lastName = "tya";
        String fullname = firstName + lastName;
        System.out.println(fullname);
    }

}

