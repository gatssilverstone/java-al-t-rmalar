import java.util.Scanner;
public class dortVBesKuvvet {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("BİTECEK SAYIYI SEÇ");
        int entry= inp.nextByte();
        for (int dort=1,bes=1; dort<=entry&&bes<=entry; dort*=4, bes*=5){
            System.out.println("dördün kuvvetleri: "+dort);
            System.out.println("beşin kuvvetleri: "+ bes);
        }
    }

}
