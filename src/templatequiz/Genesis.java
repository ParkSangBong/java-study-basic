package templatequiz;

public class Genesis extends Car{
    @Override
    public void start() {
        System.out.println("제네시스 시동.");
    }

    @Override
    public void drive() {
        System.out.println("제네시스 주행.");
    }

    @Override
    public void stop() {
        System.out.println("제네시스 정차.");
    }

    @Override
    public void turnoff() {
        System.out.println("제네시스 시동끔.");
    }
}
