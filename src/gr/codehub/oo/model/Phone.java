package gr.codehub.oo.model;

public class Phone extends Device {
    private String number;

    public Phone() {
        System.out.println("A phone has just been created");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void sayHello() {
        System.out.println("This is a phone");
    }

}
