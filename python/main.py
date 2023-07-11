from car import Car

if __name__ == "__main__":
    print("hola")
    car =Car()
    car.license="ABC132"
    car.driver="Andres H"
    print(vars(car))

    car2 =Car()
    car2.license="ABC001"
    car2.driver="Andrea H"
    print(vars(car))