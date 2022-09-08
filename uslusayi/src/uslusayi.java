import java.util.Scanner;
public class uslusayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üssü alınacak sayı");
        int a=scan.nextInt();
        System.out.println("üs");
        int b=scan.nextInt();
        int ors=1;
        for (int i=1; i<=b; i++){
            ors=ors*a;
        }
        System.out.println(ors);
    }
}
