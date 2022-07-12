import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double km;
        System.out.print("Gidilen mesafe : ");
        km=scan.nextInt();
        double ucret=(km*2.20)+10;
        System.out.println("ödemeniz gereken ücret " + ucret + " tl");
    }
}
