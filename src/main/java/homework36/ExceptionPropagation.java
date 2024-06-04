package homework36;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ExceptionPropagation {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionPropagation.class);

    public void method1() throws IOException {
        method2();
    }

    public void method2() throws IOException {
        method3();
    }

    public void method3() throws IOException {
        throw new IOException("Error IOException");
    }
}
