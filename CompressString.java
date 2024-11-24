package SkillsPw.StringJava;
import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int l = s.length();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (j<l) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            else
            {
                sb.append(s.charAt(i));
                if ((j-i)>1) {
                    sb.append(j-i);
                }
                i = j;
            }
        }
        sb.append(s.charAt(i));
                if ((j-i)>1) {
                    sb.append(j-i);
                }
       for(int k = 0;k<sb.length();k++)
       {
        System.out.print(sb.charAt(k));
       }
       System.out.println();
    }
}
