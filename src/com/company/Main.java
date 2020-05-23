package com.company;
import java.util.*;

public class Main {

    public static boolean isNumeric(String num) {
        if (num == null)
            return false;
        try {
            int temp = Integer.parseInt(num);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // Input string
        String inputString = myObj.nextLine();
        // Parse string to array ny space
        String[] numbers = inputString.split("\\s");

        if (!isNumeric(numbers[0]) && !isNumeric(numbers[2])) {
            String res = RomanCalc.romanCalc(numbers);
            System.out.println(res);
        } else if(!IntCalc.checkRange(numbers[0]) && !IntCalc.checkRange(numbers[0])){
            System.out.println("Enter num 1 till 10 please!");
        } else {
            int res = IntCalc.calculate(numbers);
            System.out.println(res);
        }

    }
}
