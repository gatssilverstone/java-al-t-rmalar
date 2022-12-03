import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("oyun kaç sütun olsun aga");
        int satir=scan.nextInt();
        System.out.println("eyvallah, peki kaç satır olacak?");
        int sutun=scan.nextInt();
       MineField mineField=new MineField(satir,sutun);
       mineField.runrunrun();
    }
}