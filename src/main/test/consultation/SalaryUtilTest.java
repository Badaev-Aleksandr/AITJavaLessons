package consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryUtilTest {

    private SalaryUtil salaryUtil;

    @BeforeEach
    public void setUp() {
        salaryUtil = new SalaryUtil();
    }

    @Test
    void testBruttoSalaryLess_2000() {
        assertEquals(1500, salaryUtil.getNettoSalary(1500));
    }

    @Test
    void testBruttoSalaryLess_5000() {
        assertEquals(8500, salaryUtil.getNettoSalary(10000));
    }

    @ParameterizedTest(name = "{index} ==> BRUTTO SALARY: {0} - NETTO SALARY: {1} ")
    @CsvFileSource(resources = "/salary.csv", numLinesToSkip = 1)
    void testBruttoSalaryCsvFile(double bruttoSalary, double expectedNettoSalary) {
        assertEquals(expectedNettoSalary, salaryUtil.getNettoSalary(bruttoSalary));
    }

    @ParameterizedTest(name = "{index} ==> BRUTTO SALARY: {0} - NETTO SALARY: {1} ")
    @CsvSource({
            " 1000,   1000",
            "2500,   2375",
            " 4200,   3780",
            "7000,   5950",
    })
    void testBruttoSalaryCsvSource(double bruttoSalary, double expectedNettoSalary) {
        assertEquals(expectedNettoSalary, salaryUtil.getNettoSalary(bruttoSalary));
    }

    @ParameterizedTest
    @EnumSource(TestBruttoNettoSalary.class)
    void testBruttoSalaryEnumTest(TestBruttoNettoSalary testEnum) {
        assertEquals(testEnum.getExpectedNetto(), salaryUtil.getNettoSalary(testEnum.getBrutto()));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1000, 2500, 4200, 7000})
    void testBruttoSalaryValueSource(double bruttoSalary) {
        Map<Double, Double> expectedSalary = new HashMap<>();
        expectedSalary.put(1000.00, 1000.00);
        expectedSalary.put(2500.00, 2375.00);
        expectedSalary.put(4200.00, 3780.00);
        expectedSalary.put(7000.00, 5950.00);
        assertEquals(expectedSalary.get(bruttoSalary), salaryUtil.getNettoSalary(bruttoSalary));


    }


}
