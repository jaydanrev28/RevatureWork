package com.Jaydan.model;

public class FlyingVehicle extends Vehicle {
	private short wings;
    private Engine engine;

    public FlyingVehicle(){}

    public FlyingVehicle(short wings, Engine engine){
        this.wings = wings;
        this.engine = engine;
    }
}