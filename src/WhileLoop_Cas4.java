public class WhileLoop_Cas4 {

    public static void main(String[] args) {

        int a = 0;
//        boolien uslov unutar while
        while (a < 10) {
            a++;
//           System.out.println("Ispis: " + (a));
//           preskoci ovo iz uslova
            if (a == 5) {
//                continue;
                break;
            } else {
                System.out.println(a);
            }
            System.out.println("Cao");
        }

//        while (true){
//            System.out.println("Infinite loop!");
//        }
    }
}
