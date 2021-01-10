package templatequiz;

public class Sonata extends Car{
    @Override
    public void start() {
        System.out.println("소나타 시동.");
    }

    @Override
    public void drive() {
        System.out.println("소나타 운전중.");
    }

    @Override
    public void stop() {
        System.out.println("소나타 정차중.");
    }

    @Override
    public void turnoff() {
        System.out.println("소나타 시동끔.");
    }
}
