public class soal3 {
    public static void main(String arg[]) {
        //perulangan untuk banyak baris yang akan terbentuk
        //tidak akan mencetak apa2 akan tetapi membuatnya menjadi baris baru
        for (int i = 5; i > 0; i--) {
            //perulangan untuk mencetak * dalam satu baris
            for (int j = 0; j < i ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
