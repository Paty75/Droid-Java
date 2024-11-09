
class Car {

    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public void startEngine() {
        System.out.println("Starting the car!");
        System.out.println("Vroom!");
    }

    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
        System.out.println("Enjoy!");
    }

    public static void main(String[] args){
        Car myFastCar = new Car("red");
        // Call a method on an object
        myFastCar.startEngine();
        System.out.println("That was one fast car!");
        Car myCar = new Car("red");
        myCar.startRadio(103.7, "Meditation Station");

    }



    }
