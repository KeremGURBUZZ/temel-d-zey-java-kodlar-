package Kosullar;

import java.util.Scanner;

// Kullanıcıdan girilen değerin sayı olup olmadığını ve pozitif mi negatif mi olduğunu kontrol eden program

public class Kosullar07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen pozitif veya negatif bir sayı giriniz: ");
        String input = scanner.nextLine();

        try {
            
            int sayi = Integer.parseInt(input);
            if (sayi < 0) {
                System.out.println("Sayınız NEGATİF'TİR.");
            } else if (sayi > 0) {
                System.out.println("Sayınız POZİTİF'TİR.");
            } else {
                System.out.println("Sayınız SIFIR'DIR.");
            }
        } catch (NumberFormatException e) {
            
            System.out.println("Lütfen geçerli bir sayı giriniz!!!");
        }

        scanner.close();
    }
}
