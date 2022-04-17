package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        calc(input);
    }

    public static void calc(String input) {


        String[] input1 = input.split(" ");

        String num1, num2, oper;
        try {
            num1 = input1[0];
            oper = input1[1];
            num2 = input1[2];
        } catch (Exception ignored) {


        }
        int result = -1;


        String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        String[] rim1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int chislo = -1;
        int chislo1 = -1;
        try {
            for (int i = 0; i < rim1.length; i++) {
                num1 = input1[0];
                oper = input1[1];
                num2 = input1[2];
                if (rim1[i].equals(num1)) {
                    chislo = i + 1;
                }
                if (rim1[i].equals(num2)) {
                    chislo1 = i + 1;
                }
            }
        } catch (Exception ignored) {
        }
        String res = "0";
        if (chislo != -1 && chislo1 != -1) {

            try {
                if (input1.length == 3) {
                    num1 = input1[0];
                    oper = input1[1];
                    num2 = input1[2];

                    switch (oper) {
                        case ("+"):
                            result = chislo + chislo1;
                            break;
                        case ("-"):
                            result = chislo - chislo1;
                            if (result <= 0) {
                                throw new IllegalArgumentException("throws Exception //т.к. римское число должно быть положительным ");
                            }
                            break;

                        case ("*"):
                            result = chislo * chislo1;
                            break;
                        case ("/"):
                            try {
                                result = chislo / chislo1;
                                if (result <= 0) {
                                    throw new IllegalArgumentException("throws Exception //т.к. римское число должно быть положительным ");
                                }
                            } catch (ArithmeticException e) {
                                throw new IllegalArgumentException("throws Exception //т.к. на ноль нельзя делить ");

                            }
                            break;
                        default:
                            throw new IllegalArgumentException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }

                    for (int i = 0; i < rim.length; i++) {
                        if ((i + 1) == (result)) {
                            res = rim[i];
                        }
                    }
                    if (!res.equals("0")) {
                        System.out.println(res);
                    }

                } else {
                    throw new IllegalArgumentException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }

            } catch (IllegalArgumentException e) {


                System.out.println ("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

            }


        } else {
            try {
                if (input1.length == 3) {
                    num1 = input1[0];
                    oper = input1[1];
                    num2 = input1[2];

                    int a = Integer.parseInt(num1);
                    int b = Integer.parseInt(num2);

                    if ((a <= 10 && a >= 1) || (b <= 10 && b >= 1)) {

                        switch (oper) {
                            case ("+"):
                                result = a + b;
                                break;
                            case ("-"):
                                result = a - b;
                                break;

                            case ("*"):
                                result = a * b;
                                break;
                            case ("/"):

                                result = a / b;
                                break;


                            default:
                                throw new IllegalArgumentException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                        }
                        String r1 = Integer.toString(result);
                        System.out.println(r1);
                    } else {
                        throw new IllegalArgumentException("throws Exception //т.к. не удовлетворяет заданию");
                    }

                } else {
                    throw new IllegalArgumentException("throws Exception //т.к. формат математической операции не удовлетворяет заданию");
                }


            } catch (Exception e) {
                System.out.println ("throws Exception //т.к. строка не удовлетворяет заданию ");
            }
        }


    }


}
