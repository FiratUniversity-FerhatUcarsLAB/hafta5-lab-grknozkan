/*
 * Ad Soyad: [Gürkan Özkan]
 * Ogrenci No: [250542023]
 * Tarih: [12.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {

    // 🔹 Sabitler
    final static double VAT_RATE = 0.18;        // %18 KDV
    final static double SHIPPING_FEE = 29.99;   // Kargo ücreti

    // 1️⃣ Satış Toplamı Hesapla (tek ürün için)
    public static double calculateProductTotal(double price, int quantity) {
        return price * quantity;
    }

    // 2️⃣ Ara Toplam (3 ürünün toplamı)
    public static double calculateSubtotal(double total1, double total2, double total3) {
        return total1 + total2 + total3;
    }

    // 3️⃣ İndirim Tutarı
    public static double calculateDiscountAmount(double subtotal, double discountRate) {
        return subtotal * (discountRate / 100);
    }

    // 4️⃣ İndirimli Toplam
    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // 5️⃣ KDV Tutarı
    public static double calculateVat(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // 6️⃣ Genel Toplam
    public static double calculateGrandTotal(double discountedTotal, double vatAmount) {
        return discountedTotal + vatAmount + SHIPPING_FEE;
    }

    // 🧩 Ana metod (main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SEPET TOPLAMI HESAPLAMA ===");

        // Ürün 1
        System.out.print("\n1. Ürün fiyatı (TL): ");
        double price1 = input.nextDouble();
        System.out.print("1. Ürün adedi: ");
        int qty1 = input.nextInt();

        // Ürün 2
        System.out.print("\n2. Ürün fiyatı (TL): ");
        double price2 = input.nextDouble();
        System.out.print("2. Ürün adedi: ");
        int qty2 = input.nextInt();

        // Ürün 3
        System.out.print("\n3. Ürün fiyatı (TL): ");
        double price3 = input.nextDouble();
        System.out.print("3. Ürün adedi: ");
        int qty3 = input.nextInt();

        // İndirim oranı
        System.out.print("\nİndirim oranı (%): ");
        double discountRate = input.nextDouble();

        // Hesaplamalar
        double total1 = calculateProductTotal(price1, qty1);
        double total2 = calculateProductTotal(price2, qty2);
        double total3 = calculateProductTotal(price3, qty3);
        double subtotal = calculateSubtotal(total1, total2, total3);
        double discountAmount = calculateDiscountAmount(subtotal, discountRate);
        double discountedTotal = calculateDiscountedTotal(subtotal, discountAmount);
        double vat = calculateVat(discountedTotal);
        double grandTotal = calculateGrandTotal(discountedTotal, vat);

        // Sonuçlar
        System.out.println("\n=== SONUÇLAR ===");
        System.out.printf("Ürün 1 Toplamı: %.2f TL%n", total1);
        System.out.printf("Ürün 2 Toplamı: %.2f TL%n", total2);
        System.out.printf("Ürün 3 Toplamı: %.2f TL%n", total3);
        System.out.printf("Ara Toplam: %.2f TL%n", subtotal);
        System.out.printf("İndirim Tutarı: %.2f TL%n", discountAmount);
        System.out.printf("İndirimli Toplam: %.2f TL%n", discountedTotal);
        System.out.printf("KDV (%%18): %.2f TL%n", vat);
        System.out.printf("Kargo Ücreti: %.2f TL%n", SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f TL%n", grandTotal);

        input.close();
    }
}
