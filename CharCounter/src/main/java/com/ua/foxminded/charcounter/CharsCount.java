package com.ua.foxminded.charcounter;

import java.util.Map;

public class CharsCount {
  
  private final Map<Character, Integer> uniqueCharsString;
  private final char[] charsString;

  CharsCount(Map<Character, Integer> counterCharsString, char[] charsString) {
    this.uniqueCharsString = counterCharsString;
    this.charsString = charsString;
  }

  public final Map<Character, Integer> getUniqueCharsString() {
    return uniqueCharsString;
  }

  public final char[] getCharsString() {
    return charsString;
  }
}
