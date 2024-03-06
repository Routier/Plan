package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CalculationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calculation.csv")
    public void calcExpenses(int expected, int income, int expenses, int threshold) {
        CalculationService service = new CalculationService();
        int count = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, count);

    }
}
