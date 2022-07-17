import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int kalan, yil;
        System.out.println("doğum yılı");
        yil=scan.nextInt();
        kalan=yil%12;
        if (kalan==0) {
            System.out.println("maymun");
        }
        if (kalan==1) {
            System.out.println("horoz");
        }
        if (kalan==2) {
            System.out.println("köpke");
        }
        if (kalan==3) {
            System.out.println("domuz");
        }
        if (kalan==4) {
            System.out.println("fare");
        }
        if (kalan==5) {
            System.out.println("öküz");
        }
        if (kalan==6) {
            System.out.println("kapplann");
        }
        if (kalan==7) {
            System.out.println("davşan");
        }
        if (kalan==8) {
            System.out.println("ejderya");
        }
        if (kalan==9) {
            System.out.println("yılaaann");
        }
        if (kalan==10) {
            System.out.println("AT");
        }
        if (kalan==11) {
            System.out.println("koyun");
        }

    }
}
