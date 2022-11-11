public class Parking {
    public static void main(String[] args) {
        // Deklarasi variabel
        int jamMasuk = 7;
        int menitMasuk = 15;
        int jamKeluar = 9;
        int menitKeluar = 45;
        int biaya = 0;
        int lamaParkir = 0;
        int lamaParkirMenit = 0;
        int lamaParkirJam = 0;
        
        // Hitung lama parkir
        lamaParkirJam = jamKeluar - jamMasuk;
        lamaParkirMenit = menitKeluar - menitMasuk;
        lamaParkir = (lamaParkirJam * 60) + lamaParkirMenit;

        // Hitung biaya parkir
        if (lamaParkir <= 60) {
            biaya = 2000;
        } else if (lamaParkir > 60 && lamaParkir <= 120) {
            biaya = 3000;
        } else if (lamaParkir > 120 && lamaParkir <= 180) {
            biaya = 4000;
        } else if (lamaParkir > 180 && lamaParkir <= 240) {
            biaya = 5000;
        } else if (lamaParkir > 240 && lamaParkir <= 300) {
            biaya = 6000;
        } else if (lamaParkir > 300 && lamaParkir <= 360) {
            biaya = 7000;
        } else if (lamaParkir > 360 && lamaParkir <= 420) {
            biaya = 8000;
        } else if (lamaParkir > 420 && lamaParkir <= 480) {
            biaya = 9000;
        } else if (lamaParkir > 480 && lamaParkir <= 540) {
            biaya = 10000;
        } else if (lamaParkir > 540 && lamaParkir <= 600) {
            biaya = 11000;
        } else if (lamaParkir > 600 && lamaParkir <= 660) {
            biaya = 12000;
        } else if (lamaParkir > 660 && lamaParkir <= 720) {
            biaya = 13000;
        } else if (lamaParkir > 720 && lamaParkir <= 780) {
            biaya = 14000;
        } else if (lamaParkir > 780 && lamaParkir <= 840) {
            biaya = 15000;
        } else if (lamaParkir > 840 && lamaParkir <= 900) {
            biaya = 16000;
        } else if (lamaParkir > 900 && lamaParkir <= 960) {
            biaya = 17000;
        } else if (lamaParkir > 960 && lamaParkir <= 1020) {
            biaya = 18000;
        } else {
            biaya = 20000;
        }

        // Cetak biaya parkir
        System.out.println("Biaya parkir: " + biaya);
    }
}
