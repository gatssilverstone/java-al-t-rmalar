import java.util.Scanner;

public class kulAd {
    public static void main(String[] args) {
        String kulAd, pw;
        int npw;

        Scanner scan=new Scanner(System.in);

        System.out.print("Kullanıcı adını gir: ");
        kulAd= scan.nextLine();
        System.out.println("Şifre giriniz: ");
        pw=scan.nextLine();

        if (kulAd.equals("gats31") && pw.equals("1327")){
            System.out.println("Giriş Başarılı aferin");
        }
        else {
            System.out.println("YANLIŞ GİRDİN ZORTTTT");
            System.out.println("şifreni yenilemek için 1'e bas");
            int yeni;
            yeni=scan.nextInt();
            if (yeni==1){
                System.out.print("yeni şifre gir çabuk: ");
                npw=scan.nextInt();
                if (npw==1327){
                    System.out.println("eski şifren buydu zaten ZOOORRRTTT AHAHHAHAH");
                }
                else {
                    System.out.println("tmm yenilendi şifren");
                }

            }
            else {
                System.out.println("iyi sen bilirsin valla kendin kaybedersin");
                }
        }
            }
        }






