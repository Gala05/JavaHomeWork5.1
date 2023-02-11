package ru.netology.sqr;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void SqrNumber(int startValue, int finalValue) {
        SQRService service = new SQRService();
        int number = service.calcSQRWithinRange(startValue, finalValue);
        System.out.println(number);
    }
}
