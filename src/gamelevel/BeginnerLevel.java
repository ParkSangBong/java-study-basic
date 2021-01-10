package gamelevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("비기너는 jump 할 수 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("비기너는 turn 할 수 없습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("아이엠 비기너 레붤");
    }
}
