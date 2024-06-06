package gr.codehub.oo.model;

import gr.codehub.oo.enums.DeviceStatus;

public class Device implements OrderItem {
    private String name;
    private DeviceStatus status;
    private double price;

    @Override
    public double getPrice() {
        return 0;
    }

    public double getWeight() {
        return 0;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public void sayHello() {
        System.out.println("This is a device!");
    }
}
