import java.util.Scanner;
public class notOrt {
    public static void main(String[] args) {
        int mat, turk, tarih, fen, beden, dersSayisi=5;
        double ort;
        Scanner scan= new Scanner(System.in);
        System.out.println("Matematik notunu giriniiizzz: ");
        mat=scan.nextInt();
        if ((mat<0)||(mat>100)){
            System.out.println( "bu nasıl not olum");
            mat=0;
            dersSayisi --;
        }
        System.out.println("Türkçe notunu giriniiizzz: ");
        turk=scan.nextInt();
        if ((turk<0)||(turk>100)){
            System.out.println( "bu nasıl not olum");
            turk=0;
            dersSayisi --;
        }
        System.out.println("Tarih notunu giriniiizzz: ");
        tarih=scan.nextInt();
        if ((tarih<0)||(tarih>100)){
            System.out.println( "bu nasıl not olum");
            tarih=0;
            dersSayisi --;
        }
        System.out.println("fen notunu giriniiizzz: ");
        fen=scan.nextInt();
        if ((fen<0)||(fen>100)){
            System.out.println( "bu nasıl not olum");
            fen=0;
            dersSayisi --;
        }
        System.out.println("beden notunu giriniiizzz: ");
        beden=scan.nextInt();
        if ((beden<0)||(beden>100)){
            System.out.println( "bu nasıl not olum");
            beden=0;
            dersSayisi --;
        }
        ort=(mat+turk+tarih+fen+beden)/dersSayisi;
        if (ort>=55){
            System.out.println("GEÇTİİİİNİİİİZZZZ ortalamanız"+ort);
        }
        else {
            System.out.println("seneye görüşürüz ZOOORTTTT ortalamanız "+ort);
        }
    }
}
