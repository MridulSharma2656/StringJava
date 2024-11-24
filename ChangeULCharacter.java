package SkillsPw.StringJava;
import java.util.Scanner;
public class ChangeULCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s  = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int l = sb.length();
        int i =0;
        while (i<l) {
            int n = (int)sb.charAt(i);
            if (n<97 && n>=65) {
                int u = n + 32;
                char c = (char)u;
                System.out.print(c + " ");
            }
             else if (n>=97 && n<=120) {
                int lo = n - 32;
                char ch = (char)lo;
                System.out.print(ch + " ");
            }
            i++;
        }
    }
}
