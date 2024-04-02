import java.util.Random;
import java.util.Scanner;
public class vezba17_Cas4 {

    public static void main(String[] args) {
        Random broj = new Random();
        Scanner scaner = new Scanner(System.in);

        while (true) {
            int zamisljenbroj = broj.nextInt(3);
//            System.out.println(zamisljenbroj); - meni provera
            System.out.println("Koji broj sam zamislio?");
            System.out.println("Unesi broj: ");

            int mojbroj = scaner.nextInt();
            if (zamisljenbroj != mojbroj){ System.out.println("Nije!");
                }
            else {
                    System.out.println("Jeste!");
                    break;
                }
            }
        }
    }

