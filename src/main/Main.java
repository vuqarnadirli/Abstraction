package main;

import bean.BMW;
import bean.Car;
import bean.Volvo;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.startAndSpeedUp();

        Car c = bmw;

        c.startAndSpeedUp();

//        Car[] cars={bmw};
//        allCarsStart(cars);

//        Car cc = new Car() {
//            @Override
//            public void start() {
//
//            }
//
//            @Override
//            public void stop() {
//
//            }
//
//            @Override
//            public void speedUp() {
//
//            }
//        };
//
//
//        System.out.println(cc.getClass().getName());

        Volvo.A a = new Volvo().new A();
        a.foo();

        Volvo.B b = new Volvo.B();
        b.foo();
    }

    public static void allCarsStart(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }
}

