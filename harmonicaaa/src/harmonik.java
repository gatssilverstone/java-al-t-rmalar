import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");
        int entry= scan.nextInt();
        double result=0.0;
        for (double i=1;i<=entry;i++){
            result+=(1/i);
        }
        System.out.println(result);
    }
}
