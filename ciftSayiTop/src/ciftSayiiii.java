import java.util.Scanner;
public class ciftSayiiii {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i,top=0;
        do{
            System.out.println("sayı gir");
            i=inp.nextInt();
            if (i%4==0||i==2){
                top+=i;

            }

        }while (i%2==0);
        System.out.println("TEK SAYI GİRDİN ZOOOORRRRT");
        System.out.println("toplam " + top);


    }
}
