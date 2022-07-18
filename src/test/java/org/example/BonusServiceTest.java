package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")

    public void getBonus(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        //long amount = 1000;
        //boolean registered = true;
        //long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
//@org.junit.jupiter.api.Test
//void shouldCalculateForRegisteredAndOverLimit() {
//       BonusService service = new BonusService();

// подготавливаем данные:
//       long amount = 1_000_000;
//       boolean registered = true;
//       long expected = 500;

// вызываем целевой метод:
//       long actual = service.calculate(amount, registered);

// производим проверку (сравниваем ожидаемый и фактический):
//     assertEquals(expected, actual);
//}

// @org.junit.jupiter.api.Test
// void shouldCalculateForUnregisteredAndOverLimit() {
//      BonusService service = new BonusService();

// подготавливаем данные:
//      long amount = 1_000;
//       boolean registered = false;
//       long expected = 10;

// вызываем целевой метод:
//      long actual = service.calculate(amount, registered);

// производим проверку (сравниваем ожидаемый и фактический):
//     assertEquals(expected, actual);
// }

// @org.junit.jupiter.api.Test
//  void shouldCalculateForUnregisteredAndUnderLimit() {
//      BonusService service = new BonusService();

// подготавливаем данные:
//long amount = 1_000_000;
//boolean registered = false;
//long expected = 500;

// вызываем целевой метод:
//long actual = service.calculate(amount, registered);

// производим проверку (сравниваем ожидаемый и фактический):
// assertEquals(expected, actual);
// }
