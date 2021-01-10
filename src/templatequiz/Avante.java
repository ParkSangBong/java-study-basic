package templatequiz;

public class Avante extends Car{
    @Override
    public void start() {
        System.out.println("아반떼 시동.");
    }

    @Override
    public void drive() {
        System.out.println("아반떼 주행.");
    }

    @Override
    public void stop() {
        System.out.println("아반떼 정차.");
    }

    @Override
    public void turnoff() {
        System.out.println("아반떼 시동끔.");
    }
}
