import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int sicaklik, yagmur;
        Scanner scan = new Scanner(System.in);
        System.out.println("sıcaklık gir ");
        sicaklik = scan.nextInt();
        if (sicaklik <= 5) {
            System.out.println("kayak yap");
        } else if (sicaklik > 5 && sicaklik < 25) {
            if (sicaklik < 10) {
                System.out.println("hava yagmurlu ise 1e değilse 2 ye bas");
                yagmur = scan.nextInt();
                switch (yagmur) {
                    case 1:
                        System.out.println("evde film izle");
                        break;
                    default:
                        System.out.println("sinemaya git");
                        break;
                }


            } else if (sicaklik >= 10 && sicaklik <= 15) {
                System.out.println("hava yagmurlu ise 1e değilse 2 ye bas");
                yagmur = scan.nextInt();
                switch (yagmur) {
                    case 1:
                        System.out.println("evde otur veya kafeye git");
                        break;
                    default:
                        System.out.println("sinemaya veya pikniğe git");
                        break;

                }

            } else if (sicaklik > 15) {
                System.out.println("hava yagmurlu ise 1e değilse 2 ye bas");
                yagmur = scan.nextInt();
                switch (yagmur) {
                    case 1:
                        System.out.println(" kafeye git");
                        break;
                    default:
                        System.out.println(" pikniğe git");
                        break;

                }

            }
        } else {
            System.out.println("hava yagmurlu ise 1e değilse 2 ye bas");
            yagmur = scan.nextInt();
            switch (yagmur) {
                case 1:
                    System.out.println("valla bu havada pek bişey yapılmaz \n duşa falan gir rahatlarsın");
                    break;
                default:
                    System.out.println("yüzmeye git, yüzme bilmiyosan ormana çık kamp yap");
                    break;
            }
        }
    }
}



