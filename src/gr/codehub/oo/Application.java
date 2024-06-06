package gr.codehub.oo;

import gr.codehub.oo.enums.DeviceStatus;
import gr.codehub.oo.model.Book;
import gr.codehub.oo.model.CoffeeMaker;
import gr.codehub.oo.model.Device;
import gr.codehub.oo.model.OnlineItem;
import gr.codehub.oo.model.OrderItem;
import gr.codehub.oo.model.Phone;
import gr.codehub.oo.model.Smartphone;

import java.util.ArrayList;
import java.util.List;

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


        List<Device> myDevices = new ArrayList<>();
        myDevices.add(new Phone());
        myDevices.add(new Phone());
        myDevices.add(new CoffeeMaker());
        myDevices.add(new Smartphone("Model ABC123"));

        for (Device d : myDevices) {
            d.sayHello();
        }

        System.out.println("******************* CUSTOMER CHOICES ********************");
        Book book = new Book();
        book.setPrice(12.5);
        book.setTitle("Best book ever!");
        CoffeeMaker cmaker2 = new CoffeeMaker();
        List<OrderItem> itemsToBuy = new ArrayList<>();
        itemsToBuy.add(book);
        itemsToBuy.add(cmaker2);
        double totalAmount = 0;
        for(OrderItem o : itemsToBuy) {
            totalAmount += o.getPrice();
        }
        System.out.println("The total amount is " + totalAmount);

        OnlineItem a = new Book();
        System.out.println(a.getDescription());

    }
}
