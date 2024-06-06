package gr.codehub.oo.model;

import gr.codehub.oo.enums.DeviceStatus;

abstract public class Device {
    private String name;
    private DeviceStatus status;

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
}
