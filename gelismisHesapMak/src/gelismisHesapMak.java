import java.util.Scanner;
public class gelismisHesapMak {


static void top(){
    Scanner scan=new Scanner(System.in);

        System.out.println(" kaç elemanlı toplama ");
    int eleman=scan.nextInt();
    int top=0;
        for (int i=0;i<eleman;i++){
            System.out.print("sayı giriniz: ");
            int veri=scan.nextInt();
            top+=veri;
        }
    System.out.println("toplam: "+top);
}
static void cikar(){
    Scanner scan=new Scanner(System.in);
    System.out.print("sayıları giriniz: ");
    int a=scan.nextInt(), b=scan.nextInt();
    System.out.println("sonuç: "+ (a-b));
}

static void carp(){
        Scanner scan=new Scanner(System.in);

        System.out.println(" kaç elemanlı çarpma ");
        int eleman=scan.nextInt();
        int top=1;
        for (int i=0;i<eleman;i++){
            System.out.print("sayı giriniz: ");
            int veri=scan.nextInt();
            top*=veri;
        }
        System.out.println("toplam: "+top);
    }
static void bol(){
        Scanner scan=new Scanner(System.in);
        System.out.print("sayıları giriniz: ");
        int a=scan.nextInt(), b=scan.nextInt();
        System.out.println("sonuç: "+ (a/b));
    }
static void uslu(){
    Scanner scan=new Scanner(System.in);
    System.out.println("üssü alınacak sayıyı gir: ");
    int a=scan.nextInt();
    System.out.println("üssü giriniz: ");
    int b=scan.nextInt();
    int tot=a;
    for (int i=1;i<b;i++){
        tot*=a;

    }
    System.out.println("sonuç: "+tot);
}

static void fakyuriel(){
    Scanner scan=new Scanner(System.in);
    System.out.println("faktöriyeli alınacak sayıyı girinik: ");
    int a=scan.nextInt();
    for (int i=a;i!=1;i--){
       a*=(i-1);
    }
    System.out.println("sonuç: "+a);

}
static void mod(){
    Scanner scan=new Scanner(System.in);
    System.out.println("modu alınacak sayıyı gir");
    double a=scan.nextInt();
    System.out.println("mod alacak sayıyı gir");
    double b=scan.nextInt();
    double sonuc=a%b;
    System.out.println("sonuç"+sonuc);
}

static void alanCevre(){
Scanner scan=new Scanner(System.in);

    System.out.println("uzun kenar: ");
    int uzun= scan.nextInt();
    System.out.println("kısa kenarı giriniz");
    int kisa= scan.nextInt();

    int alan=uzun*kisa;
    int cevre=(kisa*2)+(uzun*2);
    System.out.println("çevre: "+cevre+"alan: "+alan);
}

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;
        do {
            System.out.println("bir işlem seç: \n" +
                    "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n"+
                    "0- Bitir");
            select=scan.nextInt();
            switch (select){
                case 1:
                    top();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                bol();
                break;
                case 5:
                    uslu();
                    break;
                case 6:
                    fakyuriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    System.out.println("bb");
                    break;
                default:
                    System.out.println("yanlış girdin");
            }




    }while (select!=0);
}}
