package com.ri.mycarservice.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String model;
    private int capacity;
    private boolean newcar;
    private int seatNumber;

    public Car(String name, String model, int capacity, boolean newcar, int seatNumber) {
        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.newcar = newcar;
        this.seatNumber = seatNumber;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isNewcar() {
        return newcar;
    }

    public void setNewcar(boolean newcar) {
        this.newcar = newcar;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {

        return "Car: id = " + id +
                " Make = " + name +
                " Model = " + model +
                " Capacity = " + capacity + "cm3" +
                " New = " + newcar +
                " SeatNumber = " + seatNumber;
    }
}
