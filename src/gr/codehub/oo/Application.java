package gr.codehub.oo;

import gr.codehub.oo.enums.DeviceStatus;
import gr.codehub.oo.model.CoffeeMaker;
import gr.codehub.oo.model.Device;
import gr.codehub.oo.model.Phone;
import gr.codehub.oo.model.Smartphone;

public class Application {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(); // base class
        coffeeMaker.setName("Best Coffee Maker");
        System.out.println("I have just bought " + coffeeMaker.getName());
        coffeeMaker.setStatus(DeviceStatus.ON);
        System.out.println("My device status is " + coffeeMaker.getStatus());
        coffeeMaker.sayHello(); // this is a device

        Phone myPhone = new Phone();
        myPhone.setName("My landline");
        myPhone.setStatus(DeviceStatus.ON);
        myPhone.setNumber("+30 123-456-7890 ext 218");
        myPhone.sayHello(); // this is a phone

        Device x = new Phone();
        x.setName("My second landline");
        x.setStatus(DeviceStatus.OFF);
//        x.getNumber();
        x.sayHello();  // this is a phone

        System.out.println( "*********************************");
        new Phone().sayHello();
        new Smartphone("abc").sayHello();

    }
}
