import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        System.out.print("yarı çap değeri : ");
        int r=veri.nextInt();
        double pi=3.14,alan=pi*r*r,cevre=2*pi*r;
        System.out.println("çevre ölçüsü : "+ cevre + " 5alan ölçüsü : "+alan);


    }
}
