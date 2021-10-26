package com.gyana.design.builderpattern;

public class CarBuilder implements Builder {

    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private Interior interior;
    private Manual manual;

    @Override
    public void buildCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void buildEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void buildTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void buildInterior(Interior interior) {
        this.interior = interior;
    }

    @Override
    public void buildManual(Manual manual) {
        this.manual = manual;
    }

    @Override
    public Car build() {
        return new Car(this.carType, this.engine, this.transmission, this.interior, this.manual);
    }
}
