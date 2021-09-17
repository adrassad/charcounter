package com.ua.foxminded.charcounter;

import java.util.HashMap;

public class CounterPrinter {

  public void print(CounterChars counterChars) {
    System.out.print(formatCounterChars(counterChars));
  }

  String formatCounterChars(CounterChars counterChars) {
    HashMap<Character, Integer> mapChars = counterChars.getUniqueCharsString();
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
