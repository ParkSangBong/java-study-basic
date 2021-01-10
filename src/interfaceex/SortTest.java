package interfaceex;

import java.io.IOException;

public class SortTest {

    public static void main(String[] args) throws IOException {

        int[] arr = {1,2,3,4,5};

        System.out.println("정렬 방식을 선택하세요");
        System.out.println("B - bubble, H - Heap, Q - Quick");

        int ch = System.in.read();

        Sort sort = null;

        if (ch == 'B' || ch == 'b'){
            sort = new BubbleSort();
        }
        else if (ch == 'H' || ch == 'h'){
            sort = new HeapSort();
        }
        else if (ch == 'Q' || ch == 'q'){
            sort = new QuickSort();
        }
        else {
            System.out.println("잘못 선택하셨습니다.");
            return;
        }

        sort.ascending(arr);
        sort.decending(arr);
        sort.description();

    }

}
