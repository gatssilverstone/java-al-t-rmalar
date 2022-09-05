import java.util.Scanner;

public class ucebolunensayiort {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int sayac=0, tot=0;
        System.out.print("bir sayı giiiiiirrrrr");
        int  b=scan.nextInt();
        for (int i = 1; i<=b; i++){
            if (i%3==0){
              sayac=sayac+1;
              tot=tot+i;
            }

        }
        double ort=tot/sayac;
        System.out.println(ort);
    }
}
