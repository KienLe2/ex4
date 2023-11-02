public class MainCar {
    public static void mainCar(String[] args) {
        Car newCar = new Car("IX", "BWM", "BLUE", "2005","9999","5");
        String inforCar = newCar.toString();
        System.out.println("Car information: " + inforCar);
        newCar.sellNoti();

        System.out.println(newCar.getModel());
        System.out.println(newCar.getBrand());
        System.out.println(newCar.getYear());
        System.out.println(newCar.getPrice());
        System.out.println(newCar.getColor());
        System.out.println(newCar.getQuantity());

        newCar.deliveryNoti();

        newCar.setModel("IV");
        newCar.setBrand("BWM-X");
        newCar.setYear(2000);
        newCar.setPrice(11111);
        newCar.setColor("Black");
        newCar.setQuantity(5);

        System.out.println("Update Car: ");
        inforCar = newCar.toString();
        System.out.println("\n New: " + inforCar);
    }
}
