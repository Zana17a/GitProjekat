import java.util.Arrays;

public class Nizovi {
        public static void main(String[] args) {

            int niz[] = new int [] {55, 8, 9, 10, 56, 78};

            int max = niz[0];       //proglasim prvi element kao max
            for (int i = 1; i < niz.length; i++) { //kroz For petlju poredim taj prvi element sa indexom 0 sa svim ostalim elementima od indexa 1 do indexa 5
                if (niz[i] > max) { //kada naidje na veci broj njega proglasi novim maximumom
                    max = niz[i];
                }
            }
            int min = niz[0];       //proglasim prvi element kao min
            for (int i = 0; i < niz.length; i++) {
                if (niz[i] < min) {
                    min = niz[i];
                }
                System.out.print(" " + niz[i]);         // printanje niza 55 8 9 10 56 78
            }
            System.out.println();   // Novi prazan red
            System.out.println(Arrays.toString(niz));
            int nizdeo []= Arrays.copyOfRange(niz, 0, 3);  // pravi kopiju niza indexe 0, 1 i 2 [55,8,9]
            System.out.println(Arrays.toString(nizdeo));         // printa  [55, 8, 9]

            Arrays.sort(niz);       //sortiram NIZ
            System.out.println(Arrays.toString(niz));   //Printam sortiran niz

            System.out.println("Max vrednost niza: " + (max));
            System.out.println("Min vrednost niza: " + (min));
//----------------------------------------------------------------------------------------------------
            //dvodimenzioni niz:
            System.out.println();    // Novi prazan red
            System.out.println("Dvodimenzioni niz: ");

            int niz2D [][] = new int [][] {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            System.out.println(niz2D[1][1]);   //printam 5
            System.out.println(niz2D[1]); //-----> printa adresu u memoriji za {4,5,6}
            System.out.println(Arrays.toString(niz2D[1]));  //printam [4,5,6]

            for (int i = 0; i < niz2D.length; i++) {
                for (int j = 0; j < niz2D[i].length; j++) {
                    System.out.print(niz2D[i][j] + " ");
                }
                System.out.println(); // Novi red nakon svakog reda u 2D nizu
            }
        }
    }


