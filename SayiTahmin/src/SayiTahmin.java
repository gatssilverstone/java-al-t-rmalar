import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SayiTahmin {
    public static void main(String[] args) {
    Random rand=new Random();
    int number= rand.nextInt(100);
    Scanner scan=new Scanner(System.in);
    int deneme=0;
    boolean isWin=false;
    while (deneme<5){
        System.out.println("sayı giriniz: ");
        int input= scan.nextInt();
        if (input==number) {
            System.out.println("terlikler doğru");
            isWin=true;
            break;

        }
        else {
            deneme++;
            System.out.println("yanlış tahmin zorttt kalan hak: " + (5-deneme));
        }
    }
        if (!isWin)
            System.out.println("hakkın bitti bb");
    }
}
