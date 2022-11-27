import java.util.Arrays;

public class Main {

    static boolean isAvailable(int[] repeater,int range){
        for (int i:repeater){
            if (i==range) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] range={0,1,3,4,2,3,1,2,5,7,5,8,8,14,83,65};
        int[] repeater=new int[range.length];
        int startAdd=0;
        int temp=-1;
        for (int i=0; i<range.length; i++){
            for (int j=0;j<range.length;j++){
                if (j!=i&&range[i]==range[j]) {

                    if (!isAvailable(repeater,range[i])) {
                        repeater[startAdd++] = range[i];
                    }

                }

                }

        }

        System.out.println(Arrays.toString(repeater));
    }
}