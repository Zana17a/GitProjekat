import java.util.Arrays;
import java.util.Random;

public class Vezda18_Cas5 {

    public static void main(String[] args) {

        String niz[] = new String[]{"Heart", "Cherry", "Coin", "Melon", "Jocker"};

        Random index = new Random();
        String niz2[] = new String[niz.length];

        int index1 = index.nextInt(niz.length);
        int index2;
        int index3;
        int index4;
        int index5;
        niz2[0] = niz[index1];

        while (true) {
            index2 = index.nextInt(niz.length);
            if (index2 != index1) {
                niz2[1] = niz[index2];
                break;
            }
        }
        ;
        while (true) {
            index3 = index.nextInt(niz.length);
            if (index3 != index2 && index3 != index1) {
                niz2[2] = niz[index3];
                break;
            }
        }
        ;
        while (true) {
            index4 = index.nextInt(niz.length);
            if (index4 != index3 && index4 != index2 && index4 != index1) {
                niz2[3] = niz[index4];
                break;
            }
        }
        ;
        while (true) {
            index5 = index.nextInt(niz.length);
            if (index5 != index4 && index5 != index3 && index5 != index2 && index5 !=index1) {
                niz2[4] = niz[index5];
                break;
            }
        }
        ;
        System.out.println(Arrays.toString(niz2));
//        for (int i=0; i< niz.length; i++){
//        int randomindex = index.nextInt(niz.length);
//            System.out.print(" " + niz[randomindex]);


//        if (i==0) System.out.print(" " + niz[zamisljenbroj]);
//        else if (niz[zamisljenbroj].equals(niz[i])) continue;
//        else System.out.print(" " + niz[zamisljenbroj]);
//        System.out.println(Arrays.toString(niz));

    }
}

