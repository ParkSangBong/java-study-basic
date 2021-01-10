package gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("쩜프 한다!.");
    }

    @Override
    public void turn() {
        System.out.println("숙련자는 turn 할 수 없습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("아엠 얬뺸쓰뜨례뿰.");
    }
}
