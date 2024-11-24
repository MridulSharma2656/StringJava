package SkillsPw.StringJava;

import java.util.Scanner;

public class PrintSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int l = s.length();
        int i = 0;
        while (i<l) {
            for(int j = (i+1);j<=l;j++) {
            System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
            i++;
        }
    }
}
