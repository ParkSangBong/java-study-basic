package interfaceex;

public class HeapSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println("오름차순 힙 정렬");
    }

    @Override
    public void decending(int[] arr) {
        System.out.println("내림차순 힙 정렬");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("힙 정렬");
    }
}
