import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int ay,gun;
        System.out.println("kaçıncı ay doğdun");
        ay=inp.nextInt();
        System.out.println("bu ayın kaçıncı gününde doğdun");
        gun=inp.nextInt();
        switch (ay){
            case 1:
                if (gun>31){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }

                else if (gun<=21){
                    System.out.println("oğlak");
                }
                else {
                    System.out.println("kova");
                }
                break;
            case 2:
                if (gun==29){
                    System.out.println("4 yılda bir mi yaş alıyon knk");
                }
                else if (gun>29){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=19){
                    System.out.println("kova");
                }
                else {
                    System.out.println("baluk");
                }
                break;
            case 3:
                if (gun>31){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=20){
                    System.out.println("baluk");
                }
                else {
                    System.out.println("koç");
                }
                break;
            case 4:
                if (gun>30){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=20){
                    System.out.println("koç");
                }
                else {
                    System.out.println("boğa");
                }
                break;
            case 5:
                if (gun>31){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=21){
                    System.out.println("boğa");
                }
                else {
                    System.out.println("ikizler");
                }
                break;
            case 6:
                if (gun>30){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=22){
                    System.out.println("ikizler");
                }
                else {
                    System.out.println("yengeç");
                }
                break;
            case 7:
                if (gun>31){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=23){
                    System.out.println("yengeç");
                }
                else {
                    System.out.println("aslan");
                }
                break;
            case 8:
                if (gun>31){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=23){
                    System.out.println("aslan");
                }
                else {
                    System.out.println("başşak");
                }
                break;
            case 9:
                if (gun>30){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=23){
                    System.out.println("başşak");
                }
                else {
                    System.out.println("terazi");
                }
                break;
            case 10:
                if (gun>31){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=23){
                    System.out.println("terazi");
                }
                else {
                    System.out.println("akrep");
                }
                break;
            case 11:
                if (gun>30){
                    System.out.println("böyle bir tarih yok olm doğmadın mı sen");
                }
                else if (gun<=23){
                    System.out.println("akrep");
                }
                else {
                    System.out.println("yay");
                }
                break;
            case 12:
                if (gun>31){
                    System.out.println("sonraki sene doğmuşsun sen knk");
                }
                else if (gun<=20){
                    System.out.println("yay");
                }
                else {
                    System.out.println("oğlak");
                }
                break;
            default:
                System.out.println("ayı yanlış girdin ayı");

        }

    }
}
