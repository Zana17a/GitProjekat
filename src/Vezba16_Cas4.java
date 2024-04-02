public class Vezba16_Cas4 {

    public static void main(String[] args) {
        System.out.println("********************");

        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.println("#     1     2     3");
                System.out.println("********************");
            } else {
                if(i>=5 && i<10) {
                    System.out.println(i + "     " + (i * 1) + "     " + (i * 2) + "    " + (i * 3));
                } else if (i==10) {
                    System.out.println(i + "    " + (i * 1) + "    " + (i * 2) + "    " + (i * 3));
                }else {
                    System.out.println(i + "     " + (i * 1) + "     " + (i * 2) + "     " + (i * 3));
                }
////nacin dva:
//                System.out.println("*******************");
//                System.out.println("#     1     2     3");
//                System.out.println("*******************");
//                for(int j=1; j<11;j++){
//                    System.out.println(j+"     "+j*1+"     "+j*2+"     "+j*3);
//                  }
            }
        }
    }
}
