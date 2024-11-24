package SkillsPw.StringJava;

import java.util.Scanner;

public class MostNoOfAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = new String(sc.nextLine());
        int[] arr = new int[26];
        int i =0;
        while (i<s.length()) {
            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            arr[idx]++;
            i++;
        }
        int maxfreq = -1;
        for(int j = 0;j<arr.length;j++)
        {
            maxfreq = Math.max(maxfreq,arr[j]);
        }
        for(int k = 0;k<arr.length;k++)
        {
            if (maxfreq == arr[k]) {
                char ch = (char)(k+97);
                System.out.println("The maximum occuring alphabet is : " +ch);
            }
        }
    }
}
