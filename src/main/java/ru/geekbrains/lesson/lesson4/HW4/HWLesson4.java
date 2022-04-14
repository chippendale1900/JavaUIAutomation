package ru.geekbrains.lesson.lesson4.HW4;

public class HWLesson4 {
    public static double calculateArea(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new Exception("Ошибка!");
        }
        double halfP = (sideA + sideB + sideC) / 2;
        double square = (halfP*(halfP - sideA) + (halfP - sideB)*(halfP - sideC));
        return Math.sqrt(square);
    }
}
