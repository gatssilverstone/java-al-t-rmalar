import java.util.Scanner;
public class hesmak {
    public static void main(String[] args) {
        double say1,say2;
        Scanner scan=new Scanner(System.in);
        int islem;
        System.out.print("İlk sayıyı giriniz: ");
        say1= scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        say2= scan.nextInt();
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("toplama 1 \nçıkarma 2\nçarpma 3");
        if ((say1!=0)&&(say2!=0)){
            System.out.println("bölme 4");
        }
        islem= scan.nextInt();
        switch (islem){
            case 1:
                System.out.println("işleminizin sonucu : " + (say1 + say2));
                break;
            case 2:
                System.out.println("işleminizin sonucu : " + (say1-say2));
                break;
            case 3:
                System.out.println("işleminizin sonucu : " + (say1*say2));
                break;
            case 4:
                if ((say1!=0)&&(say2!=0)) {
                    System.out.println("işleminizin sonucu : " + (say1/say2));
                }
                break;
            default:
                System.out.println("adam gibi bi işlem seç lan");
                break;
                }

        }

    }


