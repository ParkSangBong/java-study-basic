package interfaceex;

public class BubbleSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("오름차순 버블 정렬");
    }

    @Override
    public void decending(int[] arr) {
        System.out.println("내림차순 버블 정렬");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("버블 정렬");
    }
}
