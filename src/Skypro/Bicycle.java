package Skypro;

public  class Bicycle extends  Transport {
    public Bicycle(String modelName) {
        super(modelName, 1);
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void service() {
        super.service();
        updateTyre();

    }

}
