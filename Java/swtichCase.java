public class swtichCase {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i =2; i < 7; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(b + ", ");
        }
    }
}