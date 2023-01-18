package ru.job4j;

public class StudentInfo {

    public static void main(String[] args) {
        int i = 1;
        for(int count = 2; count<10; count++) {
            int result = i * count;
            System.out.println("" + i + " * " + count + " = " + result);
        }
    }
}
