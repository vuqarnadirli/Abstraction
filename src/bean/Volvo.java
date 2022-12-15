package bean;

public class Volvo {
    public class A{ //inner class
        public void foo(){
            System.out.println("foo in inner class A");
        }
    }

    public static class B{//nested class
        public void foo(){
            System.out.println("foo in nested class B");
        }
    }
}
