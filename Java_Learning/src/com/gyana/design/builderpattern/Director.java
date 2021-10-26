package com.gyana.design.builderpattern;

public class Director {
    public Car buildSedan(Builder builder) {
        builder.buildCarType(CarType.CITY_CAR);
        builder.buildEngine(new Engine(1.8));
        builder.buildTransmission(new Transmission("Auto"));
        builder.buildInterior(new Interior("cheap"));
        builder.buildManual(new Manual("Sedan Manual"));

        return builder.build();
    }

    public Car buildSportsCar(Builder builder) {
        builder.buildCarType(CarType.SPORTS_CAR);
        builder.buildEngine(new Engine(5));
        builder.buildTransmission(new Transmission("Manual"));
        builder.buildInterior(new Interior("expensive"));
        builder.buildManual(new Manual("Sports Manual"));


        return builder.build();
    }
}
