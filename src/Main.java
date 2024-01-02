
public class Main {
    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB= new Car("B");
        Car carC = new Car("C");

        Thread t1 = new Thread(carA);
        Thread t2 = new Thread(carB);
        Thread t3 = new Thread(carC);

        t1.start();
        t3.start();
        t2.start();
    }
}