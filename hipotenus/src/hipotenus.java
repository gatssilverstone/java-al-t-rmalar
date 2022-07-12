import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ilkKenar, ikinciKenar;
        System.out.print("ilk kenarın ölçüsü : ");
        ilkKenar=scan.nextInt();
        System.out.print("ikinci kenarın ölçüsü : ");
        ikinciKenar=scan.nextInt();
        double hipotenus= Math.sqrt ((ikinciKenar*ikinciKenar)+(ilkKenar*ilkKenar));
        System.out.println("hipotenüs: "+hipotenus);

    }
}
