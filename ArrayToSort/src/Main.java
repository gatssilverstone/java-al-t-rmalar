import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("dizi boyutu: ");
        int arraySize= scan.nextInt();
        int[] numbers= new int[arraySize];

        for (int i=0;i< numbers.length;i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            int enteredNumber=scan.nextInt();
            numbers[i]=enteredNumber;
        }
        Arrays.sort(numbers);
        System.out.println("Sıralı hali: "+Arrays.toString(numbers));
    }
}