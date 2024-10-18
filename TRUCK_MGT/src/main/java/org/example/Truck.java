package org.example;

public class Truck {
    private int id;
    private String name;
    private String model;
    private int capacity;
    private String drivername;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriver_name() {
        return drivername;
    }

    public void setDriverName(String drivername) {
        this.drivername = drivername;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Truck() {
    }

    public Truck(String name, String model, int capacity, String drivername) {
        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.drivername = drivername;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", drivername='" + drivername + '\'' +
                '}';
    }
}