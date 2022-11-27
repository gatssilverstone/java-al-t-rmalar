import java.util.Scanner;
import java.util.Arrays;
public class ArrayEnYakinSayi {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int[] sherry={6,12,31,-31,61,18,99,213,-23,-1327,4,-7};
        Arrays.sort(sherry);
        int min=sherry[0];
        int max=sherry[0];
        System.out.println(Arrays.toString(sherry));



       // System.out.println(Arrays.toString());

        for (int i:sherry){
            if (input>i)
            min=i;
            else if (input==i){}
            else {
                max = i;
                break;
            }
        }


        System.out.println("en yakın küçük " + min  + "\n en yakın büyük: "+ max);

    }

}
