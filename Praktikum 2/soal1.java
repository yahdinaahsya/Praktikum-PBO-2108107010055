import java.util.Scanner;
public class soal1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Input nilai num1 : ");
        int num1 = masuk.nextInt();
        System.out.print("Input nilai num2 : ");
        int num2 = masuk.nextInt();

        // variabel rumus-rumus

        int penjumlahan = num1 + num2;
        int pengurangan = num1 - num2;
        int perkalian = num1 * num2;
        /*
         * Pada variabel pembagian dibuat dengan tipe double,
         * agar bisa menampung nilai desimal....
         * variabel num1 dan num2 diganti jadi bertipe double
         */
        double pembagian = (double) num1 / num2;
        int sisabagi = num1 % num2;

        // output

        System.out.println("num1 + num2  = " + penjumlahan);
        System.out.println("num1 - num2  = " + pengurangan);
        System.out.println("num1 * num2  = " + perkalian);
        System.out.println("num1 / num2  = " + pembagian);
        System.out.println("num1 % num2  = " + sisabagi);

    }
}
