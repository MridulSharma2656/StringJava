package SkillsPw.StringJava;
import java.util.Scanner;
public class BasicsString {
    public static void main(String[] args) {
        String s = "Jai Shree Krishna";
        System.out.println(s + " ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, What is your name?");
        String x = sc.nextLine();
        System.out.println(x);
        int l = x.length();
        System.out.println(l+ " ");
        char c = x.charAt(5);
        System.out.println(c);
    }
}
