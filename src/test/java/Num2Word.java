import java.io.Console;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Num2Word {
  public static void main(String[] args) {

  }
  public static String convertToWord(String number) {

    Integer inputNumberDigit = Integer.parseInt(number);
    String finalNum = "";
    HashMap<Integer, String> convertNumber = new HashMap<Integer, String>();
    convertNumber.put(0, "zero");
    convertNumber.put(1, "one");
    convertNumber.put(2, "two");
    convertNumber.put(3, "three");
    convertNumber.put(4, "four");
    convertNumber.put(5, "five");
    convertNumber.put(6, "six");
    convertNumber.put(7, "seven");
    convertNumber.put(8, "eight");
    convertNumber.put(9, "nine");

    // HashMap<Integer, String> convertNumber = new HashMap<Integer, String>();
    convertNumber.put(10, "ten");
    convertNumber.put(11, "eleven");
    convertNumber.put(12, "twelve");
    convertNumber.put(13, "thirteen");
    convertNumber.put(14, "fourteen");
    convertNumber.put(15, "fifteen");
    convertNumber.put(16, "sixteen");
    convertNumber.put(17, "seventeen");
    convertNumber.put(18, "eighteen");
    convertNumber.put(19, "nineteen");

    HashMap<Integer, String> convertNumberTens = new HashMap<Integer, String>();
    convertNumberTens.put(20, "twenty");
    convertNumberTens.put(30, "thirty");
    convertNumberTens.put(40, "forty");
    convertNumberTens.put(50, "fifty");
    convertNumberTens.put(60, "sixty");
    convertNumberTens.put(70, "seventy");
    convertNumberTens.put(80, "eighty");
    convertNumberTens.put(90, "ninety");


    if (inputNumberDigit < 20) {
      finalNum = convertNumber.get(inputNumberDigit);
    } else if (inputNumberDigit > 19 && inputNumberDigit < 30) {
      String almostFinalNum[] = convertNumberTens.get(20);
      // String test = String.valueOf(inputNumberDigit);
      // char[] charArrayIntegers = test.toCharArray();


    }

    return finalNum;

    // HashMap<Integer, String> convertNumberHundreds = new HashMap<Integer, String>();
    // convertNumber.put(100, "hundred");
    // convertNumber.put(1000, "thousand");
    // convertNumber.put(1000000, "million");
    // convertNumber.put(1000000000, "billion");
    // convertNumber.put(1000000000000, "trillion");
  }
}
