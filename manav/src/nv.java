import java.util.Scanner;
public class nv {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int elma, armut, domates, muz, patlıcan;
        double elmakg=3.67, armutkg=2.14, domkg=1.11, muzkg=0.95, patkg=5.0;

        System.out.println("elma kaç kilo");
        elma=giris.nextInt();
        elmakg=elma*elmakg;
        System.out.println("armut kaç kilo");
        armut= giris.nextInt();
        armutkg=armut*armutkg;
        System.out.println("domates kaç kilo");
        domates= giris.nextInt();
        domkg=domates*domkg;
        System.out.println("muz kaç kilo");
        muz= giris.nextInt();
        muzkg=muz*muzkg;
        System.out.println("patlıcan kaç kilo");
        patlıcan=giris.nextInt();
        patkg=patkg*patlıcan;
        double top=(elmakg+armutkg+domkg+muzkg+patkg);
        System.out.println("toplam tutar: " + top + "tl");
    }
}
