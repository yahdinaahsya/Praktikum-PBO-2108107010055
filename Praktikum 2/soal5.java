package Tugas;

public class soal5 {
    public static void main(String args[]) {
        // parameter variabel angka agar langsung mulai dari angka 2
        int angka = 2;
        // perulangan untuk mengecek angka
        while (angka < 21) {
            // agar angka genap kelipatan 6 tidak ditampilkan
            if (angka % 6 == 0) {
                angka++;
                continue;
            }
            // mencetak setiap angka genap
            else if (angka % 2 == 0) {
                System.out.print(angka + " ");
            }
            angka++;
        }
    }

}
