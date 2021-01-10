package interfaceex;

public class QuickSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("오름차순 퀵 정렬");
    }

    @Override
    public void decending(int[] arr) {
        System.out.println("내림차순 퀵 정렬");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("퀵 정렬");
    }
}
