package SkillsPw.StringJava;

import java.util.Scanner;

public class Isomorphicornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence 1 : ");
        String s1 = new String(sc.nextLine());
        System.out.println();
        System.out.print("Enter sentence 2 : ");
        String s2 = new String(sc.nextLine());
        char[] ch1 = s1.toString().toLowerCase().toCharArray();
        char[] ch2 = s2.toString().toLowerCase().toCharArray();
        char[] ch3 = new char[128];
        int l1 = ch1.length;
        int l2 = ch2.length;
        boolean flag = true;
        for(int i = 0;i<l1;i++)
        {
            int idx = (int)ch1[i];
            if (ch3[idx] == 0) {
                ch3[idx] = ch2[i];
            }
            else{
                if (ch3[idx] != ch2[i]) {
                    flag = false;
                }
            }
        }
        for(int i = 0;i<128;i++)
        {
            ch3[i] = 0;
        }
        for(int j = 0;j<l2;j++)
        {
            int idx = (int)ch2[j];
            if (ch3[idx] == 0) {
                ch3[idx] = ch1[j];
            }
            else{
                if (ch3[idx] != ch1[j]) {
                    flag = false;
                }
            }
        }
        if (flag == true) {
            System.out.println("It is an Isomorphic");
        }
        else
        {
            System.out.println("It is not an Isomorphic");
        }
    }
}
