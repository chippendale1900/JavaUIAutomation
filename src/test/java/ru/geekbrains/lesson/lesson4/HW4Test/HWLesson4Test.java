package ru.geekbrains.lesson.lesson4.HW4Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.lesson.lesson4.HW4.HWLesson4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static ru.geekbrains.lesson.lesson4.Functions.isPalindrome;
import static ru.geekbrains.lesson.lesson4.HW4.HWLesson4.calculateArea;

public class HWLesson4Test {
    @Test
    void successCalculationTest() throw Exception {
        Assertions.assertEquals(calculateArea(1, 2,2),2);
    }

    @Test
    void wrongCalculationTest() {
        assertFalse(calculateArea("0"));
    }
}
