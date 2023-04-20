package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServicesTest {

    @ParameterizedTest
   /* @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })*/
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void BonusServiceCalculateVacationMonths(int expected, int income, int expense, int threshold) {

        var services = new BonusServices();

        // подготавливвем данные:
        //int income = 10000;
        //int expense = 3000;
        //int threshold = 20000;


        // вызываем целевой метод
        int actual = services.calculate(income, expense, threshold);



        // произодим проверку (ожидаемый, фактический)
        Assertions.assertEquals(expected, actual);

    }

    /*@Test
    public void BonusServiceCalculateVacationMonths2() {

        var services = new BonusServices();

        // подготавливвем данные:
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;

        // вызываем целевой метод
        int actual = services.calculate(income, expense, threshold);
        int expected = 2;

        // произодим проверку (ожидаемый, фактический)
        Assertions.assertEquals(expected, actual);
    }*/
}
