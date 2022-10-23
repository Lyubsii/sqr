package ru.netology.sqr.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,200,300",
//            "5,200,300"

//
//    })
    @CsvFileSource(files="src/test/resources/sqr.csv")
    public void countSquares(int expended, int minimum, int maximum) {
        SQRService service = new SQRService();
//        int expected = 10;
        int actual = service.countSquares(200, 300);

    }

//    @Test
//    public void countSquares() {
//        SQRService service = new SQRService();
//        int expected = 0;
//        int actual = service.countSquares(9802, 9900);
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void countSquaresUnderLimit() {
//        SQRService service = new SQRService();
//        int expected = 0;
//        int actual = service.countSquares(90, 99);
//        Assertions.assertEquals(expected, actual);
//    }

}
