import java.util.Scanner;

public class ort {
    public static void main(String[] args) {
        int mat, fzk, trkc, tarih;
        int top;
        Scanner veri = new Scanner(System.in);
        System.out.println("matematik notunu gir");
        mat= veri.nextInt();

        System.out.println("fizik notunu gir");
        fzk= veri.nextInt();

        System.out.println("türkçe notunu gir");
        trkc= veri.nextInt();

        System.out.println("tarih notunu gir");
        tarih= veri.nextInt();

        top=mat+fzk+trkc+tarih;
        double ort=top/4;
        System.out.print("ortalamanız ");
        System.out.println(ort);

        boolean sonuc= ort>=60;
        String out=(sonuc?"geçtin":"kaldın");
        System.out.println(out);


    }
}
