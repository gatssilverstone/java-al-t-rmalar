
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ürünün fiyatı ne kadardı");
        double fiyat=scan.nextDouble();
        double kdv=(fiyat/100)*18;
        double kdvsiz=(fiyat/100)*82;
        System.out.println("devletin senden çöktüğü mebla : "+ kdv);
        System.out.println("kdvsiz tutar : " + kdvsiz);
        

    }
}
