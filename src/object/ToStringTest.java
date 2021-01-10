package object;

class Book implements Cloneable{             //clone을 사용하기 위해선 clone 메서드를 오버라이딩 할뿐아니라 Cloneable 명시해주어야함

    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ", " + title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {                //finalize는 우리가 직접 사용하는 것이 아닌 가비지 콜렉터에서 사용됨
        super.finalize();
    }
}

public class ToStringTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = "토지";
        System.out.println(str);

        Book book2 = (Book)book.clone();

        System.out.println(book2);

    }

}
