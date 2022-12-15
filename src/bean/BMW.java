package bean;


//Bean
//POJO - Plain Old Java Object
public class BMW extends Car {

    @Override
    public void start() {
        System.out.println("Bmw start!");
    }

    @Override
    public void stop() {
        System.out.println("Bmw stop!");
    }

    @Override
    public void speedUp() {
        System.out.println("Bmw speedUp!");
    }
}
