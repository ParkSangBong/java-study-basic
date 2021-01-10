package cooperation;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){

        this.lineNumber = lineNumber;

    }

    public void take(int money){

        this.money = money;
        passengerCount++;

    }

    public void showSubwayInfo(){

        System.out.println(lineNumber + " 번 지하철의 승객은 " + passengerCount + " 명 이고, 총 승차요금은 " + money + " 입니다. ");

    }

}