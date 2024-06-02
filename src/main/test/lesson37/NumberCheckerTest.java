package lesson37;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTest {
    private LogCaptor logCaptor = LogCaptor.forClass(NumberChecker.class);

    @Test
    void testValidNumberInLogger(){
        NumberChecker numberChecker = new NumberChecker();
        numberChecker.checkNumber("123");
        logCaptor.setLogLevelToInfo();
        assertTrue(logCaptor.getInfoLogs().contains("Checking number: 123"));
        assertTrue(logCaptor.getInfoLogs().contains("Result of checking number: 123"));
        assertTrue(logCaptor.getInfoLogs().contains("Завершено: 123"));
    }
    @Test
    void testInvalidNumberInLogger() {
        NumberChecker numberChecker = new NumberChecker();

        logCaptor.setLogLevelToInfo();

        assertThrows(NumberFormatException.class, ()-> {
            numberChecker.checkNumber("123Y");
        });
        assertTrue(logCaptor.getInfoLogs().contains("Checking number: 123Y"));
        //assertTrue(logCaptor.getInfoLogs().contains("For input string: \"123Y\""));
        assertTrue(logCaptor.getInfoLogs().contains("Завершено: 123Y"));
    }
}
