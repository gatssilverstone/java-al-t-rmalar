import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        int distance,age,tip;
        Scanner scan= new Scanner(System.in);
        double ucret=0.1, tutar;
        System.out.println("Gidilecek toplam mesafeyi girin: ");
        distance = scan.nextInt();
        System.out.println("Yaşınızı girin: ");
        age=scan.nextInt();
        System.out.println("Tek gidiş ise 1, gidiş dönüş ise 2");
        tip=scan.nextInt();
        if ((distance>0)&&(age>0)&&(tip==1||tip==2)){
            tutar=(distance*ucret);
            if (age<12){
                tutar=(tutar/10)*5;
            }
            if (age>=12&&age<25){
                tutar=(tutar/10)*9;
            }
            if (age>65) {
                tutar=(tutar/10)*7;
            }
            if (tip==2){
                tutar=(tutar/10)*8;
            }
            System.out.println("biletinizin tutarı: " + tutar + "TL");
        }
        else {
            System.out.println("HOOOP HEMŞERİM YANLIŞ VERİ");

        }
    }
}
