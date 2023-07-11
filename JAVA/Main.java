class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        Car car = new Car();
        car.license="AMQ123";
        car.driver="Andres H";
        car.passenger=4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license="AMQ001";
        car2.driver="Andrea H";
        car2.passenger=3;
        car2.printDataCar();
       
    }
}