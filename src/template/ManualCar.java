package template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println(" 운전중입니다. ");
        System.out.println(" 전화하지 마십시오 (운전중) ");
    }

    @Override
    public void stop() {
        System.out.println(" 정차시키고 있습니다. ");
    }

}
