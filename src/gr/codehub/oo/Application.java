package gr.codehub.oo;

import gr.codehub.oo.enums.DeviceStatus;
import gr.codehub.oo.model.CoffeeMaker;
import gr.codehub.oo.model.Device;
import gr.codehub.oo.model.Phone;

public class Application {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(); // base class
        coffeeMaker.setName("Best Coffee Maker");
        System.out.println("I have just bought " + coffeeMaker.getName());
        coffeeMaker.setStatus(DeviceStatus.ON);
        System.out.println("My device status is " + coffeeMaker.getStatus());

        Phone myPhone = new Phone();
        myPhone.setName("My landline");
        myPhone.setStatus(DeviceStatus.ON);
        myPhone.setNumber("+30 123-456-7890 ext 218");

        Device x = new Phone();
        x.setName("My second landline");
        x.setStatus(DeviceStatus.OFF);
        x.setNumber("123-321");

    }
}
