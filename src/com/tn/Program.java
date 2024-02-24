package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi tu ban phim: ");
        String sentence = sc.nextLine();

        char[] Array = sentence.toCharArray();
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= 97 && Array[i] <= 122) {
                Array[i] -= 32;
            }
        }
        String uppercase = String.valueOf(Array);
        System.out.println("Chuoi in hoa: " + uppercase);



        char[] Array1 = sentence.toCharArray();
        boolean condition = true;
        for(int i = 0; i < Array1.length; i++) {
            if(Character.isLetter(Array1[i])) {
                if(condition) {
                    Array1[i] = Character.toUpperCase(Array1[i]);
                    condition = false;
                }
            }
            else
                condition = true;
        }
        String capitalize = String.valueOf(Array1);
        System.out.println("Chuoi in hoa chu cai dau cua tung tu: " + capitalize);



        char[] Array2 = sentence.toCharArray();
        for (int i = 0; i < Array2.length; i++){
            if (Array2[i] == 'n' || Array2[i] == 'g') {
                Array2[i] = 'a';
            }
        }
        String replace = String.valueOf(Array2);
        System.out.println("Chuoi thay the ky tu n, g thanh ky tu a: " + replace);
    }
}
