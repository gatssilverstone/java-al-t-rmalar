import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayı");
        n1=scan.nextInt();
        System.out.println("ikinci sayı");
        n2=scan.nextInt();
        System.out.println("üçüncü sayı");
        n3=scan.nextInt();
        if ((n1>n2)&&(n1>n3)){
            if (n2>n3){
                System.out.println(n1+">"+n2 + ">"+ n3);
            } else if (n3>n2) {
                System.out.println(n1+">"+n3+">"+n2);
                
            }
            else {
                System.out.println(n1+">"+n2+"="+n3);
            }
        }else if ((n2>n1)&&(n2>n3)){
            if (n1>n3){
                System.out.println(n2+">"+n1 + ">"+ n3);
            } else if (n3>n1) {
                System.out.println(n2+">"+n3+">"+n1);

            }
            else {
                System.out.println(n2+">"+n1+"="+n3);
            }
        }else if ((n3>n2)&&(n3>n1)){
            if (n2>n1){
                System.out.println(n3+">"+n2 + ">"+ n1);
            } else if (n1>n2) {
                System.out.println(n3+">"+n1+">"+n2);

            }
            else {
                System.out.println(n3+">"+n2+"="+n3);
            }
            
        } else if ((n1==n2)||(n1==n3)||(n2==n3)) {
            if (n1<n2){
                System.out.println(n2+"="+n3+">"+n1);
            } else if (n2<n3) {
                System.out.println(n1+"="+n3+">"+n2);

            }
            else {
                System.out.println(n1+"="+n2+">"+n3);
            }

        } else {
            System.out.println("EŞİT BUNLAR ??");
        }
    }
}
