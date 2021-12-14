package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRservice service = new SQRservice();

        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;
        int actualCount = service.numberSquares(lowerLimit, upperLimit);
        boolean passed = expected == actualCount;

        System.out.println(actualCount);
        System.out.println("Тест пройден " + passed);
    }
}
