package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("random.txt", "rw");
        randomAccessFile.writeInt(100);
        System.out.println(randomAccessFile.getFilePointer());
        randomAccessFile.writeDouble(3.14);
        randomAccessFile.writeUTF("안녕하세요");

        randomAccessFile.seek(0);

        int i = randomAccessFile.readInt();
        double d = randomAccessFile.readDouble();
        String str = randomAccessFile.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

        randomAccessFile.close();

    }

}
