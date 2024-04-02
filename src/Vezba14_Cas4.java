public class Vezba14_Cas4 {

    public static void main(String [] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesi prvi broj: ");
//        int x = scanner.nextInt();
//        System.out.println("Unesi drugi broj: ");
//        int y = scanner.nextInt();

        int x = 523134;
        int y = 325423;

        int ostatak = (x % y);

        if (ostatak == 0) {
            System.out.println("Ostatak ne postoji");
        }
        else if (ostatak > 1000) {
            System.out.println("Ostatak je veci od 1000");
        }else {
            System.out.println("Ostatak je manji od 1000");
        }
    }
}
