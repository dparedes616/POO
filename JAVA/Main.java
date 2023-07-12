class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        Car car = new Car("AMQ123", new Account("Andres H", "AND444"));
        car.passenger=4;
        car.printDataCar();

        Car car2 = new Car("AMQ001", new Account("Andrea H", "DDD005"));
        car2.passenger=3;
        car2.printDataCar();
       
    }
}