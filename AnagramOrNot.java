package SkillsPw.StringJava;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence 1 : ");
        StringBuilder s1 = new StringBuilder(sc.nextLine());
        System.out.println();
        System.out.print("Enter sentence 2 : ");
        StringBuilder s2 = new StringBuilder(sc.nextLine());
        char[] ch1 = s1.toString().toLowerCase().toCharArray();
        char[] ch2 = s2.toString().toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int c = 0;
        if (ch1.length == ch2.length) {
        for(int i = 0;i<ch1.length;i++)
           {
             if (ch1[i] == ch2[i]) {
                c++;
                if (c == (ch1.length)) {
                    System.out.println("It is an Anagram");
                    break;
                }
                }
                else
                {
                    System.out.println("It is not an anagram");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Enter two sentence with same number of words");
        }
    }
}
