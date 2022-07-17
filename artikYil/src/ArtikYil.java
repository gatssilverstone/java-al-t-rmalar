import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int yil;
        System.out.println("yılı giriniz");
        yil=scan.nextInt();
        if (yil%100==0)
        {
            if (yil%400==0) {
                System.out.println("yıl artık yıldır");
            }
            else {
                System.out.println("artık yıl değildir");
            }
        } else if (yil%4==0) {
            System.out.println("yıl artık yıldır");

        } else {
            System.out.println("artık yıl değildir");
        }
    }
}
