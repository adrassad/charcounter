package com.ua.foxminded.charcounter;

import java.util.HashMap;
import java.util.Map;

public class CharCounterCaсhe {

  static Map<String, CharsCount> cacheCounter = new HashMap<String, CharsCount>();

  public static CharsCount getCacheCounter(String sentence) {
    return cacheCounter.get(sentence);
  }

  public static void setCacheCounter(String sentence, CharsCount charsCount) {
    CharCounterCaсhe.cacheCounter.put(sentence, charsCount);
  }

}