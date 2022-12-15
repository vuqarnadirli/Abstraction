package bean;

public abstract class Car {
    public abstract void start(); //abstract method

    public abstract void stop();

    public abstract void speedUp();

    public void startAndSpeedUp(){//concrete method
        start();
        speedUp();
    }
}
