package lesson40;

import java.io.ByteArrayInputStream;

public class JavaIOByteInputStream {
    public static void main(String[] args) {

        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        int date;
        while ((date = byteArrayInputStream.read()) != -1) {
            System.out.print(date);
        }

        System.out.println();
        System.out.println("---------------------");

        String text = "Hello Java 2024!!!";
        byte[] byteArray = text.getBytes();
        ByteArrayInputStream byteArrayInputStreamText = new ByteArrayInputStream(byteArray);
        int dateText;
        while ((dateText = byteArrayInputStreamText.read()) != -1) {
            System.out.print((char) dateText);
        }
    }
}
