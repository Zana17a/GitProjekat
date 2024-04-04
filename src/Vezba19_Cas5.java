public class Vezba19_Cas5 {
        public static void main(String[] args) {

            String[] stringovi = {"Bicikl", "Automobil", "Mobilni telefon"};
            String[] modeli = {"BMX", "Renault 4", "I-Phone"};
            double[] cene = {150.55, 100.00, 500.00};

            for (int i = 0; i < modeli.length; i++) {
                System.out.println(modeli[i] + " is type " + stringovi[i] + " and it costs " + cene[i] + ".");
            }
        }
    }

