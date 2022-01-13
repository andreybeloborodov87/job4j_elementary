package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are " + euro + " euro." + " Test result " + passedEuro);
        System.out.println("140 rubles are " + dollar + " dollar." + " Test result " + passedDollar);
    }
}