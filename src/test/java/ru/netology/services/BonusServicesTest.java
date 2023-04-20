package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import javax.annotation.processing.SupportedAnnotationTypes;

public class BonusServicesTest {

    @Test
    public void BonusServiceCalculateVacationMonths3() {

        var services = new BonusServices();

    // подготавливвем данные:
    int income = 10000;
    int expense = 3000;
    int threshold = 20000;


    // вызываем целевой метод
    int actual = services.calculate (income, expense,threshold);
    int expected = 3;

    // произодим проверку (ожидаемый, фактический)
    Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BonusServiceCalculateVacationMonths2() {

        var services = new BonusServices();

        // подготавливвем данные:
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;

        // вызываем целевой метод
        int actual = services.calculate (income, expense,threshold);
        int expected = 2;

        // произодим проверку (ожидаемый, фактический)
        Assertions.assertEquals(expected, actual);
    }
}
