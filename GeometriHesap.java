/*
 * Ad Soyad: [Gürkan Özkan]
 * Ogrenci No: [250542023]
 * Tarih: [12.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // 1️⃣ Kare
    public static double calculateSquareArea(double kenar) {
        return kenar * kenar;
    }

    public static double calculateSquarePerimeter(double kenar) {
        return 4 * kenar;
    }

    // 2️⃣ Dikdörtgen
    public static double calculateRectangleArea(double genislik, double yukseklik) {
        return genislik * yukseklik;
    }

    public static double calculateRectanglePerimeter(double genislik, double yukseklik) {
        return 2 * (genislik + yukseklik);
    }

    // 3️⃣ Daire
    public static double calculateCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double calculateCircleCircumference(double r) {
        return 2 * Math.PI * r;
    }

    // 4️⃣ Üçgen
    public static double calculateTriangleArea(double taban, double yukseklik) {
        return (taban * yukseklik) / 2;
    }

    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // 🧩 Ana metod (main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kare
        System.out.println("=== KARE ===");
        System.out.print("Kenar uzunluğunu giriniz: ");
        double kenar = input.nextDouble();
        System.out.println("Alan: " + calculateSquareArea(kenar));
        System.out.println("Çevre: " + calculateSquarePerimeter(kenar));

        // Dikdörtgen
        System.out.println("\n=== DİKDÖRTGEN ===");
        System.out.print("Genişlik giriniz: ");
        double genislik = input.nextDouble();
        System.out.print("Yükseklik giriniz: ");
        double yukseklik = input.nextDouble();
        System.out.println("Alan: " + calculateRectangleArea(genislik, yukseklik));
        System.out.println("Çevre: " + calculateRectanglePerimeter(genislik, yukseklik));

        // Daire
        System.out.println("\n=== DAİRE ===");
        System.out.print("Yarıçap giriniz: ");
        double r = input.nextDouble();
        System.out.println("Alan: " + calculateCircleArea(r));
        System.out.println("Çevre: " + calculateCircleCircumference(r));

        // Üçgen
        System.out.println("\n=== ÜÇGEN ===");
        System.out.print("Taban uzunluğunu giriniz: ");
        double taban = input.nextDouble();
        System.out.print("Yükseklik giriniz: ");
        double yukseklikU = input.nextDouble();
        System.out.print("1. Kenar uzunluğunu giriniz: ");
        double a = input.nextDouble();
        System.out.print("2. Kenar uzunluğunu giriniz: ");
        double b = input.nextDouble();
        System.out.print("3. Kenar uzunluğunu giriniz: ");
        double c = input.nextDouble();
        System.out.println("Alan: " + calculateTriangleArea(taban, yukseklikU));
        System.out.println("Çevre: " + calculateTrianglePerimeter(a, b, c));

        input.close();
    }
}
