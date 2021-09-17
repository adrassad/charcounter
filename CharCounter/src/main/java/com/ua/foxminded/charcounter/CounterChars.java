package com.ua.foxminded.charcounter;

import java.util.HashMap;

public class CounterChars {
  
  private final HashMap<Character, Integer> uniqueCharsString;
  private final char[] charsString;

  CounterChars(HashMap<Character, Integer> counterCharsString, char[] charsString) {
    this.uniqueCharsString = counterCharsString;
    this.charsString = charsString;
  }

  public final HashMap<Character, Integer> getUniqueCharsString() {
    return uniqueCharsString;
  }

  public final char[] getCharsString() {
    return charsString;
  }
}
