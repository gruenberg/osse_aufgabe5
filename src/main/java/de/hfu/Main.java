package de.hfu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        Scanner s = new Scanner(System.in);
        text = s.nextLine();
        System.out.println(text.toUpperCase());
        s.close();
    }
}