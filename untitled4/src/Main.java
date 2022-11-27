public class Main {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7};
        double harmonicAverage=0;
        for (double i=1; i<=numbers.length;i++){
            harmonicAverage+=1/i;

        }
        System.out.println(harmonicAverage);

}}