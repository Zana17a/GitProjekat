public class Vezna16b_Cas4 {
    public static void main(String[] args) {

        System.out.printf("%16s\n","****************");
        System.out.printf("%1s%5d%5d%5d\n","#", 1, 2, 3);
        System.out.printf("%16s\n","****************");

        for (int i = 1; i <= 10; i++) {
            if (i*2 >= 10 && i<10){
                System.out.printf("%1d%5d %5d%5d\n", i, i * 1, i * 2, i * 3);
            } else if (i*3 >= 10 && i<10) {
                System.out.printf("%1d%5d%5d %5d\n", i, i * 1, i * 2, i * 3);
            } else
                System.out.printf("%1d%5d%5d%5d\n", i, i * 1, i * 2, i * 3);
        }
    }
}
