package week5;
public class week5program1 {
    static class Car {
        private String brand;
        private String model;
        private int year;
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("----------------------");
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", 2024);
        Car car2 = new Car("Toyota", "Camry", 2025);

        car1.displayInfo();
        car2.displayInfo();
    }
}
