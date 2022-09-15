import java.util.Scanner;
public class yildizlaElmas {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int n=scan.nextInt();
        for (int i=1;i<=n;i++){
            for (int a=1; a<=(n-i);a++){
                System.out.print(" ");
            }
            for (int b=1;b<=(2*i)-1; b++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int j=1;j<=n;j++) {
           for (int a=1;a<=j;a++){
               System.out.print(" ");
           }
           for (int b=1;b<=((n-j)*2)-1;b++){
               System.out.print("*");
           }
                System.out.println();
            }
        }
    }



