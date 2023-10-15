/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author tarq
 */
public class NewVehicle extends Vehicle implements Flyable, Sailable {
// Implementing any abstract methods from FLyable and Sailable interfaces   
    

// Implementing the method : Flyable
    @Override
    public void changeAltitude(float change) {
    }
    
    @Override
    public float getAltitude(){
    }
    
    // Implementing the method : Sailable
    @Override
    public void hoistSail() {
    }

    @Override
    public void lowerSail() {
    }

    @Override
    public boolean isSailHoisted() {
    }

    @Override
    public void landHo() {
    }

    // Implementing the method : Drivable
    @Override
    public void accelerate(float speed) {
    }

    @Override
    public void brake() {
    }

    @Override
    public void turn(float angle) {
    }

    @Override
    public float getDirection() {
    }

    @Override
    public float getSpeed() {
    }

    @Override
    public String getMake() {
    }

    @Override
    public String getType() {
    }
    
}
