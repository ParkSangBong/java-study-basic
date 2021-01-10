package templatequiz;

public class Grandeur extends Car{
    @Override
    public void start() {
        System.out.println("그랜져 시동.");
    }

    @Override
    public void drive() {
        System.out.println("그랜져 주행.");
    }

    @Override
    public void stop() {
        System.out.println("그랜져 정차.");
    }

    @Override
    public void turnoff() {
        System.out.println("그랜져 시동끔.");
    }
}
