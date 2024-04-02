import java.util.Locale;

public class cas3_string {
    public static void main(String[] args) {
        System.out.println("Treci cas: ");

        String ime= "Pera";
        String ime2 = new String("pera");
//
//        ime.contains("e");
//        ime.equalsIgnoreCase(ime2);
//
//        boolean bul1 = ime.contains("e");
//        boolean bul = ime.equalsIgnoreCase(ime2); //ignorisi mala i velika slova
//        boolean bul2 = ime.equals(ime2);
//        boolean bul3 = ime.contains(ime2);
//
//        System.out.println(bul1);                         //true
//        System.out.println(bul);                          //true
//        System.out.println(ime.toUpperCase(Locale.ROOT)); //PERA
//        System.out.println(bul2);                         //false
//        System.out.println(bul3);                         //false
//
//        String s = "";
//        String s1 = " ";
//        System.out.println(s.equals(s1));                 // false
//        System.out.println(s.equals(s1.trim()));          // true ,trim metoda uklanja spejsove
//
//        String s3 = "Aleksandar    ";
//        int l = s3.length();
//        System.out.println(l);                        // 14 karaktera racuna i spejsove
//
//        Main main = new Main();
//        System.out.println(main); // --------> Main@2133c8f8 (mesto u heap memoriji)

        // HEAP memorija //

        String ime3= "Pera";
//        String ime= "Pera";  //--------> pera@333333333
//        String ime2 = new String("pera"); // string poop ------> pere@5321355 drugacije zbog NEW
        System.out.println(ime3);  // Pera --------> pera@333333333

        System.out.println(ime.equals(ime2));   //false   (poredi vrednos varijabli 'Pera' i 'pera'
        System.out.println(ime == ime2);        //false    zbog new ime2 ima drugo mestou memoriji

        System.out.println(ime.equals(ime3));   //true
        System.out.println(ime == ime3);        //true   (uporedjuje masta u memoriji, posto String cuva memoriju ako ta vrednost vec postoji u mem i drugoj varijavli dodeli isto mesto)





    }

}
