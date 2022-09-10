import java.util.Scanner;
public class soal2 {
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = masuk.nextInt();
        if(nilai >= 87 && nilai <= 100){
            System.out.println("Nilai huruf anda A");
        }
        else if(nilai >= 78 && nilai<87){
            System.out.println("Nilai huruf anda AB");
        }
        else if(nilai >= 69 && nilai<78){
            System.out.println("Nilai huruf anda B");
        }
        else if(nilai >= 60 && nilai<69){
            System.out.println("Nilai huruf anda BC");
        }
        else if(nilai >= 51 && nilai<60){
            System.out.println("Nilai huruf anda C");
        }
        else if(nilai >= 41 && nilai<51){
            System.out.println("Nilai huruf anda D");
        }
        else if(nilai < 41){
            System.out.println("Nilai huruf anda E");
        }
        
        //untuk nilai diatas 100
        else{
            System.out.println("Nilai yang anda masukkan invalid");
        }

    }
}
