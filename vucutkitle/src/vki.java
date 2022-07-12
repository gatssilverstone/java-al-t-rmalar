import java.util.Scanner;
public class vki {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double boy, vki;
        int kilo;
        System.out.print("Kilonuzu giriniz: ");
        kilo=scan.nextInt();
        System.out.print("Boyunuzu giriniz: ");
        boy=scan.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: " + vki);

    }
}
