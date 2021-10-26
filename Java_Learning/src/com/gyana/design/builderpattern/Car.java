package com.gyana.design.builderpattern;

public class Car {

    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private Interior interior;
    private Manual manual;

    public Car(CarType carType, Engine engine, Transmission transmission, Interior interior, Manual manual) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.interior = interior;
        this.manual = manual;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", engine=" + engine.getCc() +
                ", transmission=" + transmission.getType() +
                ", interior=" + interior.getInteriorType() +
                ", manual=" + manual.getManualName() +
                '}';
    }
}
