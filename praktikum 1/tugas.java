import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
      Scanner masuk = new Scanner(System.in);
      System.out.print("Harga : ");
      int harga = masuk.nextInt();
      System.out.print("Jumlah barang : ");
      int x = masuk.nextInt();
      int jlh = x*harga;
      int diskon = jlh * 15/100;
      int hasil = harga-diskon;
      
      System.out.println("Harga setelah di diskon 15% adalah " +hasil); 
    }
    
}
