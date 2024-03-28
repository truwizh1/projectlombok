public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Tesla");
        car1.setBrand("Model S");
        car1.setYear(2020);
        car1.setPrice(69900);
        car1.setColor("Red");
        car1.setQuantity(1);

        Car car2 = new Car();
        car2.setModel("Tesla");
        car2.setBrand("Model S");
        car2.setYear(2020);
        car2.setPrice(69900);
        car2.setColor("Red");
        car2.setQuantity(1);

        System.out.println("car1 equals car2: " + car1.equals(car2));
        System.out.println("car1 hashCode: " + car1.hashCode());
        System.out.println("car2 hashCode: " + car2.hashCode());
    }
}
