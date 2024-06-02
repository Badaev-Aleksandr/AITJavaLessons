package lesson37;

import java.io.IOException;

public class ExceptionPropagation {

    public void method1() throws IOException {
        method2();
    }

    public void method2() throws IOException {
        method3();
    }

    public void method3() throws IOException{
        throw new IOException("IO Exception !!!");
    }
}
