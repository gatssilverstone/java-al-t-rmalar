import java.util.Scanner;
public class rakamTop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("RAKAM GİR");
        int entry=scan.nextInt();
        int tot=0,mod=0;
        while (entry!=0){
            mod= entry%10;
            tot+=mod;
            mod=0;
            entry=entry/10;
        }
        System.out.println("girdiğiniz sayının rakamlarının toplamı: "+ tot);
    }
}
