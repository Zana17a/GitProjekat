import java.util.Scanner;

public class Vezba11_cas4 {


    public static void main(String[] args) {
//      System.out.println("cetvrti cas:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int operand1 = sc.nextInt();
        System.out.println("Unesi dugi broj: ");
        int operand2 = sc.nextInt();

        System.out.println("Unesi racunsku operaciju: ");
        String operator = sc.next(); // racunsku operaciju unosimo jao string

//        if (operator.equals("+")) {
//
//            System.out.println("Rezultat sabiranja je: " + (operand1 + operand2));
//        } else if (operator.equals("-")) {
//            System.out.println("Rezultat oduzimanja je: " + (operand1 - operand2));
//        } else if (operator.equals("*")) {
//            System.out.println("Rezultat mnozeja je: " + (operand1 * operand2));
//        } else if (operator.equals("%")) {
//            System.out.println("Ostatak pri deljenju je: " + (operand1 % operand2));
//        } else if (operator.equals("/")) {
//            if (operand2 == 0) {
//                System.out.println("Deljenje sa 0 nije dozvoljeno");
//            } else {
//                System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
//            }
//        } else {
//            System.out.println("Uneti operator nije dobar, pokusaj ponovo ");
//        }
        switch (operator){     //ne prima boolean nego: Char, Byte, Short, Integer, String, int, byte, char, short or emum, upises pogresan tip podatka pa haverujes pa ti kaze koje prihvata
            case "+":{
                System.out.println("Rezultat sabiranja je: " + (operand1 + operand2));;
            }break;
            case "-":{
                System.out.println("Rezultat oduzimanja je: " + (operand1 - operand2));
            }break;
            case "*":{
                System.out.println("Rezultat mnozeja je: " + (operand1 * operand2));
            }break;
            case "/":{
                if (operand2 == 0) {
                System.out.println("Deljenje sa 0 nije dozvoljeno");
                }else
                System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
            }break;
            default:System.out.println("Greska pri unosu");

        }
    }
}
