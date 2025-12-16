package String.Assignment;

import java.util.Scanner;

public class VowelCount {
    
    public static int CountVowel(String str){

        int count = 0 ;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            
        }
        return count ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(CountVowel(str));
    }
}
