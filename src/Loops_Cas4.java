import java.util.Scanner;
public class Loops_Cas4 {
    public static void main(String [] args) {

//        for (int i = 0; i<=10;i++){
        // 10 x izvrsava liniju dole. pravi 10 objekata a realno kotistimo posle samo poslednji
//        Scanner scanner = new Scanner(System.in); - ako nam treba npr. 10 objekata
//            System.out.println("Ispis: " + i);
////          i = i + 2;
//        }
//        for (int i =10; i>0;){
//            System.out.println("Ispis: " + i);
//                i--;
////          i = i + 2;
////beskonacna FOR petlja :
//            for (;;) {
//                System.out.println("Ispis");
//            }

        for (int i = 0; i<=10;i++){
            for (int j = 0; j < 20; j++) {
                System.out.println("Brojac i: " + i + " brojac j: " + j);
            }
        }

    }
}
