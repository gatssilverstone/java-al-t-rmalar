import java.util.Scanner;
public class faktoriel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("n sayısını gir");
        int n=scan.nextInt();
        System.out.println("r sayısını gir");
        int r=scan.nextInt();
        int nfak=1, rfak=1;
        int nr=(n-r);
        int top=1;
        for (int i=1; i<=nr; i++){

                top= top*i;
        }
        for (int i=1;  i<=r; i++){
        rfak=rfak*i;
        }
        int nrr=rfak*top;
        for (int i=1; i<=n; i++){
            nfak=nfak*i;
        }
        System.out.println(nfak/nrr);
    }
}
