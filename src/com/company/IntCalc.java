package com.company;

public class IntCalc {

    public static boolean checkRange(String num) {
        if (Integer.parseInt(num) <= 10 && Integer.parseInt(num) >= 1){
            return true;
        }else{
            return false;
        }
    }

    public static int calculate(String[] numbers) {
        int res = 0;
        try {
            switch (numbers[1]) {
                case "+":
                    res = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]);
                    break;
                case "-":
                    res = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[2]);
                    break;
                case "/":
                    res = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[2]);
                    break;
                case "*":
                    res = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[2]);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        return res;
    }
}
