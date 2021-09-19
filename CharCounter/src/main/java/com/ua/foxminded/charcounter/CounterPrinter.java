package com.ua.foxminded.charcounter;

import java.util.Map;

public class CounterPrinter {

  public static void print(CharsCount counterChars) {
    System.out.print(formatCounterChars(counterChars));
  }

  static String formatCounterChars(CharsCount counterChars) {
    Map<Character, Integer> mapChars = counterChars.getUniqueCharsString();
    char[] charsString = counterChars.getCharsString();
    StringBuilder result = new StringBuilder();
    for (char charString : charsString) {
      result.append("\"");
      result.append(charString);
      result.append("\"");
      result.append(" - " + mapChars.get(charString) + "\n");
    }
    return result.toString();
  }

}
