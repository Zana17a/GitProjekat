public class Vezba15_Cas4 {
        public static void main(String[] args) {

            String carMake = "Ford";
            int doors = 4;

            if (carMake.equals("Ford")) {
                if (doors == 4) {
                    System.out.println("Proizvodjas automobila je Ford, automobil ima 4 vrata");
                } else if (doors < 4 ) {
                    System.out.println("Proizvodjas automobila je Ford, automobil ima manje od 4 vrata");
                } else {
                    System.out.println("Proizvodjas automobila je Ford, automobil ima vise od 4  vrata");
                }

            } else {
                if (doors == 4) {
                    System.out.println("Proizvodjas automobila NIJE Ford, i automobil ima 4 vrata");
                } else if (doors < 4 ) {
                    System.out.println("Proizvodjas automobila NIJE Ford, i automobil ima manje od 4 vrata");
                } else {
                    System.out.println("Proizvodjas automobila NIJE Ford, i automobil ima vise od 4  vrata");
                }
            }
        }
    }
    
