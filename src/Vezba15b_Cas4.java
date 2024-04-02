public class Vezba15b_Cas4 {

    public static void main(String[] args) {


        String carMake = "Ford";
        int doors = 4;

        if(carMake.equals("Ford")){
            switch (doors){
                case 1: {
                    System.out.println("Car maker is Ford and the car has 1 door");
                    break;
                }
                case 2: {
                    System.out.println("Car maker is Ford and the car has 2 doors");
                    break;
                }
                case 3: {
                    System.out.println("Car maker is Ford and the car has 3 doors");
                    break;
                }
                case 4: {
                    System.out.println("Car maker is Ford and the car has 4 doors");
                    break;
                }
                case 5: {
                    System.out.println("Car maker is Ford and the car has 5 doors");
                    break;
                }
                default: {
                    System.out.println("Car maker is Ford but that door number is not supported");
                }
            }
            //End of Switch/Case
        }else {
            System.out.println("Wrong car model!");
        }
    }
}
