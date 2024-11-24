package SkillsPw.StringJava;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int l = s.length();
        int i = 0;
        int v = 0;
        int c = 0;
        int sp = 0;
        while (i < l) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U' ) {
                v++;
            } else {
                c++;
            }
            if (s.charAt(i) == (char)32) {
                sp++;
            }
            i++;
        }
        System.out.print("The number of vowels is : " + v);
        System.out.println();
        System.out.print("The number of consonants is : " + (c-sp));
    }
}
