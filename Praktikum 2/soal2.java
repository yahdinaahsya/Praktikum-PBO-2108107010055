import java.util.Scanner;
public class soal2 {
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = masuk.nextInt();
        if(nilai >= 87 && nilai <= 100){
            System.out.println("Nilai huruf anda A, IP 4.00");
        }
        else if(nilai >= 78 && nilai<87){
            System.out.println("Nilai huruf anda AB, IP 3.50");
        }
        else if(nilai >= 69 && nilai<78){
            System.out.println("Nilai huruf anda B, IP 3.00");
        }
        else if(nilai >= 60 && nilai<69){
            System.out.println("Nilai huruf anda BC, IP 2.50");
        }
        else if(nilai >= 51 && nilai<60){
            System.out.println("Nilai huruf anda C, IP 2.00");
        }
        else if(nilai >= 41 && nilai<51){
            System.out.println("Nilai huruf anda D, IP 1.00");
        }
        else if(nilai < 41){
            System.out.println("Nilai huruf anda E, IP 0.00");
        }
        
        //untuk nilai diatas 100
        else{
            System.out.println("Nilai yang anda masukkan invalid");
        }

    }
}
