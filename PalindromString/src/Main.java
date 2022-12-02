
public class Main {
    static boolean isPalindrom(String text){
        int begin=0;
        int end=text.length()-1;
        while (begin<end){

            if (text.charAt(begin)==text.charAt(end)){
            return true;
            }
            begin++;
            end--;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("kavaklı"));

    }
}