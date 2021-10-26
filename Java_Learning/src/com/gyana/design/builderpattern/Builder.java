package com.gyana.design.builderpattern;

public interface Builder {

    void buildCarType(CarType carType);

    void buildEngine(Engine engine);

    void buildTransmission(Transmission transmission);

    void buildInterior(Interior interior);

    void buildManual(Manual manual);

    Car build();
}
