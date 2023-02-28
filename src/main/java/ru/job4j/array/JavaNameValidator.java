package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        if (name.isEmpty() || Character.isUpperCase(array[0])
                || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        for (int index = 1; index < array.length; index++) {
            int code = Character.codePointAt(array, index);
            if (!(isLowerLatinLetter(code) || isUpperLatinLetter(code)
                    || isSpecialSymbol(code) || Character.isDigit(array[index]))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}
