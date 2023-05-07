package Skypro;

public class Car extends MechanicalTransport {
    public Car(String modelName) {
        super(modelName,4);
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
