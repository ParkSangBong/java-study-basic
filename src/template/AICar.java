package template;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println(" 자율 주행 중. ");
        System.out.println(" keep going ");
        System.out.println(" make change direction ");
    }

    @Override
    public void stop() {
        System.out.println(" 장비를 정지합니다. ");
    }

    @Override
    public void washCar() {
        System.out.println(" 시스템 가동 준비 완료, 자동 세차 중 ");
        System.out.println(" Keep Going ");
        System.out.println(" Clear. ");
    }
}