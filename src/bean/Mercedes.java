package bean;

public class Mercedes extends Car {

    @Override
    public void start() {
        System.out.println("Mercedes start");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stop!");
    }

    @Override
    public void speedUp() {
        System.out.println("Mercedes speedUp!");
    }
}
