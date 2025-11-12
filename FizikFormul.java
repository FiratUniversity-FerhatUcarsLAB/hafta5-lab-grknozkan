/*
 * Ad Soyad: [Gürkan Özkan]
 * Ogrenci No: [250542023]
 * Tarih: [12.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {

    // Sabit tanımlama
    final static double GRAVITY = 9.8; // m/s^2

    // 1️⃣ Hız: v = s / t
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // 2️⃣ İvme: a = Δv / t
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // 3️⃣ Kuvvet: F = m × a
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // 4️⃣ İş: W = F × d
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // 5️⃣ Güç: P = W / t
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // 6️⃣ Kinetik Enerji: KE = 0.5 × m × v²
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // 7️⃣ Potansiyel Enerji: PE = m × g × h
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // 8️⃣ Momentum: p = m × v
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // 🧩 Ana metot (main)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== TEMEL FİZİK FORMÜLLERİ ===");

        // Hız
        System.out.print("\nMesafe (m): ");
        double s = input.nextDouble();
        System.out.print("Zaman (s): ");
        double t = input.nextDouble();
        System.out.println("Hız (v): " + calculateVelocity(s, t) + " m/s");

        // İvme
        System.out.print("\nHız değişimi (Δv, m/s): ");
        double deltaV = input.nextDouble();
        System.out.print("Zaman (s): ");
        double t2 = input.nextDouble();
        System.out.println("İvme (a): " + calculateAcceleration(deltaV, t2) + " m/s²");

        // Kuvvet
        System.out.print("\nKütle (kg): ");
        double m1 = input.nextDouble();
        System.out.print("İvme (m/s²): ");
        double a = input.nextDouble();
        System.out.println("Kuvvet (F): " + calculateForce(m1, a) + " N");

        // İş
        System.out.print("\nKuvvet (N): ");
        double F = input.nextDouble();
        System.out.print("Yol (m): ");
        double d = input.nextDouble();
        System.out.println("İş (W): " + calculateWork(F, d) + " J");

        // Güç
        System.out.print("\nİş (J): ");
        double W = input.nextDouble();
        System.out.print("Zaman (s): ");
        double t3 = input.nextDouble();
        System.out.println("Güç (P): " + calculatePower(W, t3) + " W");

        // Kinetik Enerji
        System.out.print("\nKütle (kg): ");
        double m2 = input.nextDouble();
        System.out.print("Hız (m/s): ");
        double v = input.nextDouble();
        System.out.println("Kinetik Enerji (KE): " + calculateKineticEnergy(m2, v) + " J");

        // Potansiyel Enerji
        System.out.print("\nKütle (kg): ");
        double m3 = input.nextDouble();
        System.out.print("Yükseklik (m): ");
        double h = input.nextDouble();
        System.out.println("Potansiyel Enerji (PE): " + calculatePotentialEnergy(m3, h) + " J");

        // Momentum
        System.out.print("\nKütle (kg): ");
        double m4 = input.nextDouble();
        System.out.print("Hız (m/s): ");
        double v2 = input.nextDouble();
        System.out.println("Momentum (p): " + calculateMomentum(m4, v2) + " kg·m/s");

        input.close();
    }
}
