package Tugas;

public class soal4 {
    public static void main(String args[]){
        //parameter variabel angka agar langsung mulai dari angka 2
        int angka = 2;
        //perulangan untuk mengecek angka
        while (angka < 21){
            //mencetak setiap angka genap
            if(angka%2 == 0){
                System.out.print(angka);
            }
            //mencetak spasi setiap angka ganjil jadi tidak tampil
            else{
                System.out.print(" ");
            }
            angka++;
        }
    }
}
