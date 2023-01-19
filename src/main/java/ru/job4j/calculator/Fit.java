package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double manidealHeight = Fit.manWeight(heightMan);
        System.out.println("Man " + heightMan + " is " + manidealHeight);
        short heightWomen = 160;
        double womanIdealHeight = Fit.womanWeight(heightWomen);
        System.out.println("Woman " + heightWomen + " is " + womanIdealHeight);
    }
}
