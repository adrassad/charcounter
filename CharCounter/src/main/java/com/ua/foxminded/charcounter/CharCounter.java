package com.ua.foxminded.charcounter;

import java.util.HashMap;

public class CharCounter {
  CounterChars generateCounterChars(String sentence) {
    char[] charsSentence = sentence.toCharArray();
    HashMap<Character, Integer> mapChars = new HashMap<Character, Integer>();
    for (char charSentence : charsSentence) {
      int countChars = 0;
      if (mapChars.containsKey(charSentence)) {
        countChars = mapChars.get(charSentence);
      }
      countChars++;
      mapChars.put(charSentence, countChars);
    }
    CounterChars counterChars = new CounterChars(mapChars, charsSentence);
    return counterChars;
  }
}
